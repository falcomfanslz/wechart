/**
 * Copyright (C), 2015-2018, kiseki
 * FileName: ApiController
 * Author: lizhuo
 * Date: 2018/1/13 10:45
 * Description: Api控制器
 */
package com.kiseki.wechart.controller;

import com.kiseki.wechart.service.TextMessageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.weixin4j.WeixinException;
import org.weixin4j.spi.HandlerFactory;
import org.weixin4j.spi.IMessageHandler;

import javax.annotation.Resource;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * <br>
 * 〈Api控制器〉
 *  @author lizhuo
 * @create 2018/1/13
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    @Resource
    TextMessageService textMessageService;
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String wx(String signature, String timestamp, String nonce, String echostr){
        return echostr;
    }
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postWx(HttpServletRequest httpServletRequest) throws IOException, WeixinException {
        ServletInputStream in = httpServletRequest.getInputStream();
        IMessageHandler messageHandler = HandlerFactory.getMessageHandler();
        String result = messageHandler.invoke(in);
        return result;
    }
}
