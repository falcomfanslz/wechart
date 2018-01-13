/**
 * Copyright (C), 2015-2018, kiseki
 * FileName: ApiController
 * Author: lizhuo
 * Date: 2018/1/13 10:45
 * Description: Api控制器
 */
package com.kiseki.wechart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("")
    public String wx(String signature, String timestamp, String nonce, String echostr){
        return echostr;
    }
}
