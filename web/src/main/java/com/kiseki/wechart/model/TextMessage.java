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
    private String toUserName;
    private String fromUserName;
    private Long createTime;
    private String msgType;
    private String content;
    private Long msgId;

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }
}
