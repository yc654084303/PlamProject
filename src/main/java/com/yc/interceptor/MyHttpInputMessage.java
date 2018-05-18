package com.yc.interceptor;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;

import com.yc.utils.DESUtil;

public class MyHttpInputMessage implements HttpInputMessage {
    private HttpHeaders headers;

    private InputStream body;

    public MyHttpInputMessage(HttpInputMessage inputMessage) throws Exception {
        this.headers = inputMessage.getHeaders();
        this.body = IOUtils.toInputStream(new DESUtil().decrypt(IOUtils.toString(inputMessage.getBody(), "UTF-8")), "UTF-8");
    }

    @Override
    public InputStream getBody() throws IOException {
        return body;
    }

    @Override
    public HttpHeaders getHeaders() {
        return headers;
    }

}