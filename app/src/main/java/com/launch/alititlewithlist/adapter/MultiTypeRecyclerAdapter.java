package com.launch.alititlewithlist.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.launch.alititlewithlist.view.cell.EmptyViewCell;

import java.util.ArrayList;
import java.util.List;

/**
 * 子类型Item 适配器
 * Created by Junnan on 2017/1/12.
 */

public class MultiTypeRecyclerAdapter extends RecyclerView.Adapter {
    public static String TAG = MultiTypeRecyclerAdapter.class.getName();
    //当前要显示的所有视图布局
    private List<ItemViewFactory> mItemViewList = new ArrayList<>();
    //自定义视图相关策略
    private TypeMapPolicy mTypeMapPolicy = new DefaultTypeMapPolicy();

    //获取当前的视图类型
    @Override
    public int getItemViewType(int position) {
        //当前布局类型
        ItemViewFactory item = mItemViewList.get(position);
        return mTypeMapPolicy.toType(item);
    }

    //设定指定的视图策略
    public void setTypeMapPolicy(TypeMapPolicy typeMapPolicy) {
        mTypeMapPolicy = typeMapPolicy;
    }

    //单布局封装
    //T 自定义布局Cell
    //dataT Model
    //datas 数据源
    //顶部留白高度        单位 dp
    //底部留白高度        单位 dp
    public void singleData(Context context, Class<? extends ItemViewFactory> cellT, Class dataT, List datas,int marginTop, int marginBottom){
        if (datas == null || datas.isEmpty()){
            return;
        }

        List<ItemViewFactory> cardItemList = new ArrayList<>();

        if (marginTop != 0){
            //设置留白
            cardItemList.add(new EmptyViewCell(context, marginTop));
        }

        //反射 初始化
        for (int i = 0; i < datas.size(); i++){
            try {
                //反射 获取构造Cell初始化函数
                //实例化后添加到队列中
                cardItemList.add(cellT.getConstructor(Context.class, dataT).newInstance(context, datas.get(i)));
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        if (marginBottom != 0){
            //设置留白
            cardItemList.add(new EmptyViewCell(context, marginBottom));
        }

        //清除原有数据
        mItemViewList.clear();
        //显示数据
        appendData(cardItemList);
    }

    //单布局封装 前后不留白
    //T 自定义布局Cell
    //dataT Model
    //datas 数据源
    public void singleData(Context context, Class<? extends ItemViewFactory> T, Class dataT, List datas){
        singleData(context, T, dataT, datas,0, 0);
    }

    //绑定数据 多布局
    public void setData(List<ItemViewFactory> datas) {
        if (datas == null || datas.isEmpty()) {
            return;
        }
        mItemViewList.clear();

        appendData(datas);
    }

    //显示数据 多布局
    public void appendData(List<ItemViewFactory> datas) {
        if (datas == null || datas.isEmpty()) {
            return;
        }
        for (ItemViewFactory item : datas) {
            if (item == null) {
                continue;
            }
            mItemViewList.add(item);
            item.attachAdapter(this);
        }
        notifyDataSetChanged();
    }

    /**
     * 视图绑定
     * @param parent
     * @param viewType -> 对应到getItemViewType中的返回参数
     * @return
     */
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //交给子视图创建viewHold
        return mTypeMapPolicy.toItemView(viewType).innerCreateVH(parent);
    }

    /**
     * 数据绑定
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //新建一个对象用于数据绑定
        ItemViewFactory viewFactory = mItemViewList.get(position);
        //在ItemView中显示数据
        viewFactory.innerBindVH(holder, position);
    }

    @Override
    public int getItemCount() {
        return mItemViewList.size();
    }


}
