/**
 * Copyright (C), 2015-2018, kiseki
 * FileName: TextMessage
 * Author: lizhuo
 * Date: 2018/1/13 13:46
 * Description: 文本消息
 */
package com.kiseki.wechart.model;

/**
 * <br>
 * 〈文本消息〉
 *  @author lizhuo
 * @create 2018/1/13
 * @since 1.0.0
 */
public class TextMessage extends BaseMessage{
    //文本消息内容
    private String Content;
    //消息id，64位整型
    private String MsgId;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getMsgId() {
        return MsgId;
    }

    public void setMsgId(String msgId) {
        MsgId = msgId;
    }
}
