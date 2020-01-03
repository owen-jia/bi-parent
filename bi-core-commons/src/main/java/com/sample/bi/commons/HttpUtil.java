package com.sample.bi.commons;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * HTTP请求工具
 * 支持GET\POST
 * @author: Owen Jia
 * @time: 2019/12/12 15:38
 */
public class HttpUtil {

    /**
     * Get
     * @param url 遵守http协议规范
     * @return String
     */
    public static String httpGet(String url){
        if(url == null|| url.length() ==0) return null;
        try {
            URL tUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) tUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setDefaultUseCaches(false);
            connection.connect();

            return responseOk(connection);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * Post
     * @param url 遵守http协议规范
     * @param param String格式，推荐json字符串
     * @return String
     */
    public static String httpPost(String url, String param){
        if(url == null|| url.length() ==0) return null;
        try {
            url = url.split("\\?")[0];

            URL tUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) tUrl.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setDefaultUseCaches(false);
            connection.connect();

            if(param!=null && param.length() > 0) {
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream(), "UTF-8"));
                bw.write(param);
                bw.close();
            }
            return responseOk(connection);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String responseOk(HttpURLConnection connection) throws IOException {
        if(connection.getResponseCode() == HttpURLConnection.HTTP_OK){
            return inputStream2String(connection.getInputStream());
        }
        throw new RuntimeException("HTTP协议通信异常:"+connection.getResponseCode());
    }

    private static String inputStream2String(InputStream is) throws IOException {
        byte[] bytes = new byte[is.available()];
        is.read(bytes);
        return new String(bytes);
    }
}
