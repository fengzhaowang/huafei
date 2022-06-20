package com.huafei.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName jifen
 */
@TableName(value ="jifen")
@Data
public class Jifen implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer jifen_id;

    /**
     * 用户id
     */
    private Integer name_id;

    /**
     * 积分数
     */
    private Integer jifen;

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
        Jifen other = (Jifen) that;
        return (this.getJifen_id() == null ? other.getJifen_id() == null : this.getJifen_id().equals(other.getJifen_id()))
            && (this.getName_id() == null ? other.getName_id() == null : this.getName_id().equals(other.getName_id()))
            && (this.getJifen() == null ? other.getJifen() == null : this.getJifen().equals(other.getJifen()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJifen_id() == null) ? 0 : getJifen_id().hashCode());
        result = prime * result + ((getName_id() == null) ? 0 : getName_id().hashCode());
        result = prime * result + ((getJifen() == null) ? 0 : getJifen().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jifen_id=").append(jifen_id);
        sb.append(", name_id=").append(name_id);
        sb.append(", jifen=").append(jifen);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}