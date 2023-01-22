package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.CourseCategory;
import lombok.Data;

import java.util.List;

/**
 * @author wj
 * @description
 * @date 2023/1/15 23:56
 * @VERSION 1.0
 */
@Data
public class CourseCategoryTreeDto extends CourseCategory {
    List childrenTreeNodes;
}
