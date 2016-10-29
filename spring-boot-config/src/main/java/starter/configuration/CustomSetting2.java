package starter.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "customer")  
public class CustomSetting2 {
	//,locations = "classpath:customer.properties"
    private String name;  
    private String gender;  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getGender() {  
        return gender;  
    }  
    public void setGender(String gender) {  
        this.gender = gender;  
    }  
}
