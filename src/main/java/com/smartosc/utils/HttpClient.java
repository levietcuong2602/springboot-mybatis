package com.smartosc.utils;


import com.alibaba.fastjson2.JSONObject;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.entity.EntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.util.Timeout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

public final class HttpClient {
    private static final Logger logger = LoggerFactory.getLogger(HttpClient.class);

    private static final RequestConfig REQUEST_CONFIG = RequestConfig.custom()
            .setConnectionRequestTimeout(Timeout.of(15000, TimeUnit.SECONDS)).build();

    /**
     * 采用Get方式发送请求，获取响应数据
     *
     * @param url
     * @return
     */
    public static JSONObject httpGet(String url) {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(REQUEST_CONFIG);
        try {
            CloseableHttpResponse chr = client.execute(httpGet);
            int statusCode = chr.getCode();
            if (HttpStatus.SC_OK != statusCode) {
                throw new RuntimeException(String.format("An exception occurred in %s query", url));
            }
            String entity = EntityUtils.toString(chr.getEntity(), StandardCharsets.UTF_8);
            JSONObject object = JSONObject.parseObject(entity);
            return object;
        } catch (Exception e) {
            logger.error("Error occurs", e);
            throw new RuntimeException(String.format("%s", url) + "query exception");
        } finally {
            try {
                client.close();
            } catch (IOException e) {
                logger.error("Error occurs", e);
            }
        }
    }

    /**
     * 采用Post方式发送请求，获取响应数据
     *
     * @param url   url地址
     * @param param 参数值键值对的字符串
     * @return
     */
    public static String httpPost(String url, String param) {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        try {
            HttpPost post = new HttpPost(url);
            EntityBuilder builder = EntityBuilder.create();
            builder.setContentType(ContentType.APPLICATION_JSON);
            builder.setText(param);
            post.setEntity(builder.build());

            CloseableHttpResponse response = client.execute(post);
            int statusCode = response.getCode();

            HttpEntity entity = response.getEntity();
            String data = EntityUtils.toString(entity, StandardCharsets.UTF_8);
            logger.info("Status code: " + statusCode + " Data:" + data);
            return data;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                client.close();
            } catch (Exception ex) {
            }
        }
    }
}
