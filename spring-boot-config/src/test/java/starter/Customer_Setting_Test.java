package starter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import starter.configuration.CustomSetting;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Customer_Setting_Test.class)
@EnableConfigurationProperties({CustomSetting.class})  
public class Customer_Setting_Test {
	@Autowired
	private CustomSetting settings;
	
	@Test
	public void test(){
		String val = settings.getName();
		System.err.println(val);
	}
}
