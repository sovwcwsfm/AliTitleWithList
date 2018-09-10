package com.launch.alititlewithlist.view.cell;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.launch.alititlewithlist.R;
import com.launch.alititlewithlist.adapter.ItemViewFactory;
import com.launch.alititlewithlist.model.IndexContentModel;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 首页广告类型2 轮播图
 * 用到的数据 Image、ImageLink
 * Created by Junnan on 2018/3/14.
 */

public class Content_2_ItemView extends ItemViewFactory<IndexContentModel, Content_2_ItemView.Content_2_ViewHolder> {

    public Content_2_ItemView(Context context, IndexContentModel data) {
        super(context, data);
    }

    //视图绑定
    @Override
    public Content_2_ViewHolder onCreateViewHolder(Context context, ViewGroup parent) {
        return new Content_2_ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_index_ad_contentl2, parent, false));
    }

    //数据绑定
    @Override
    public void onBindViewHolder(Context context, Content_2_ViewHolder holder, IndexContentModel data) {
    }


    static class Content_2_ViewHolder extends RecyclerView.ViewHolder {


        Content_2_ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
