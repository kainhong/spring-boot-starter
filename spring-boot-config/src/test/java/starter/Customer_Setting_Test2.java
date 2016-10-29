package starter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import starter.configuration.CustomSetting2;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Customer_Setting_Test2.class)
@EnableConfigurationProperties({ CustomSetting2.class })
@ComponentScan(basePackages="starter")
public class Customer_Setting_Test2 {

	@Autowired
	private CustomSetting2 settings;

	@Test
	public void test() {
		String val = settings.getName();
		System.err.println(val);
	}

//	public static void mian(String[] args) {
//		new SpringApplicationBuilder(Customer_Setting_Test2.class).properties(
//				"spring.config.name=application,customer").run(args);
//	}
}
