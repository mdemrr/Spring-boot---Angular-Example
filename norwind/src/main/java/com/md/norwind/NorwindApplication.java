package com.md.norwind;

import com.md.norwind.business.abstracts.projections.product.ProductDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@SpringBootApplication
public class NorwindApplication {

    public static void main(String[] args) {
        SpringApplication.run(NorwindApplication.class, args);
    }


}
