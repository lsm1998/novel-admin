package com.novel.book.domain;

import com.ruoyi.common.core.domain.UseBaseEntity;
import lombok.Data;
import com.ruoyi.common.annotation.Excel;

/**
 * 【请填写功能名称】对象 t_type
 *
 * @author lsm
 * @date 2020-10-12
 */
@Data
public class Type extends UseBaseEntity
{
    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long pid;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pic;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    private transient String pName;
}
