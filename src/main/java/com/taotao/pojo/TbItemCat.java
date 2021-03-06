package com.taotao.pojo;

import java.util.Date;
/**商品类目   */
public class TbItemCat {
	
    private Long id;			//类目ID	
    private Long parentId;		//父类目ID=0时,代表的是一级的类目
    private String name;		//类目名称	
    private Integer status;		//状态,可选值:1正常 2删除
    private Integer sortOrder;	//排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数	
    private Boolean isParent;	//该类目是否为父类目，1为true，0为false
    private Date created;		//创建时间
    private Date updated;		//更新时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}