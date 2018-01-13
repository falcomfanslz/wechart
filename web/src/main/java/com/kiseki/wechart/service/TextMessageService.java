package com.kiseki.wechart.service;

import org.springframework.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

public interface TextMessageService {
    String getTextMessage(HttpServletRequest httpServletRequest);
}
