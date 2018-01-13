/**
 * Copyright (C), 2015-2018, 车好多旧机动车经纪(北京)有限公司
 * FileName: TextMessageResponce
 * Author: lizhuo
 * Date: 2018/1/13 13:55
 * Description: 信息回执
 */
package com.kiseki.wechart.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <br>
 * 〈信息回执〉
 *  @author lizhuo
 * @create 2018/1/13
 * @since 1.0.0
 */
@XmlRootElement(name = "xml")
public class TextMessageResponce {
    private String toUserName;
    private String fromUserName;
    private Long createTime;
    private String msgType;
    private String content;

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
}
