package com.beyzaslan.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {//burda s5 saniyede bir direkt yazdırıyor periyodik bir şey bu
    @Scheduled(cron = "*/5 * * * * *")
    public void write1To10() {
        for (int i = 0; i <= 10; i++){
            System.out.print(i + " ");
        }

    }
}
