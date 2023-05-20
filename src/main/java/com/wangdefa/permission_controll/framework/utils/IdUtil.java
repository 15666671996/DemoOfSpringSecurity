package com.wangdefa.permission_controll.framework.utils;

import java.util.UUID;

public class IdUtil {
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
