package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 1、如何使用nacos作为配置中心统一管理配置
 * 1）、引入依赖
 * <dependency>
 * <groupId>com.alibaba.cloud</groupId>
 * <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 * </dependency>
 * 2)、创建一个bootstrap.properties
 * spring.application.name=gulimall-coupon
 * spring.cloud.nacos.config.server-addr=60.204.249.234:8848
 * 3)、动态获取数据
 *
 * @RefreshScope：动态获取并刷新配置
 * @Value("${config.nacos.data}") 如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置。
 * <p>
 * 2、细节
 * 1)、命名空间：
 *      默认：pulic（保留空间）；默认新增的所有配置都在public空间
 *      1、开发、测试、生产：利用命名空间来做环境隔离
 *      2、每一个服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己的命名空间下的配置
 *
 * 2)、配置集：所有配置的集合
 * 3)、配置集 ID 类似文件名
 *
 * 4)、配置项：
 *      默认所有的配置集：DEFAULT_GROUP
 *      111、618、1212
 *
 *每一个微服务创建自己的命名空间，使用配置分组区分环境， dev test prod
 *
 * 3、配置的加载多个配置集
 *  1)、微服务任何配置信息，任何配置文件都可以放在配置中心中
 *  2)、只需要在bootstrap.properties说明加载配置中心那些配置文件即可
 *  3)、@Value @CofigurationProperties
 *  以前springboot任何方法从配置文件获取值，都能使用。
 */

//@MapperScan("com.atguigu.gulimall.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
