package com.example.springbootjournal;

import com.example.springbootjournal.domain.Journal;
import com.example.springbootjournal.repository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJournalApplication {

    @Bean
    InitializingBean saveData(JournalRepository repo) {
        return () -> {
            repo.save(new Journal("스프링 부트 입문", "오늘부터 스프링 부트 공부하기 시작했다", "08/22/2021"));
            repo.save(new Journal("간단한 스프링 부트 프로젝트", "스프링 부트 프로젝트를 처음 만들어보았다", "08/27/2021"));
            repo.save(new Journal("스프링 부트 해부", "스프링 부트를 자세히 살펴보았다", "09/01/2021"));
            repo.save(new Journal("스프링 부트 클라우드", "클라우드 파운드리를 응용한 스프링 부트를 공부했다", "10/01/2021"));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJournalApplication.class, args);
    }

}
