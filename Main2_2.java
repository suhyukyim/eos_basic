package week2;

public class Main2_2 {
    public static void main(String[] args) {
        int[] min = {5, 10, 12, 35, 60, 100, 300};
        for (int num = 0; num < 7; num++)
            if (min[num] < 10) {
                System.out.println("주차 요금 합계는 총 0원입니다.");
            } else if (10 <= min[num] && min[num] < 30) {
                System.out.println("주차 요금 합계는 총 500원입니다.");
            } else
                if ((500 + ((min[num] - 20) / 10 * 508)) >= 10000) {
                System.out.println("주차 요금 합계는 총 10000원입니다");
                } else {
                System.out.println("주차 요금 합게는 총 " + (500 + ((min[num] - 20) / 10 * 500))+"입니다.");
            }

    }
}
