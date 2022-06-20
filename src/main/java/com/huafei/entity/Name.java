package com.huafei.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName name
 */
@TableName(value ="name")
@Data
public class Name implements Serializable {
    /**
     * 用户id
     */
    @TableId
    private Integer name_id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 账号
     */
    private String zhanghao;

    /**
     * 密码
     */
    private String mima;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer years;

    /**
     * 手机号
     */
    private Integer phone;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Name other = (Name) that;
        return (this.getName_id() == null ? other.getName_id() == null : this.getName_id().equals(other.getName_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getZhanghao() == null ? other.getZhanghao() == null : this.getZhanghao().equals(other.getZhanghao()))
            && (this.getMima() == null ? other.getMima() == null : this.getMima().equals(other.getMima()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getYears() == null ? other.getYears() == null : this.getYears().equals(other.getYears()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName_id() == null) ? 0 : getName_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getZhanghao() == null) ? 0 : getZhanghao().hashCode());
        result = prime * result + ((getMima() == null) ? 0 : getMima().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getYears() == null) ? 0 : getYears().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name_id=").append(name_id);
        sb.append(", name=").append(name);
        sb.append(", zhanghao=").append(zhanghao);
        sb.append(", mima=").append(mima);
        sb.append(", sex=").append(sex);
        sb.append(", years=").append(years);
        sb.append(", phone=").append(phone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}