package com.fastcampus.projectboard.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class Ad {
    @Autowired
    private Respo respo;

    @TestConfiguration
    static class AdTestConfiguration {
        @Bean
        public Respo respo() {
            return new Respo();
        }
    }

    @Test
    void aVoid() throws Exception {
        //given
    assertThat(respo).isNotNull();
        //when

        //then
    }

}
