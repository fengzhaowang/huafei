package com.huafei.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName taocan
 */
@TableName(value ="taocan")
@Data
public class Taocan implements Serializable {
    /**
     * 套餐id
     */
    @TableId
    private Integer taocan_id;

    /**
     * 套餐名
     */
    private String taocan;

    /**
     * 套餐金额
     */
    private Integer money;

    /**
     * 套餐流量
     */
    private String liuliang;

    /**
     * 套餐通话分钟
     */
    private Integer tonhua;

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
        Taocan other = (Taocan) that;
        return (this.getTaocan_id() == null ? other.getTaocan_id() == null : this.getTaocan_id().equals(other.getTaocan_id()))
            && (this.getTaocan() == null ? other.getTaocan() == null : this.getTaocan().equals(other.getTaocan()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getLiuliang() == null ? other.getLiuliang() == null : this.getLiuliang().equals(other.getLiuliang()))
            && (this.getTonhua() == null ? other.getTonhua() == null : this.getTonhua().equals(other.getTonhua()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaocan_id() == null) ? 0 : getTaocan_id().hashCode());
        result = prime * result + ((getTaocan() == null) ? 0 : getTaocan().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getLiuliang() == null) ? 0 : getLiuliang().hashCode());
        result = prime * result + ((getTonhua() == null) ? 0 : getTonhua().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taocan_id=").append(taocan_id);
        sb.append(", taocan=").append(taocan);
        sb.append(", money=").append(money);
        sb.append(", liuliang=").append(liuliang);
        sb.append(", tonhua=").append(tonhua);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}