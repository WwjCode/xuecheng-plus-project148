package com.xuecheng.generator.content.controller;

import com.xuecheng.generator.content.service.CourseCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 课程分类 前端控制器
 * </p>
 *
 * @author itcast
 */
@Slf4j
@RestController
@RequestMapping("courseCategory")
public class CourseCategoryController {

    @Autowired
    private CourseCategoryService courseCategoryService;
}
