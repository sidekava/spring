package diPrj.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import diPrj.di.entity.Exam;
import diPrj.di.entity.NewlecExam;

//<context:component-scan base-package="diPrj.di.ui, diPrj.di.entity" />
@ComponentScan("diPrj.di.ui")
//setting.xml
@Configuration
public class NewlecDIConfig {
	
	//<bean id="exam1" class="diPrj.di.entity.NewlecExam" />
	@Bean
	public Exam exam() {
		return new NewlecExam();
	}
}
