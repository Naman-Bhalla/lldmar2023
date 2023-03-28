package com.scaler.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    //TODO Make this singleton

    private Map<String, Student> map = new HashMap<>();

    public void register(String key, Student student){
        map.put(key, student);
    }

    public Student get(String key){
        return map.get(key);
    }
}
