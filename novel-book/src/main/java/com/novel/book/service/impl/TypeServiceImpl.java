package com.novel.book.service.impl;

import java.util.List;

import com.novel.book.domain.Type;
import com.novel.book.mapper.TypeMapper;
import com.novel.book.service.ITypeService;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author lsm
 * @date 2020-10-12
 */
@Service
public class TypeServiceImpl implements ITypeService
{
    @Autowired(required = false)
    private TypeMapper typeMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Type selectTypeById(Long id)
    {
        return typeMapper.selectTypeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param type 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Type> selectTypeList(Type type)
    {
        return typeMapper.selectTypeList(type);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param type 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertType(Type type)
    {
        int now = TimeUtils.getNow();
        type.setCreateTime(now);
        type.setUpdateTime(now);
        type.setStatus(1);
        type.setId(System.currentTimeMillis());
        return typeMapper.insertType(type);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param type 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateType(Type type)
    {
        type.setUpdateTime(TimeUtils.getNow());
        return typeMapper.updateType(type);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTypeByIds(Long[] ids)
    {
        return typeMapper.deleteTypeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTypeById(Long id)
    {
        return typeMapper.deleteTypeById(id);
    }
}
