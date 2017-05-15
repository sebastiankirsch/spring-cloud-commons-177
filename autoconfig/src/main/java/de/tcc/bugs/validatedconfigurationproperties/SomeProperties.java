package de.tcc.bugs.validatedconfigurationproperties;


import javax.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "tcc.bugs")
@Validated
public class SomeProperties {

    @NotNull
    private String mandatoryWithDefault = "default";

    public String getMandatoryWithDefault() {
        return mandatoryWithDefault;
    }

    public void setMandatoryWithDefault(String mandatoryWithDefault) {
        this.mandatoryWithDefault = mandatoryWithDefault;
    }
}
