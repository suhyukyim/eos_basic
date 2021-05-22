package HomeWork;
import java.util.Scanner;

public class HomeWork_1 {
    public interface interface_account{
        void  deposit(int money);
        void  withdraw(int money);
        void  showBalance();
    }
    public static class Account implements interface_account{
        private String accountNo;//계좌번호
        private int balance=0;//잔액
        Account(String accountNo){
            this.accountNo=accountNo;
        }
        public void deposit(int money) {
            balance+=money;
        }
        public void withdraw(int money) {
            if (balance>=money){
                balance-=money;
            } else {
                System.out.println("잔고 부족!");
            }
        }
        public void showBalance() {
            System.out.println("계좌번호: "+accountNo);
            System.out.println("잔액: "+balance);
        }
    }

    public void main(String[] args) {
        int num;
        int money;
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        Account person = new Account(str);
        while (true){
            System.out.println("--------------------------------");
            System.out.println("1.예금 | 2.출금. | 3.잔고 | 4.종료");
            System.out.println("--------------------------------");
            System.out.print("선택>");
            num = sc.nextInt();
            if (num == 4) {
                System.out.println("프로그램 종료");
                break;
            } else if (num == 3) {
                person.showBalance();
            } else if (num == 2) {
                System.out.print("출금액>");
                money = sc.nextInt();
                person.withdraw(money);
            } else if (num == 1) {
                System.out.print("예금액>");
                money = sc.nextInt();
                person.deposit(money);
            } else{
                System.out.println("입력 오류!");
            }

        }
    }
}
