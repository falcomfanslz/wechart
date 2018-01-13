/**
 * Copyright (C), 2015-2018, kiseki
 * FileName: CheckUtil
 * Author: lizhuo
 * Date: 2018/1/13 11:04
 * Description: 校验类
 */
package com.kiseki.wechart.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Value;

import java.util.Arrays;

/**
 * <br>
 * 〈校验类〉
 *  @author lizhuo
 * @create 2018/1/13
 * @since 1.0.0
 */
public class CheckUtil {
    @Value("${wechart.token}")
    private static final String token = "weixin";
    public static boolean checkSignature(String signature,String timestamp,String nonce){

        String[] arr = new String[] { token, timestamp, nonce };

        // 排序
        Arrays.sort(arr);
        // 生成字符串
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            content.append(arr[i]);
        }

        // sha1加密
        String temp = getSHA1String(content.toString());
        // 与微信传递过来的签名进行比较
        return temp.equals(signature);
    }

    private static String getSHA1String(String data){
        // 使用commons codec生成sha1字符串
        return DigestUtils.sha1Hex(data);
    }
}
