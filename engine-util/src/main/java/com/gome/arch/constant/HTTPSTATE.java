package com.gome.arch.constant;

/**
 * @Classname HTTPSTATE
 * @Description TODO
 * @Date 2020/5/21 12:04 PM
 * @Created by nihui
 */
public enum  HTTPSTATE {
    HTTP_OK("normal",200),
    HTTP_NOT_FUND("not_fund",404),
    HTTP_ERROR("error",500);
    private final String stateKey;
    private final Integer stateCode;

    HTTPSTATE(String stateKey, Integer stateCode) {
        this.stateKey = stateKey;
        this.stateCode = stateCode;
    }

    public String getStateKey() {
        return stateKey;
    }

    public Integer getStateCode() {
        return stateCode;
    }
}
