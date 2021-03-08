package com.ashahova.springboot.knightmove.spring_boot;

import com.ashahova.springboot.knightmove.spring_boot.servlet.HorseServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.http.HttpServlet;

@SpringBootApplication
public class Application {

    @Bean
    public ServletRegistrationBean exampleServletBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(
                httpServlet(), "/horse/servlet/count");
        bean.setLoadOnStartup(1);
        return bean;
    }
    @Bean
    public HttpServlet httpServlet() {
        return new HorseServlet();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
