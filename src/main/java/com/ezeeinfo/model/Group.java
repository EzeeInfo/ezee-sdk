package com.ezeeinfo.model;

public class Group {
    private final Integer activeFlag;
    private final Integer userCount;
    private final Integer level;

    public Group(Integer activeFlag, Integer userCount, Integer level) {
        this.activeFlag = activeFlag;
        this.userCount = userCount;
        this.level = level;
    }

    public Integer getActiveFlag() {
        return this.activeFlag;
    }
    public Integer getUserCount() {
        return this.userCount;
    }
    public Integer getLevel() {
        return this.level;
    }

}
