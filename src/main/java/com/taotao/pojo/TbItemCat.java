package com.taotao.pojo;

import java.util.Date;
/**��Ʒ��Ŀ   */
public class TbItemCat {
	
    private Long id;			//��ĿID	
    private Long parentId;		//����ĿID=0ʱ,�������һ������Ŀ
    private String name;		//��Ŀ����	
    private Integer status;		//״̬,��ѡֵ:1���� 2ɾ��
    private Integer sortOrder;	//������ţ���ʾͬ����Ŀ��չ�ִ�������ֵ��������ƴ������С�ȡֵ��Χ:�����������	
    private Boolean isParent;	//����Ŀ�Ƿ�Ϊ����Ŀ��1Ϊtrue��0Ϊfalse
    private Date created;		//����ʱ��
    private Date updated;		//����ʱ��

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