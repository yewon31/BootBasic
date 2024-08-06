package com.simple.basic.config;

import com.simple.basic.command.TestVO;
import com.simple.basic.controller.HomeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // 이거 스프링 설정파일
//@PropertySource("claspath:/hello.properties") // 특정 properties 경로
public class WebConfig implements WebMvcConfigurer {

    /*
    @Value("#{server.port}")
    String port;

    @Value("#{hello}")
    String hello;

    @Value("#{bye}")
    String bye;

    @Autowired
    ApplicationContext applicationContext;

    // 자바코드로 빈 생성
    @Bean
    public TestVO testVO() {
        return new TestVO(); // bean으로 등록
    }

    @Bean // 스프링이 이 코드를 실행시켜서, 리턴에 담기는 값을 bean으로 등록
    public void test() {
//        System.out.println("스프링 설정파일 실행됨");
//        int result = applicationContext.getBeanDefinitionCount();
//        System.out.println("context 안에 bean 개수 : "+result);
//        HomeController home = applicationContext.getBean(HomeController.class);
//        System.out.println("context 안에 home 컨트롤러 빈 : "+home);

//        TestVO vo = applicationContext.getBean(TestVO.class);
//        System.out.println("context 안에 TestVO 빈 : "+vo);

        System.out.println("properties server.port : "+port);
        System.out.println("properties hello : "+hello);
        System.out.println("properties bye : "+bye);
    }
     */

}
