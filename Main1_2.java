package week2;

public class Main1_2 {
    public static void main(String[] args) {
    int num1 = 1;
    int num2 = 1;
        while(num1<=9) {
            while (num2 <= 9) {
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                num2++;
            }
            num2 = 1;
            num1++;


        }
    }

}
