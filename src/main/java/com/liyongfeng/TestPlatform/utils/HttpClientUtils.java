package com.liyongfeng.TestPlatform.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.util.HashMap;
@Slf4j
public class HttpClientUtils {

    public void get(String url) throws IOException {
        //创建一个可关闭的httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建一个HttpGet请求对象
        HttpGet httpGet = new HttpGet(url);
        //执行请求，然后赋值给HttpResponse对象接收
        HttpResponse httpResponse = httpClient.execute(httpGet);
        //拿到http请求响应码
        int resCode = httpResponse.getStatusLine().getStatusCode();
        log.info("相应状态码为:{}",resCode);
        //把响应内容存储在字符串对象
        String response = String.valueOf(httpResponse.getEntity());
        //创建Json对象，把上面的字符串对象序列化成json对象
        JSONObject responseJson = JSON.parseObject(response);
        //获取响应头信息，赋值给Header[]数组，并将Header[]数组转成HashMap存储
        Header[] headers = httpResponse.getAllHeaders();
        HashMap<String, String> hashMap = new HashMap<>();
        for (Header header : headers) {
            hashMap.put(header.getName(), header.getValue());
        }
    }
}
