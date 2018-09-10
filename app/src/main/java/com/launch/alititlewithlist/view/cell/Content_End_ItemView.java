package com.launch.alititlewithlist.view.cell;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.launch.alititlewithlist.R;
import com.launch.alititlewithlist.adapter.ItemViewFactory;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 首页广告类型7
 * Created by Junnan on 2018/3/14.
 */

public class Content_End_ItemView extends ItemViewFactory<String, Content_End_ItemView.Content_End_ViewHolder> {

    public Content_End_ItemView(Context context, String data) {
        super(context, data);
    }

    @Override
    public Content_End_ViewHolder onCreateViewHolder(Context context, ViewGroup parent) {
        return new Content_End_ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_index_ad_content_end, parent, false));
    }

    @Override
    public void onBindViewHolder(Context context, Content_End_ViewHolder holder, String data) {

    }


    static class Content_End_ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvTip)
        TextView tvTip;

        Content_End_ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
