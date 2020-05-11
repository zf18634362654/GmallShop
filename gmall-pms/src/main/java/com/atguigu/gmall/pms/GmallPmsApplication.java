package com.atguigu.gmall.pms;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
*   整合dubbo  1.开启dubbo注解  2.注册中心等 3，暴露服务
*   整合mybatis-plus
 *   logstash整合  1.导入jar 2 导日志配置 3.在kilbana里建立好日志的索引,就可以可视化检查
 *
 *
* */

@MapperScan("com.atguigu.gmall.pms.mapper")
@EnableDubbo
@SpringBootApplication
public class GmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallPmsApplication.class, args);
    }

}
