package com.ziwei.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ziwei GONG
 * @date 2023/3/26
 * @name mallSpringboot
 * Mybatis config file
 */


@Configuration
@MapperScan({"com.ziwei.mall.mbg.mapper", "com.ziwei.mall.dao"})
public class MybatisConfig {

//    @Bean
//    public PmsBrandMapper myMapper(SqlSessionFactory sqlSessionFactory) throws Exception {
//        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
//        return sqlSessionTemplate.getMapper(PmsBrandMapper.class);
//    }
//    试图在Springboot 3.x中建立SqlSessionFactory，失败。
}
