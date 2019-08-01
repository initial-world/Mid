package com.example.demo;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019/7/31
 * @Time 20:34
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer {
    @Bean
    public Docket apiConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                //过滤的接口
                .paths(Predicates.or(PathSelectors.regex("/api2/.*"))).build()
                //定义分组
                .groupName("myapi")
                // 调用apiInfo方法,创建一个ApiInfo实例,里面是展示在文档页面信息内容
                .apiInfo(apiInfo())
                //关闭默认返回值
                .useDefaultResponseMessages(false)
                ;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry){
        resourceHandlerRegistry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        resourceHandlerRegistry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("BookStore Platform API")//大标题
                .description("BookStore Platform's REST API, all the applications could access the Object model data via JSON.")//详细描述
                .version("2.0")//版本
                .contact(new Contact("Helen", "http://qfedu.com", "123456@qq.com"))//作者
                .license("The Apache License, Version 2.0")//许可证信息
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")//许可证地址
                .build();
    }
}
