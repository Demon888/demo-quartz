import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project: quartz-test
 * Package: PACKAGE_NAME
 *
 * @author: lijun.dong
 * @date: 11/15/18
 * @time: 2:55 PM
 * @description: 参考文章：https://www.cnblogs.com/halberts/p/5909446.html
 */
public class AppMain {
    public static void main(String args[]) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("quartz-context.xml");
    }

}
