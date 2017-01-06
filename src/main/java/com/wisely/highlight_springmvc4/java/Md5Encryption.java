package com.wisely.highlight_springmvc4.java;

import java.security.MessageDigest;

/**
 * Created by xiedan11 on 2017/1/6.
 */
public class Md5Encryption {
    public static void main(String[] args) {
        StringBuffer bf = new StringBuffer();
        bf.append("5");
        bf.append("aaaaaaaaa");
        bf.append("273683384@qq.com");
        String md5 = MD5(bf.toString());
        System.out.println(md5);
    }



    public static final String MD5(String s)
    {
        char[] hexDigits =
                { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        try
        {
            byte[] strTemp = s.getBytes();
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            int j = md.length;
            char[] str = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; ++i)
            {
                byte byte0 = md[i];
                str[(k++)] = hexDigits[(byte0 >>> 4 & 0xF)];
                str[(k++)] = hexDigits[(byte0 & 0xF)];
            }
            return new String(str);
        } catch (Exception e)
        {
            System.out.println("--------MD5 error:" + e);
            e.printStackTrace();
        }
        return null;
    }
}
