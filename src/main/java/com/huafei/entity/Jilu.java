package com.huafei.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName jilu
 */
@TableName(value ="jilu")
@Data
public class Jilu implements Serializable {
    /**
     * 记录数id
     */
    @TableId
    private Integer jilu_id;

    /**
     * 用户id
     */
    private Integer name_id;

    /**
     * 充值金额
     */
    private Integer zhong;

    /**
     * 充值前金额
     */
    private Integer qian;

    /**
     * 充值后金额
     */
    private Integer end;

    /**
     * 充值时间
     */
    private Date time;

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
        Jilu other = (Jilu) that;
        return (this.getJilu_id() == null ? other.getJilu_id() == null : this.getJilu_id().equals(other.getJilu_id()))
            && (this.getName_id() == null ? other.getName_id() == null : this.getName_id().equals(other.getName_id()))
            && (this.getZhong() == null ? other.getZhong() == null : this.getZhong().equals(other.getZhong()))
            && (this.getQian() == null ? other.getQian() == null : this.getQian().equals(other.getQian()))
            && (this.getEnd() == null ? other.getEnd() == null : this.getEnd().equals(other.getEnd()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJilu_id() == null) ? 0 : getJilu_id().hashCode());
        result = prime * result + ((getName_id() == null) ? 0 : getName_id().hashCode());
        result = prime * result + ((getZhong() == null) ? 0 : getZhong().hashCode());
        result = prime * result + ((getQian() == null) ? 0 : getQian().hashCode());
        result = prime * result + ((getEnd() == null) ? 0 : getEnd().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jilu_id=").append(jilu_id);
        sb.append(", name_id=").append(name_id);
        sb.append(", zhong=").append(zhong);
        sb.append(", qian=").append(qian);
        sb.append(", end=").append(end);
        sb.append(", time=").append(time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}