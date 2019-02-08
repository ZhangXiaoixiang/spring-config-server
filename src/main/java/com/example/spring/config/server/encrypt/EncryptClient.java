package com.example.spring.config.server.encrypt;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * EncryptClient
 * 加密 http://localhost:8888/encrypt
 *
 * @author 10905 2019/2/8
 * @version 1.0
 */
public class EncryptClient {
    public static void main(String[] args) throws IOException {
        //    创建默认的客户端
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://localhost:8888/encrypt");
        /**
         * 加密
         */
        HttpEntity entity = new StringEntity("zhang张晓祥", Consts.UTF_8);
        httpPost.setEntity(entity);


//        获取响应
        CloseableHttpResponse response = httpClient.execute(httpPost);
//        解析
        System.out.println("\n\n解析响应,看是否加密: "+ EntityUtils.toString(response.getEntity())+"\n加密成功后可以复制到解密main方法测试");

    }
}
