/**
 * Copyright (C), 2015-2018, kiseki
 * FileName: TextMessageServiceImpl
 * Author: lizhuo
 * Date: 2018/1/13 13:52
 * Description: 接收信息服务
 */
package com.kiseki.wechart.service.impl;


import com.kiseki.wechart.model.TextMessage;
import com.kiseki.wechart.model.TextMessageResponce;
import com.kiseki.wechart.service.TextMessageService;
import com.kiseki.wechart.util.MessageUtil;
import com.thoughtworks.xstream.XStream;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * <br>
 * 〈接收信息服务〉
 *  @author lizhuo
 * @create 2018/1/13
 * @since 1.0.0
 */
@Service
public class TextMessageServiceImpl implements TextMessageService{
    @Override
    public String getTextMessage(HttpServletRequest httpServletRequest) {
        TextMessage textMessage = new TextMessage();

        Map<String, String> xmlMap = MessageUtil.xmlToMap(httpServletRequest);

        textMessage.setContent(xmlMap.get("Content"));
        textMessage.setMsgId(xmlMap.get("MsgId"));
        textMessage.setToUserName(xmlMap.get("ToUserName"));
        textMessage.setFromUserName(xmlMap.get("FromUserName"));
        textMessage.setCreateTime(Long.valueOf(xmlMap.get("CreateTime")));
        textMessage.setMsgType(xmlMap.get("MsgType"));

        TextMessageResponce responce = new TextMessageResponce();
        responce.setToUserName(textMessage.getFromUserName());
        responce.setFromUserName(textMessage.getToUserName());
        responce.setCreateTime(System.currentTimeMillis());
        responce.setMsgType("text");
        responce.setContent("你说的是:" + textMessage.getContent());

        String result = beanToXml(responce);
        System.out.println(result);
        return result;
    }
     private String beanToXml(Object obj){
         // 使用XStream将实体类的实例转换成xml格式
         XStream xstream = new XStream();
         // 将xml的默认根节点替换成“xml”
         xstream.alias("xml", obj.getClass());
         return xstream.toXML(obj);
     }
}
