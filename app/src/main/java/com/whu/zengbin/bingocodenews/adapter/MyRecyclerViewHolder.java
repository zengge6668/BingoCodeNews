/*
 *
 *  *
 *  *  *
 *  *  *  * ===================================
 *  *  *  * Copyright (c) 2016.
 *  *  *  * 作者：安卓猴
 *  *  *  * 微博：@安卓猴
 *  *  *  * 博客：http://sunjiajia.com
 *  *  *  * Github：https://github.com/opengit
 *  *  *  *
 *  *  *  * 注意**：如果您使用或者修改该代码，请务必保留此版权信息。
 *  *  *  * ===================================
 *  *  *
 *  *  *
 *  *
 *
 */

package com.whu.zengbin.bingocodenews.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.whu.zengbin.bingocodenews.R;

/**
 * Created by Monkey on 2015/6/29.
 */
public class MyRecyclerViewHolder extends RecyclerView.ViewHolder {

  public TextView mTextView;
  public ImageView mIconImg;
  public TextView mTimeTv;
  public CardView mCardview;
  public ImageView mSaveImg;

  public MyRecyclerViewHolder(View itemView) {
    super(itemView);
    mTextView = (TextView) itemView.findViewById(R.id.id_textview);
    mIconImg = (ImageView) itemView.findViewById(R.id.icon_catagory);
    mTimeTv = (TextView) itemView.findViewById(R.id.tv_time);
    mCardview = (CardView) itemView.findViewById(R.id.id_cardview);
    mSaveImg = (ImageView) itemView.findViewById(R.id.img_save);

  }
}
