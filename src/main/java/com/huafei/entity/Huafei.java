package com.huafei.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName huafei
 */
@TableName(value ="huafei")
@Data
public class Huafei implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer huafei_id;

    /**
     * 用户id
     */
    private Integer name_id;

    /**
     * 话费余额
     */
    private Integer yue;

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
        Huafei other = (Huafei) that;
        return (this.getHuafei_id() == null ? other.getHuafei_id() == null : this.getHuafei_id().equals(other.getHuafei_id()))
            && (this.getName_id() == null ? other.getName_id() == null : this.getName_id().equals(other.getName_id()))
            && (this.getYue() == null ? other.getYue() == null : this.getYue().equals(other.getYue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHuafei_id() == null) ? 0 : getHuafei_id().hashCode());
        result = prime * result + ((getName_id() == null) ? 0 : getName_id().hashCode());
        result = prime * result + ((getYue() == null) ? 0 : getYue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", huafei_id=").append(huafei_id);
        sb.append(", name_id=").append(name_id);
        sb.append(", yue=").append(yue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}