package com.learn.security.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    private Map<String,Object> header;
    private List<Object> body;

    public Result(String code, String message, Object b) {
        header = new HashMap<>();
        header.put("code",code);
        header.put("message",message);

        body = new ArrayList<>();
        body.add(b);
    }

    public Map<String, Object> getHeader() {
        return header;
    }

    public void setHeader(Map<String, Object> header) {
        this.header = header;
    }

    public List<Object> getBody() {
        return body;
    }

    public void setBody(List<Object> body) {
        this.body = body;
    }
}
