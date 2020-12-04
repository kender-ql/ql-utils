package com.ql.qlutils.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * 生成uuid
 *
 * @Author hejiang
 * @Version 1.0.0 RELEASE
 * @Date 2020/4/21 17:55
 * @Description:
 */
public class IDUtils {

    public static final Logger logger = LoggerFactory.getLogger(IDUtils.class);

    public static void main(String[] args) {
        System.out.println(getUuid());
        logger.debug("test");
    }

    public static String getUuid(){
        return UUID.randomUUID().toString().replace("-","");
    }

}
