package com.novel.book.mapper;

import com.novel.book.domain.Type;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author lsm
 * @date 2020-10-12
 */
public interface TypeMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Type selectTypeById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param type 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Type> selectTypeList(Type type);

    /**
     * 新增【请填写功能名称】
     *
     * @param type 【请填写功能名称】
     * @return 结果
     */
    public int insertType(Type type);

    /**
     * 修改【请填写功能名称】
     *
     * @param type 【请填写功能名称】
     * @return 结果
     */
    public int updateType(Type type);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTypeById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTypeByIds(Long[] ids);
}
