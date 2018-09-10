# AliTitleWithList
仿阿里头部滑动及列表多布局实现

![img](/gif/eg.gif)

关于多布局实现那些事
# 原有实现方式：
1. 在Adapter的onBindViewHolder(RecycleView中)/getView(listView中)，通过数据的Flag展示不同的界面
    例如：
    ```js
    public void onBindViewHolder(ViewHolder holder, final int position){
        final BannerListBean banner = mList.get(position);
        //判断广告样式
        switch (banner.getType()){
            case "1":
                //TODO show item1
                break;
            case "2":
                //TODO show item2
                break;
        }
    }
    ```
2. ScrollView + LinearLayout 获取到一个item的数据，往LinearLayout中add一个特定的view
    例如：
    ```
    LinearLayout.addView(LayoutInflater.from(mContext).inflate(R.layout.item_index_ad_content1,null));
    ```
3. 调用第三方框架如：[BRVAH](https://github.com/CymChad/BaseRecyclerViewAdapterHelper)   很好很强大。

4. 在RecycleView中有getItemViewType方法在onCreateViewHolder之前先设置当前item的类型在onCreateViewHolder创建的时候获取到Type值对不同的Type创建不同的ViewHolder
    本文中的多布局就是基于改思路做的一些相关的封装
    
#相关使用 
1. 为每种类型的item创建一个对应的视图模板，继承ItemViewFactory这个工厂类
    如 [Content_1_ItemView](/app/src/main/java/com/launch/alititlewithlist/view/cell/Content_1_ItemView.java)
2. 多布局示例
    ```
    MultiTypeRecyclerAdapter adapter = new MultiTypeRecyclerAdapter();
    List<ItemViewFactory> datas = new ArrayList<>();
    
    datas.add(new Content_1_ItemView(activity, dataModel));
    ...
    datas.add(new Content_6_ItemView(activity, dataModel));
    
    adapter.setData(itemList);
    recycleView.setAdapter(adapter);
    ```
3. 单布局示例
    为了兼容原来的单布局的模式，封装了一个入口用于单布局显示
    ```
    List<DataModel> datas;          //列表中需要显示的数据模型
    adapter.singleData(activity, Content_1_ItemView.class, DataModel.class, datas);
    ```
    