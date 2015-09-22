package br.com.tcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories("br.com.tcc")
@EntityScan("br.com.tcc.entity")
@ComponentScan(value = "br.com.tcc")
public class AgendaApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(AgendaApplication.class, args);
    }
}
