package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @author wj
 * @description 课程分类操作相关的service
 * @date 2023/1/21 14:18
 * @VERSION 1.0
 */
public interface CourseCategoryService {

    /**
     * 课程分类查询
     * @param id 根结点id
     * @return 根结点下边的所有子结点
     */
    List<CourseCategoryTreeDto>  queryTreeNodes(String id);
}
