package com.ezeeinfo.model;

public class Group {
    private Integer activeFlag;
    private Integer userCount;
    private Integer level;

    public Integer getActiveFlag() {
        return this.activeFlag;
    }

    public void setActiveFlag(Integer activeFlag) {
        this.activeFlag = activeFlag;
    }

    public Integer getUserCount() {
        return this.userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Group activeFlag(Integer activeFlag) {
        setActiveFlag(activeFlag);
        return this;
    }

    public Group userCount(Integer userCount) {
        setUserCount(userCount);
        return this;
    }

    public Group level(Integer level) {
        setLevel(level);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
                " activeFlag='" + getActiveFlag() + "'" +
                ", userCount='" + getUserCount() + "'" +
                ", level='" + getLevel() + "'" +
                "}";
    }

}
