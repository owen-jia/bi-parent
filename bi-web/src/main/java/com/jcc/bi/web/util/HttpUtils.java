package com.d1m.popup.utils;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Owen Jia on 2017/6/28.
 */
public class HttpUtils {
    /**
     * 连接超时
     */
    static int connectTimeOut = 5000;

    /**
     * 读取数据超时
     */
    static int readTimeOut = 10000;

    /**
     * 请求编码
     */
    static String requestEncoding = "UTF-8";

    static Logger logger = Logger.getLogger(HttpUtils.class);

    public static String doPost(String reqUrl, Map parameters,
                                String recvEncoding) {
        HttpURLConnection url_con = null;
        String responseContent = null;
        try {
            String params = getMapParamsToStr(parameters,
                    HttpUtils.requestEncoding);
            URL url = new URL(reqUrl);
            url_con = (HttpURLConnection) url.openConnection();
            url_con.setRequestMethod("POST");
            System.setProperty("sun.net.client.defaultConnectTimeout",
                    String.valueOf(HttpUtils.connectTimeOut));// （单位：毫秒）jdk1.4换成这个,连接超时
            System.setProperty("sun.net.client.defaultReadTimeout",
                    String.valueOf(HttpUtils.readTimeOut)); // （单位：毫秒）jdk1.4换成这个,读操作超时

            url_con.setDoOutput(true);
            byte[] b = params.toString().getBytes();
            url_con.getOutputStream().write(b, 0, b.length);
            url_con.getOutputStream().flush();
            url_con.getOutputStream().close();

            InputStream in = url_con.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(in,
                    recvEncoding));
            String tempLine = rd.readLine();
            StringBuffer tempStr = new StringBuffer();
            String crlf = System.getProperty("line.separator");
            while (tempLine != null) {
                tempStr.append(tempLine);
                tempStr.append(crlf);
                tempLine = rd.readLine();
            }
            responseContent = tempStr.toString();
            rd.close();
            in.close();
        } catch (IOException e) {
            logger.error("网络故障", e);
        } finally {
            if (url_con != null) {
                url_con.disconnect();
            }
        }
        return responseContent;
    }

    private static String getMapParamsToStr(Map paramMap, String requestEncoding)
            throws IOException {
        StringBuffer params = new StringBuffer();
        // 设置边界
        for (Iterator iter = paramMap.entrySet().iterator(); iter.hasNext();) {
            Map.Entry element = (Map.Entry) iter.next();
            params.append(element.getKey().toString());
            params.append("=");
            params.append(URLEncoder.encode(element.getValue().toString(),
                    requestEncoding));
            params.append("&");
        }

        if (params.length() > 0) {
            params = params.deleteCharAt(params.length() - 1);
        }

        return params.toString();
    }
}
