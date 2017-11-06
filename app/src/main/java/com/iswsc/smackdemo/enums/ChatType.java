package com.iswsc.smackdemo.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jacen on 2017/10/20 18:45.
 * jacen@iswsc.com
 */

public enum ChatType {
    error(-1, "文本"),
    text(0, "文本"),
    image(1, "图片"),
    audio(2, "语音");
    private int id;
    private String desc;
    private static final Map<Integer, ChatType> code2DeptType;

    static {
        code2DeptType = new HashMap<Integer, ChatType>();

        for (ChatType deptType : ChatType.values()) {
            code2DeptType.put(deptType.getId(), deptType);
        }
    }

    ChatType(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public static ChatType fromCode(int id){
        if (code2DeptType.get(id) == null) {
            return error;
        }
        return code2DeptType.get(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}