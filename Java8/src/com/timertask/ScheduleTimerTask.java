package com.timertask;

import java.util.Date;
import java.util.Timer;

public class ScheduleTimerTask {

	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();
		Date date = new Date(System.currentTimeMillis());
		System.out.println(" Timer task starts " + date);
		timer.scheduleAtFixedRate(new ProcessTransactions(), date, 5000);
		Thread.sleep(15000);
		timer.cancel();
		System.out.println(" Timer task is cancelled ");
	}

}
