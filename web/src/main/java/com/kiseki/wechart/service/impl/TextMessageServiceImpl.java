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
import com.thoughtworks.xstream.XStream;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
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
        TextMessage textMessage = null;
        try {
            textMessage = parseXml(httpServletRequest);
        }catch (Exception e){
            e.printStackTrace();
        }

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
    public static TextMessage parseXml(HttpServletRequest request) throws Exception {
        TextMessage textMessage = null;

        // 从request中取得输入流
        InputStream inputStream = request.getInputStream();
        // 读取输入流
        SAXReader reader = new SAXReader();
        Document document = reader.read(inputStream);
        // 得到xml根元素
        Element root = document.getRootElement();
        // 得到根元素的所有子节点
        List<Element> elementList = root.elements();

        try {
            JAXBContext context = JAXBContext.newInstance(TextMessage.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            textMessage = (TextMessage)unmarshaller.unmarshal(new StringReader(root.getStringValue()));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        // 释放资源
        inputStream.close();

        return textMessage;
    }
     private String beanToXml(Object obj){
         // 使用XStream将实体类的实例转换成xml格式
         XStream xstream = new XStream();
         // 将xml的默认根节点替换成“xml”
         xstream.alias("xml", obj.getClass());
         return xstream.toXML(obj);
     }
}
