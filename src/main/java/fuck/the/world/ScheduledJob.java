package fuck.the.world;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Project: quartz-test
 * Package: fuck.the.world
 *
 * @author: lijun.dong
 * @date: 11/15/18
 * @time: 2:53 PM
 * @description:
 */
public class ScheduledJob extends QuartzJobBean {

    private AnotherBean anotherBean;

    @Override
    protected void executeInternal(JobExecutionContext arg0)
            throws JobExecutionException {
        anotherBean.printAnotherMessage();
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }
}
