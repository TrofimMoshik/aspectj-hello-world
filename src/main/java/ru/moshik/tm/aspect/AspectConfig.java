package ru.moshik.tm.aspect;

import org.aspectj.lang.Aspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("ru.moshik.tm")
@Configuration
public class AspectConfig {

    @Bean
    GreetingAspect greetingAspect() {
        GreetingAspect aspect = Aspects.aspectOf(GreetingAspect.class);
        aspect.setMessage("teeeest");
        return aspect;
    }

}
