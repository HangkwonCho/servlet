package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

	// application.properties의 설정과 동일
	/*@Bean
	InternalResourceViewResolver internalResourceViewResolver() {
		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	}*/

	// 해당 컨트롤러에 Component 또는 Controller를 제거후 직접 bean으로 등록해도 됨.
	/*@Bean
	SpringMemberFormControllerV1 springMemberFormControllerV1() {
		return new SpringMemberFormControllerV1();
	}*/
}
