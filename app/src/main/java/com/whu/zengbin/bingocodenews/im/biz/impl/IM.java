package com.whu.zengbin.bingocodenews.im.biz.impl;

import com.whu.zengbin.bingocodenews.im.bean.BaseResponse;
import com.whu.zengbin.bingocodenews.im.bean.Msg;
import com.whu.zengbin.bingocodenews.im.bean.MsgListResponse;
import com.whu.zengbin.bingocodenews.callback.CallBackListener;
import com.whu.zengbin.bingocodenews.im.biz.IIM;
import com.whu.zengbin.bingocodenews.im.biz.MsgListener;

/**
 * 创建时间: 2018/10/22 12:26 <br>
 * 作者: zengbin <br>
 * 描述:
 */
public class IM implements IIM {

  private volatile static IM mInstance;

  private IM() {
  }

  public static IM getInstance() {
    if (mInstance == null) {
      synchronized (IM.class) {
        if (mInstance == null) {
          mInstance = new IM();
        }
      }
    }
    return mInstance;
  }
  /**
   * 进入IM
   *
   * @param topic         需要监听的topic
   * @param IMMsgListener 新消息到达监听
   * @param callback      结果回调
   */
  @Override
  public void enterIM(long topic, MsgListener IMMsgListener, CallBackListener callback) {

  }

  /**
   * 退出IM
   *
   * @param topic         需要取消监听的topic
   * @param IMMsgListener 新消息到达监听
   * @param callback      结果回调
   */
  @Override
  public void quitIM(long topic, MsgListener IMMsgListener,
      CallBackListener<BaseResponse> callback) {

  }

  /**
   * 发送IM消息
   *
   * @param msg      IM消息对象
   * @param callBack 请求回调
   */
  @Override
  public void sendIMMsg(Msg msg, CallBackListener callBack) {

  }

  /**
   * 拉取消息
   *
   * @param topic_id     指定要拉取的topic
   * @param start_msg_id 指定要拉取的消息起点msg_id 传0或正数表示拉取消息起点，将返回自start_msg_id开始（不包含start_msg_id）的指定条数的信息
   *                     传-1表示从最新消息开始拉取
   * @param limit        指定拉取消息条数，limit不大于100，不小于1。返回条数尽力满足该值。
   * @param callBack     请求回调
   */
  @Override
  public void fetchIMMsgs(long topic_id, long start_msg_id, int limit,
      CallBackListener<MsgListResponse> callBack) {

  }
}
