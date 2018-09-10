package com.launch.alititlewithlist.view.cell;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.launch.alititlewithlist.R;
import com.launch.alititlewithlist.adapter.ItemViewFactory;
import com.launch.alititlewithlist.model.IndexContentModel;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 首页广告类型5
 * 用到的数据 Title、ContentTitle、ContentDesc、Image、ImageLink
 * Created by Junnan on 2018/3/14.
 */

public class Content_5_ItemView extends ItemViewFactory<IndexContentModel, Content_5_ItemView.Content_5_ViewHolder> {

    public Content_5_ItemView(Context context, IndexContentModel data) {
        super(context, data);
    }

    @Override
    public Content_5_ViewHolder onCreateViewHolder(Context context, ViewGroup parent) {
        return new Content_5_ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_index_ad_contentl5, parent, false));
    }

    @Override
    public void onBindViewHolder(Context context, Content_5_ViewHolder holder, IndexContentModel data) {
        if (data != null){
            //显示数据
        }
    }


    static class Content_5_ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvTitle)
        TextView tvTitle;
        @BindView(R.id.image1)
        ImageView image1;
        @BindView(R.id.tvTip1)
        TextView tvTip1;
        @BindView(R.id.tvDes1)
        TextView tvDes1;
        @BindView(R.id.rlBtn1)
        RelativeLayout rlBtn1;
        @BindView(R.id.image2)
        ImageView image2;
        @BindView(R.id.tvTip2)
        TextView tvTip2;
        @BindView(R.id.tvDes2)
        TextView tvDes2;
        @BindView(R.id.rlBtn2)
        RelativeLayout rlBtn2;

        Content_5_ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
