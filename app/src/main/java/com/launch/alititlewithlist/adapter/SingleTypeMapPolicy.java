package com.launch.alititlewithlist.adapter;


import java.util.ArrayList;
import java.util.List;

/**
 * 单布局的方式
 */

public class SingleTypeMapPolicy implements TypeMapPolicy {

    //布局类型列表
    private ItemViewFactory item;

    /**
     * 获取当前布局类型索引
     * @param item
     * @return
     */
    @Override
    public int toType(ItemViewFactory item) {
        this.item = item;
        //返回新增的索引
        return 0;
    }

    /**
     * 通过索引获取当前的布局
     * @param viewType
     * @return
     */
    @Override
    public ItemViewFactory toItemView(int viewType) {
        return item;
    }
}
