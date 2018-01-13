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
    private String ToUserName;
    private String FromUserName;
    private Long CreateTime;
    private String MsgType;
    private String Content;

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
}
