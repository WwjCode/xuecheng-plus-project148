package com.xuecheng.content.model.dto;

import lombok.Data;

/**
 * @author wj
 * @description 课程查询参数Dto
 * @date 2023/1/15 23:56
 * @VERSION 1.0
 */
@Data
public class QueryCourseParamsDto {

    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;
}
