package com.launch.alititlewithlist.adapter;

/**
 * 布局适配器接口
 * Created by junnan on 2017/1/23.
 */

public interface TypeMapPolicy {
    int toType(ItemViewFactory viewFactory);

    ItemViewFactory toItemView(int type);
}
