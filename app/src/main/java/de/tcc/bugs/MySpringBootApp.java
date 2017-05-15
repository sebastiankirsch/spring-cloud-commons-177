package de.tcc.bugs;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MySpringBootApp {

    public static void main(final String... args) {
        new SpringApplicationBuilder(MySpringBootApp.class)
                .bannerMode(Mode.OFF)
                .run(args);
    }

}
