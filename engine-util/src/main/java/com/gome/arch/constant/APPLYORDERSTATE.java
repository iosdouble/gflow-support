package com.gome.arch.constant;

/**
 * @Classname State
 * @Description TODO
 * @Date 2020/5/21 11:56 AM
 * @Created by nihui
 */
public enum APPLYORDERSTATE {
    SUCCESS("OK",2),
    FAIL("Fail",4),
    REJECT("Reject",3);

    private final String stateKey;
    private final Integer stateCode;

    APPLYORDERSTATE(String stateKey, Integer stateCode) {
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
