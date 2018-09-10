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
 * 首页广告类型3
 * 用到的数据 Name、Title、Image、ImageLink
 * Created by Junnan on 2018/3/14.
 */

public class Content_3_ItemView extends ItemViewFactory<IndexContentModel, Content_3_ItemView.Content_3_ViewHolder> {

    public Content_3_ItemView(Context context, IndexContentModel data) {
        super(context, data);
    }

    @Override
    public Content_3_ViewHolder onCreateViewHolder(Context context, ViewGroup parent) {
        return new Content_3_ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_index_ad_contentl3, parent, false));
    }

    @Override
    public void onBindViewHolder(Context context, Content_3_ViewHolder holder, IndexContentModel data) {
        if (data != null){
            //显示数据
        }
    }


    static class Content_3_ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvTitle)
        TextView tvTitle;
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
        @BindView(R.id.tvBtnBottom)
        TextView tvBtnBottom;
        @BindView(R.id.llBottomMore)
        LinearLayout llBottomMore;

        Content_3_ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

}
