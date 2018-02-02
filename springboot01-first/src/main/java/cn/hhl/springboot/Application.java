package cn.hhl.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication // 代表该类为SpringBoot的引导类
public class Application {

public static void main(String[] args) {
	/** 第一种方式：运行SpringBoot项目 */
	//SpringApplication.run(Application.class, args);
	
	/** 第二种方式：运行SpringBoot项目 */
	SpringApplication springApplication = new SpringApplication(Application.class);
	/** 设置关闭Banner横幅 */
	springApplication.setBannerMode(Mode.OFF);
	/** 运行 */
	springApplication.run(args);
}
}
