package cn.edu.zut.demo.entity;

import java.util.Date;

/**
 * @Author: 徐静巧
 * @Date: 创建时间：2018/7/15 16:54
 */
public class area {
    //主键Id
    private Integer areaId;
    //名称
    private String areaName;
    //权重，越大越前
    private  Integer priority;
    //创建时间
    private Date createTime;
   // 更新时间
    private Date lastEditTime;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
