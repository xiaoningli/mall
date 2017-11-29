package com.scoprion.mall.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author by kunlun
 * @created on 2017/9/28.
 */
public class Category {

    /**
     * 类目id
     */
    private Long id;

    /**
     * 类目名称
     */
    @JSONField(name = "category_name")
    private String categoryName;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss", name = "create_date")
    private Date createDate;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss", name = "update_date")
    private Date updateDate;

    /**
     * 父id
     */
    @JSONField(name = "parent_id")
    private String parentId;
    /**
     * 排序
     */
    private String sort;
    /**
     * 图标（一级类目才有）
     */
    private String icon;

    /**
     * 状态 NORMAL UN_NORMAL
     */
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", parentId='" + parentId + '\'' +
                ", sort='" + sort + '\'' +
                ", icon='" + icon + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
