package com.xuecheng.content.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wj
 * @description MyBatisPlus配置类
 * @date 2023/1/16 9:59
 * @VERSION 1.0
 */
 @Configuration
 @MapperScan("com.xuecheng.content.mapper")
public class MybatisPlusConfig {


  //定义分页的拦截器
 @Bean
  public MybatisPlusInterceptor getMybatisPlusInterceptor(){
  MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
  mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
  return mybatisPlusInterceptor;
 }

}
