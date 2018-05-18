package com.yc.utils;

import java.util.UUID;

/**
 *  uuid 生成
 *
 */
public class UUIDUtils {
public static String getUUID() {
    UUID uuid = UUID.randomUUID();
    String str = uuid.toString();
    // 去掉"-"符号
    return str.replace("-", "");
}

public static void main(String[] args) {
    System.out.println(getUUID());
}
}
