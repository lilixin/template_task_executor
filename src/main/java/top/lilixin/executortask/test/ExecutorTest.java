package top.lilixin.executortask.test;


/**如果使用这个注解 <task:scheduled-tasks >
 * 可以定时运行任意类的任意方法  需要一个scheduler
 * 具体看配置文件 
*@Author: lilixin
*@Date: 2016年10月20日 (lilixin1@le.com)
*/
public class ExecutorTest {

	public void test2(){
		System.out.println("this is a test"+Thread.currentThread().getName());
	}
}
