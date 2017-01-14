package com.wisely.highlight_springmvc4.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by xiedan on 2017/1/15.
 * 可变参数个数小练习
 */
public class VariableParam {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hhhahh");
        HashMap<String, Object> hashMap = getModuleInfo("key1", "key2", "value1", list);
        System.out.println(hashMap.get("key1"));
        List list2 = (List) hashMap.get("key2");
        System.out.println(list2.get(0));
    }

    public static HashMap<String, Object> getModuleInfo(Object... params) {
        int mid = params.length/2;
        HashMap<String, Object> hashMap = new HashMap<>();
        for (int i = 0; i < mid; i++) {
            hashMap.put((String)params[i], params[i + mid]);
        }
        return hashMap;
    }
}
