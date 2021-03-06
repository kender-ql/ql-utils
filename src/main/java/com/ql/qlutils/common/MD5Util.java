package com.ql.qlutils.common;

import org.springframework.util.DigestUtils;

import java.math.BigDecimal;

/**
 * MD5加盐加密
 *
 * @Author jiang.he
 * @Version 1.0.0 RELEASE
 * @Date 2020/8/13 22:15
 * @Description:
 */

public class MD5Util {
    //盐，用于混交md5
    private static final String SLAT = "qwerty";

    private static final int EXCEEDED = 10;

//    private final static String SALT = randomSalt();

    private final static String SALT = "0123456789abcdefghijklmnopqrstuvwxyz+-*/";

    public static void main(String[] args) {
        System.out.println(getMd5("123456"));
        System.out.println(getMd5("123456").equals(getMd5("123456")));
    }

    /**
     * 进行md5加密
     *
     * @param str str
     * @return 加密后的结果
     */
    public static String getMd5(String str) {
        String base = str + "/" + SALT;
        return DigestUtils.md5DigestAsHex(base.getBytes());
    }

    /**
     * 随机盐不靠谱
     *
     * @return 盐
     */
    private static String randomSalt() {
        char[] saltArr = new char[MD5Util.EXCEEDED];
        for (int i = 0; i < saltArr.length; i++) {
            saltArr[i] = (char) getRandom();
        }
        return String.valueOf(saltArr);
    }

    private static int getRandom() {
        double v;
        do {
            v = Math.random() * 122;
        } while (v < 32);
        return BigDecimal.valueOf(v).intValue();
    }

}
