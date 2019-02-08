package com.example.spring.config.server.Decrypt;

import org.apache.http.Consts;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * DecryptClient
 * 解密
 * 复制加密的密文放到StringEntity
 * @author 10905 2019/2/8
 * @version 1.0
 */
public class DecryptClient {
    public static void main(String[] args) throws IOException {
        //    创建默认的客户端
        CloseableHttpClient httpClient = HttpClients.createDefault();
        /**
         * 解密
         */
        HttpPost httpPost = new HttpPost("http://localhost:8888/decrypt");
        /**
         * 复制加密的密文放到StringEntity
         */
        StringEntity entity = new StringEntity("8c373548e0a1a2e887c76e6875ffbff103a6f55319ecb597f6090e020a5cf0a9", Consts.UTF_8);
        httpPost.setEntity(entity);

//        获取响应
        CloseableHttpResponse response = httpClient.execute(httpPost);
//        解析
        System.out.println("\n\n解密: "+ EntityUtils.toString(response.getEntity()));
    }
}

