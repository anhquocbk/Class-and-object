package Bai3;

import java.util.Scanner;

public class stopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time time = new Time();
        System.out.println("1: Start");
        int a = scanner.nextInt();
        long start = System.currentTimeMillis();
        time.setStartTime(start);
        System.out.println("2: Stop");
        int b = scanner.nextInt();
        long stop = System.currentTimeMillis();
        time.setEndTime(stop);
        System.out.println("Display time: " + time.getElapsedTime() + " millisecond");
    }
}
class Time {
    private long startTime, endTime ;
    public Time() {

    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
//    public long getStartTime() {
//        return startTime;
//    }
//    public long getEndTime() {
//        return endTime;
//    }
//    public long start() {
//        return startTime;
//    }
//    public long stop() {
//        return endTime;
//    }
    public long getElapsedTime(){
        return endTime - startTime;
    }

}