/**
 * Copyright (C), 2015-2018, kiseki
 * FileName: BaseMessage
 * Author: lizhuo
 * Date: 2018/1/13 14:37
 * Description: 基本信息类
 */
package com.kiseki.wechart.model;

/**
 * <br>
 * 〈基本信息类〉
 *  @author lizhuo
 * @create 2018/1/13
 * @since 1.0.0
 */
public class BaseMessage {
    protected String ToUserName;
    protected String FromUserName;
    protected Long CreateTime;
    protected String MsgType;

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public Long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }
}
