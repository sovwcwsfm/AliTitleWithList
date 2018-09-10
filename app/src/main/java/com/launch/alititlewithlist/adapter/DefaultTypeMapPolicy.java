package com.launch.alititlewithlist.adapter;


import java.util.ArrayList;
import java.util.List;

/**
 * 默认多布局的方式
 */

public class DefaultTypeMapPolicy implements TypeMapPolicy {

    //布局类型列表
    private List<ItemViewFactory> mTypesMapping = new ArrayList<>();

    /**
     * 获取当前布局类型索引
     * @param item
     * @return
     */
    @Override
    public int toType(ItemViewFactory item) {
        Class<?> clz = item.getClass();

        //遍历当前已保存的所有类型
        //已存在返回当前类型索引
        for (int i = mTypesMapping.size() - 1; i > -1; i--) {
            ItemViewFactory itemViewFactory = mTypesMapping.get(i);
            if (itemViewFactory.getClass() == clz) {
                return i;
            }
        }
        //不存在， 添加至列表中
        mTypesMapping.add(item);
        //返回新增的索引
        return mTypesMapping.size() - 1;
    }

    /**
     * 通过索引获取当前的布局
     * @param viewType
     * @return
     */
    @Override
    public ItemViewFactory toItemView(int viewType) {
        return mTypesMapping.get(viewType);
    }
}
