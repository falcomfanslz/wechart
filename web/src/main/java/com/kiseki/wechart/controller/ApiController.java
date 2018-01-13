/**
 * Copyright (C), 2015-2018, kiseki
 * FileName: ApiController
 * Author: lizhuo
 * Date: 2018/1/13 10:45
 * Description: Api控制器
 */
package com.kiseki.wechart.controller;

import com.kiseki.wechart.model.TextMessage;
import com.kiseki.wechart.service.TextMessageService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    @RequestMapping(value = "", method = RequestMethod.POST, headers = {"content-type=application/xml"})
    public String postWx(@RequestBody TextMessage textMessage){
        return textMessageService.getTextMessage(textMessage);
    }
}
