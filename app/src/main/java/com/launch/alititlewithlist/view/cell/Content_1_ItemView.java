package com.launch.alititlewithlist.view.cell;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.launch.alititlewithlist.R;
import com.launch.alititlewithlist.adapter.ItemViewFactory;
import com.launch.alititlewithlist.model.IndexContentModel;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 首页广告类型1
 * 用到的数据 Name、Image、ImageLink
 * Created by Junnan on 2018/3/14.
 */

public class Content_1_ItemView extends ItemViewFactory<IndexContentModel, Content_1_ItemView.Content_1_ViewHolder> {

    public Content_1_ItemView(Context context, IndexContentModel data) {
        super(context, data);
    }

    @Override
    public Content_1_ViewHolder onCreateViewHolder(Context context, ViewGroup parent) {
        return new Content_1_ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_index_ad_contentl1, parent, false));
    }

    @Override
    public void onBindViewHolder(Context context, Content_1_ViewHolder holder, IndexContentModel data) {

    }


    static class Content_1_ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.image1)
        ImageView image1;
        @BindView(R.id.tvTip1)
        TextView tvTip1;
        @BindView(R.id.llBtn1)
        LinearLayout llBtn1;
        @BindView(R.id.image2)
        ImageView image2;
        @BindView(R.id.tvTip2)
        TextView tvTip2;
        @BindView(R.id.llBtn2)
        LinearLayout llBtn2;
        @BindView(R.id.image3)
        ImageView image3;
        @BindView(R.id.tvTip3)
        TextView tvTip3;
        @BindView(R.id.llBtn3)
        LinearLayout llBtn3;
        @BindView(R.id.image4)
        ImageView image4;
        @BindView(R.id.tvTip4)
        TextView tvTip4;
        @BindView(R.id.llBtn4)
        LinearLayout llBtn4;

        Content_1_ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

}
