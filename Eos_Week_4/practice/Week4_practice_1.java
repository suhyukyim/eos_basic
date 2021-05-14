package practice;

public class Week4_practice_1 {
    public static void Random_Numbs() {
        int i;
        int j;
        int[] Numbs = new int[6];
        for (i = 0; i < 6; i++) {
            Numbs[i] = (int) (Math.random() * 45 + 1);
            for (j = 0; j < i; j++) {
                if (Numbs[i] == Numbs[j]) {
                    Numbs[j] = (int) (Math.random()*45+1);
                    j=0;
                } else {
                    break;
                }
            }

        }

        for (i=0;i<6;i++){

            System.out.print(Numbs[i]+"  ");
        }
        System.out.println(" ");
    }

    public static int bonus_Num() {
        int bonus;
        while (true) {
            bonus = (int) (Math.random() * 45 + 1);
            /* 조건 수정해야함 */
            if (true){
                break;
            }
            else {
                continue;
            }
        }
        return bonus;
    }
    public static void main(String[]args){
        System.out.println("===인생은 역시 한방! 로또 번호 자동생성기===");
        Random_Numbs();
        System.out.println("실망하지마세요.보너스 번호가 있으니까요!");
        System.out.println("보너스 번호 : "+bonus_Num() );
    }
}

