package week2;

public class Main2_2 {
    public static void main(String[] args) {
        int[] min = {5, 10, 12, 35, 60, 100, 300};
        int sum;
        sum=0;
        for (int num = 0; num < 7; num++)
            if (min[num] < 10) {
                sum=sum+0;
            } else if (10 <= min[num] && min[num] < 30) {
                sum=sum+500;
            } else
                if ((500 + ((min[num] - 20) / 10 * 508)) >= 10000) {
                sum=sum+10000;
                } else {
                sum=sum+((500 + ((min[num] - 20) / 10 * 500)));
            }
        System.out.println("주차 요금 합계는 총"+sum+"원입니다.");
    }
}
