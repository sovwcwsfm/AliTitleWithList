package com.launch.alititlewithlist.view.cell;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.launch.alititlewithlist.R;
import com.launch.alititlewithlist.adapter.ItemViewFactory;
import com.launch.alititlewithlist.model.IndexContentModel;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 首页广告类型6
 * 用到的数据 Title、ContentTitle、ContentDesc、Image、ImageLink、Tags
 * Created by Junnan on 2018/3/14.
 */

public class Content_7_ItemView extends ItemViewFactory<IndexContentModel, Content_7_ItemView.Content_7_ViewHolder> {

    public Content_7_ItemView(Context context, IndexContentModel data) {
        super(context, data);
    }

    @Override
    public Content_7_ViewHolder onCreateViewHolder(Context context, ViewGroup parent) {
        return new Content_7_ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_index_ad_contentl7, parent, false));
    }

    @Override
    public void onBindViewHolder(Context context, Content_7_ViewHolder holder, IndexContentModel data) {
        if (data != null){
            //显示数据
        }
    }


    static class Content_7_ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvTitle)
        TextView tvTitle;
        @BindView(R.id.image1)
        ImageView image1;
        @BindView(R.id.tvTip1)
        TextView tvTip1;
        @BindView(R.id.tvDes1)
        TextView tvDes1;
        @BindView(R.id.llLabel1)
        LinearLayout llLabel1;
//        @BindView(R.id.tvLabel1_1)
//        TextView tvLabel11;
//        @BindView(R.id.tvLabel1_2)
//        TextView tvLabel12;
//        @BindView(R.id.tvLabel1_3)
//        TextView tvLabel13;
        @BindView(R.id.rlBtn1)
        RelativeLayout rlBtn1;
        @BindView(R.id.image2)
        ImageView image2;
        @BindView(R.id.tvTip2)
        TextView tvTip2;
        @BindView(R.id.tvDes2)
        TextView tvDes2;
        @BindView(R.id.llLabel2)
        LinearLayout llLabel2;
//        @BindView(R.id.tvLabel2_1)
//        TextView tvLabel21;
//        @BindView(R.id.tvLabel2_2)
//        TextView tvLabel22;
//        @BindView(R.id.tvLabel2_3)
//        TextView tvLabel23;
        @BindView(R.id.rlBtn2)
        RelativeLayout rlBtn2;
        @BindView(R.id.image3)
        ImageView image3;
        @BindView(R.id.tvTip3)
        TextView tvTip3;
        @BindView(R.id.tvDes3)
        TextView tvDes3;
        @BindView(R.id.llLabel3)
        LinearLayout llLabel3;
//        @BindView(R.id.tvLabel3_1)
//        TextView tvLabel31;
//        @BindView(R.id.tvLabel3_2)
//        TextView tvLabel32;
//        @BindView(R.id.tvLabel3_3)
//        TextView tvLabel33;
        @BindView(R.id.rlBtn3)
        RelativeLayout rlBtn3;
        @BindView(R.id.llBottomMore)
        LinearLayout llBottomMore;

        Content_7_ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
