package codingtest;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // 입력
        Scanner scanner = new Scanner(System.in);

        String[] busTimes = new String[5];
        String currentTime = scanner.next();

        for(int i = 0 ; i < busTimes.length; i ++)
            busTimes[i] = scanner.next();

        // 결과
        System.out.println(recommendBus(currentTime, busTimes));
    }

    /**
     * 현재 시간과 버스 시간 배열을 받아 다음 버스가 도착할 때 까지 기다려야하는 시간 계산(분)
     */
    protected static int recommendBus(String currentTime, String[] busTimes) {
        // 현재 시간이 포함된 버스 시간 배열 생성
        //currentInBusTimes = {currentTime, scanner1, scanner2, scanner3, scanner4, scanner5};
        String[] currentInBusTimes = new String[6];
        currentInBusTimes[0] = currentTime;
        System.arraycopy(busTimes, 0, currentInBusTimes, 1, busTimes.length);

        // 오름차순으로 정렬
        Arrays.sort(currentInBusTimes);

        // 다음 버스 시간 구하기
        int currentIndex = Arrays.binarySearch(currentInBusTimes, currentTime);  // 현재 시간 index
        int rear = (currentIndex+1)%currentInBusTimes.length;                    // 다음 시간 index 구하기 (queue rear 계산)
        String nextTime = currentInBusTimes[rear];

        // HH:mm 를 (int) 분으로 변환
        int nextMinute = timeToMinute(nextTime);
        int currentMinute = timeToMinute(currentTime);

        // 몇 분 기다려야 하는지 계산(절대값)
        return Math.abs(nextMinute-currentMinute);
    }

    /**
     * HH:mm 형식의 시간을 int 형 분으로 변환
     */
    protected static int timeToMinute(String time) {
        String[] times = time.split(":");
        int hour = Integer.parseInt(times[0]);
        int minute = Integer.parseInt(times[1]);
        return hour*60+minute;
    }
}

/**
 * Test Code
 */
class MainTest extends Main {

    public static void main(String[] args) {
        testTimeToMinute();
        testRecommendBus();
    }

    // @Test
    public static void testTimeToMinute() {
        //given
        String time1 = "00:00";
        String time2 = "05:00";
        String time3 = "23:59";

        //when
        int result1 = Main.timeToMinute(time1);
        int result2 = Main.timeToMinute(time2);
        int result3 = Main.timeToMinute(time3);

        //then
        System.out.println(result1 == 0);
        System.out.println(result2 == 300);
        System.out.println(result3 == 1439);
    }

    // @Test
    public static void testRecommendBus() {
        //given
        String currentTime1 = "17:22";
        String[] busTimes1 = {"05:14","00:55","06:14","07:35","22:45"};
        String currentTime2 = "14:53";
        String[] busTimes2 = {"14:21","05:37","14:39","21:23","02:30"};
        String currentTime3 = "09:38";
        String[] busTimes3 = {"08:32","17:24","21:33","12:43","11:46"};

        //when
        int result1 = Main.recommendBus(currentTime1, busTimes1);
        int result2 = Main.recommendBus(currentTime2, busTimes2);
        int result3 = Main.recommendBus(currentTime3, busTimes3);

        //then
        System.out.println(result1 == 323);
        System.out.println(result2 == 390);
        System.out.println(result3 == 128);
    }
}