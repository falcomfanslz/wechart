/**
 * Copyright (C), 2015-2018, kiseki
 * FileName: TextMessageServiceImpl
 * Author: lizhuo
 * Date: 2018/1/13 13:52
 * Description: 接收信息服务
 */
package com.kiseki.wechart.service.impl;


import com.kiseki.wechart.model.TextMessageResponce;
import com.kiseki.wechart.model.TextMessage;
import com.kiseki.wechart.service.TextMessageService;
import com.thoughtworks.xstream.XStream;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

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
    public String getTextMessage(TextMessage textMessage) {
        TextMessageResponce responce = new TextMessageResponce();
        responce.setToUserName(textMessage.getFromUserName());
        responce.setFromUserName(textMessage.getToUserName());
        responce.setCreateTime(System.currentTimeMillis());
        responce.setMsgType("text");
        responce.setContent("你说的是:" + textMessage.getContent());

        return beanToXml(responce);
    }

     private String beanToXml(Object obj){
         // 使用XStream将实体类的实例转换成xml格式
         XStream xstream = new XStream();
         // 将xml的默认根节点替换成“xml”
         xstream.alias("xml", obj.getClass());
         return xstream.toXML(obj);
     }
}
