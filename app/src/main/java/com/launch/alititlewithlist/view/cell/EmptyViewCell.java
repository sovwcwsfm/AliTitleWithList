package com.launch.alititlewithlist.view.cell;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.launch.alititlewithlist.AppUtil;
import com.launch.alititlewithlist.R;
import com.launch.alititlewithlist.adapter.ItemViewFactory;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 占空
 */
public class EmptyViewCell extends ItemViewFactory<Integer, EmptyViewCell.EmptyViewCell_ViewHolder> {

    public EmptyViewCell(Context context, Integer height) {
        super(context, height);
    }

    @Override
    public EmptyViewCell_ViewHolder onCreateViewHolder(Context context, ViewGroup parent) {
        return new EmptyViewCell_ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_item_empty, parent, false));
    }

    @Override
    public void onBindViewHolder(Context context, EmptyViewCell_ViewHolder holder, Integer data) {
        //设置暂空留白
        ViewGroup.LayoutParams params = holder.emptyView.getLayoutParams();
        params.height = AppUtil.dip2px(data);
        holder.emptyView.setLayoutParams(params);
    }

    static class EmptyViewCell_ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.emptyView)
        View emptyView;

        public EmptyViewCell_ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
