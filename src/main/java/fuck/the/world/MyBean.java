package fuck.the.world;

import org.springframework.stereotype.Component;

/**
 * Project: quartz-test
 * Package: fuck.the.world
 *
 * @author: lijun.dong
 * @date: 11/15/18
 * @time: 2:54 PM
 * @description:
 */
@Component("myBean")
public class MyBean {

    public void printMessage() {
        System.out.println("I am called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
    }

}
