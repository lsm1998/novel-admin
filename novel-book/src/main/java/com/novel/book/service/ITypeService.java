package com.novel.book.service;

import com.novel.book.domain.Type;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author lsm
 * @date 2020-10-12
 */
public interface ITypeService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    Type selectTypeById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param type 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    List<Type> selectTypeList(Type type);

    /**
     * 新增【请填写功能名称】
     *
     * @param type 【请填写功能名称】
     * @return 结果
     */
    int insertType(Type type);

    /**
     * 修改【请填写功能名称】
     *
     * @param type 【请填写功能名称】
     * @return 结果
     */
     int updateType(Type type);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
     int deleteTypeByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
     int deleteTypeById(Long id);
}
