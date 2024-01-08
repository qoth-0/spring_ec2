package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // 어노테이션
public class CorsConfig  implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**") // /~로 들어오는 모든 url 허용
                .allowedOrigins("*") // 모든 origin(출처) 허용 - 보통 서비스 배포 시 제한적 허용
                .allowedMethods("*"); // 모든 메소드 허용
    }
}
