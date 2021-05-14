package Week_4;

public class practice_1 {

    public static void main(String[]args){
        System.out.println("===인생은 역시 한방! 로또 번호 자동생성기===");
        int i;
        int j;
        int bonus;
        int[] Numbs = new int[6];
        for (i = 0; i < 6; i++) {
            Numbs[i] = (int) (Math.random() * 45 + 1);
            for (j = 0; j < i; j++) {
                if (Numbs[i] == Numbs[j]) {
                    Numbs[i] = (int) (Math.random()*45+1);
                    j=0;
                }
                else {
                    break;
                }
            }

        }

        for (i=0;i<6;i++){

            System.out.print(Numbs[i]+"  ");
        }
        System.out.println(" ");
        System.out.println("실망하지마세요.보너스 번호가 있으니까요!");
        bonus = (int) (Math.random() * 45 + 1);
        for (j = 0; j < 6; j++)
            if (bonus == Numbs[j]) {
                bonus = (int) (Math.random() * 45 + 1);
                j = 0;
            }
            else {
                break;
            }
        System.out.println("보너스 번호 : "+bonus);
    }
}

