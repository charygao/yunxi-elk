package com.yunxi.elk.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Michael
 * @Date 2018/7/3
 * @Description 测试使用log4j2输出日志到logstash
 */
public class ElkLoggerDemo {

    private static final Logger logger = LoggerFactory.getLogger(ElkLoggerDemo.class);

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            logger.info("输出info,i={}", i);
            logger.debug("输出debug,i={}", i);
            logger.error("输出error,i={}", i);
        }
    }
}
