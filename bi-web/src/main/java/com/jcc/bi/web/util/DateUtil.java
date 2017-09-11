package com.jcc.bi.web.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Owen Jia on 2017/6/16.
 */
public class DateUtil {

    public static String default_format = "yyyy-MM-dd HH:mm:ss";

    public static String yyyyMMddHH_format = "yyyyMMddHH";

    public static final SimpleDateFormat yyyy_MM_dd_HH_mm_ss = new SimpleDateFormat(
            default_format);

    public static final SimpleDateFormat yyyyMMdd = new SimpleDateFormat(
            "yyyyMMdd");

    public static final SimpleDateFormat yyyyMMddHH = new SimpleDateFormat(
            yyyyMMddHH_format);
    public static final SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat(
            "yyyyMMddHHmmss");

    public static Date parseString2Date(String date,String format){
        if(date == null || date.length() <= 0){
            return null;
        }
        if(format == null || format.length() <= 0){
            format = default_format;
        }
        try {
            return new SimpleDateFormat(format).parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getyyyyMMddHH(){
        return yyyyMMddHH.format(new Date());
    }

    public static String getyyyyMMddHHmmss(){
        return yyyyMMddHHmmss.format(new Date());
    }

    public static String getyyyyMMddHHmmss(Date date){
        return yyyyMMddHHmmss.format(date);
    }

    /**
     * 当前日期时间 +|- hour(小时）
     * @param date 当前日期时间
     * @param minute 分钟
     * @return
     */
    public static String getyyyyMMddHHmmss(Date date, int minute){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, minute);
        return yyyyMMddHHmmss.format(cal.getTime());
    }

    public static String getCurrentyyyyMMdd(){
        return yyyyMMdd.format(new Date());
    }

    public static String getCurrentyyyyMMddHHmmss(){
        return yyyyMMddHHmmss.format(new Date());
    }

    public static String formatDate(Date date,String format){
        if(format == null|| format == ""){
            format = default_format;
        }
        return new SimpleDateFormat(format).format(date);
    }

    public static void main(String[] args){
        DateUtil.test2();
    }

    public static void test2(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, 1);

        System.out.println(cal.getTime());
    }
}
