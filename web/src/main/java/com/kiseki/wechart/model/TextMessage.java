/**
 * Copyright (C), 2015-2018, kiseki
 * FileName: TextMessage
 * Author: lizhuo
 * Date: 2018/1/13 13:46
 * Description: 文本消息
 */
package com.kiseki.wechart.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <br>
 * 〈文本消息〉
 *  @author lizhuo
 * @create 2018/1/13
 * @since 1.0.0
 */
@XmlRootElement(name="xml")
public class TextMessage {
    private String ToUserName;
    private String FromUserName;
    private Long CreateTime;
    private String MsgType;
    private String Content;
    private Long MsgId;
    public TextMessage(){

    }
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

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Long getMsgId() {
        return MsgId;
    }

    public void setMsgId(Long msgId) {
        MsgId = msgId;
    }
}
