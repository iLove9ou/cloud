package com.cloud.gateway.constants;

public class Constants {

   // 系统版本
   public static final String SYSTEM_VERSION = "1.0.0";

   // 白名单设置
   public static final String WHITE_LIST = "72.160.3.204, 127.0.0.1";

   //线程数
   public final static int THREAD_COUNT = 5;

   //处理间隔时间
   public final static int INTERVAL_MILS = 0;

   //consumer失败后等待时间(mils)
   public static final int ONE_SECOND = 1 * 1000;

   //异常sleep时间(mils)
   public static final int ONE_MINUTE = 1 * 60 * 1000;

   //MQ消息retry时间
   public static final int RETRY_TIME_INTERVAL = ONE_MINUTE;

   //MQ消息有效时间
   public static final int VALID_TIME = ONE_MINUTE;

}
