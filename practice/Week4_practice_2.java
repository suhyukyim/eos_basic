package practice;

import java.util.Scanner;

public class Week4_practice_2 {

    public static int sumDigistByStr(int n){
        int sum=0;
        int _int =n;
        String str;
        str=Integer.toString(_int);
        _int=Integer.parseInt(str);
        int len=str.length();
        for(int i=0;i<len;i++){
            String string = str.substring(i,i+1);
            sum+=Integer.valueOf(string);
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        System.out.println(sumDigistByStr(num));
    }
}
