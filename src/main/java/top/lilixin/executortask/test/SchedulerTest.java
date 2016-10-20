package top.lilixin.executortask.test;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 如果只是一个简单的定时任务  需要@EnableScheduling  @Scheduled
 * 然后 配置文件里写一个<task:scheduler id="myScheduler" pool-size="10" />
 * 这样启动容器就可以运行了   
 * 注意 用@Scheduled 注解标识的方法不能有参数 ， 并且返回值为void
*@Author: lilixin
*@Date: 2016年10月20日 (lilixin1@le.com)
*/
@EnableScheduling
public class SchedulerTest {
	
	@Scheduled(cron="*/5 * * * * ?")
	public void test1(){
		System.out.println("this is a test"+Thread.currentThread().getName());
	}
}
