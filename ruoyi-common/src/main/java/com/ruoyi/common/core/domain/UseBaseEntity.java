package com.ruoyi.common.core.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class UseBaseEntity implements Serializable
{
    /** 创建者 */
    private String createBy;

    /** 创建时间 */
    private Integer createTime;

    /** 更新者 */
    private String updateBy;

    /** 更新时间 */
    private Integer updateTime;
}
