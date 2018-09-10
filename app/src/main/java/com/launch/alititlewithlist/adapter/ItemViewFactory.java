package com.launch.alititlewithlist.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * 多视图布局工厂类
 * D : 数据类型
 * H : viewHold
 * Created by Junnan on 2017/1/23.
 */

public abstract class ItemViewFactory<D, H extends RecyclerView.ViewHolder> {
    D mData;                                        //数据
    private RecyclerView.Adapter mAdapter;          //适配器
    private Context mContext;                       //上下文
    public int mPosition;                           //当前位置

    /**
     * 工厂初始化
     * @param context
     * @param data
     */
    public ItemViewFactory(Context context, D data) {
        this.mData = data;
        this.mContext = context;
    }

    /**
     * 内部创建viewHold
     * 不加修饰符，只供内部使用，禁止外部调用
     * @param parent
     * @return
     */
    H innerCreateVH(ViewGroup parent) {
        return onCreateViewHolder(mContext, parent);
    }

    /**
     * 内部绑定viewHold
     * @param holder
     * @param position
     */
    void innerBindVH(RecyclerView.ViewHolder holder, int position) {
        mPosition = position;
        //视图绑定， 在子类中实现
        onBindViewHolder(mContext, ((H) holder), mData);
    }

    /**
     * 修改当前适配器
     * @param adapter
     */
    void attachAdapter(RecyclerView.Adapter adapter) {
        mAdapter = adapter;
    }

    protected void refresh(D data) {
        resetData(data);
        if (mAdapter != null) {
            mAdapter.notifyItemChanged(mPosition);
        }
    }

    protected void resetData(D data) {
        this.mData = data;
    }

    public abstract H onCreateViewHolder(Context context, ViewGroup parent);

    public abstract void onBindViewHolder(Context context, H holder, D data);
}
