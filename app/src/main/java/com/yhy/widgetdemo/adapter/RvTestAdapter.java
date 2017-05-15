package com.yhy.widgetdemo.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HongYi Yan on 2017/4/12 13:39.
 */
public class RvTestAdapter extends RecyclerView.Adapter<RvTestAdapter.ViewHolder> {
    private Context mCtx;
    private List<String> mDataList;

    public RvTestAdapter(Context ctx, List<String> dataList) {
        mCtx = ctx;
        mDataList = dataList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(new TextView(mCtx));
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.mTv.setText(mDataList.get(i));
    }

    @Override
    public int getItemCount() {
        return null != mDataList ? mDataList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTv;
        private RecyclerView.LayoutParams mParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        public ViewHolder(View itemView) {
            super(itemView);
            mTv = (TextView) itemView;
            mParams.topMargin = 12;
            mParams.bottomMargin = 12;
            mTv.setLayoutParams(mParams);
            mTv.setTextSize(16);
            mTv.setBackgroundColor(Color.WHITE);
            mTv.setGravity(Gravity.CENTER);
            mTv.setPadding(24, 24, 24, 24);
        }
    }
}
