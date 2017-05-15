package de.tcc.bugs.validatedconfigurationproperties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SomeProperties.class)
public class SomeAutoConfiguration {

    SomeAutoConfiguration(SomeProperties someProperties) {
        System.out.println(someProperties.getMandatoryWithDefault());
    }

}
