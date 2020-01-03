package com.sample.biguava.boot.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Owen Jia
 * @time: 2018/10/12 18:47
 */
public class PrintServiceImpl {

    private boolean printEnabled = true;
    private int printCycleTime = 1;

    public void printTime(){
        try {
            while (printEnabled){
                Thread.sleep(printCycleTime * 1000);
                SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                System.out.println("current time is " + sf.format(new Date()));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isPrintEnabled() {
        return printEnabled;
    }

    public void setPrintEnabled(boolean printEnabled) {
        this.printEnabled = printEnabled;
    }

    public int getPrintCycleTime() {
        return printCycleTime;
    }

    public void setPrintCycleTime(int printCycleTime) {
        this.printCycleTime = printCycleTime;
    }
}
