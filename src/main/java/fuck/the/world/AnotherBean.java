package fuck.the.world;

import org.springframework.stereotype.Component;

/**
 * Project: quartz-test
 * Package: fuck.the.world
 *
 * @author: lijun.dong
 * @date: 11/15/18
 * @time: 2:55 PM
 * @description:
 */
@Component("anotherBean")
public class AnotherBean {

    public void printAnotherMessage() {
        System.out.println("I am called by Quartz jobBean using CronTriggerFactoryBean");
    }

}
