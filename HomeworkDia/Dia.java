package HomeworkDia;

public class Dia {
    public static void Dia1()
    {
        for (int num =1;num<6;num++)
        {
            for (int num2 = 0; num2 < num; num2++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void Dia2()
    {
        for (int num =5;num>0;num--)
        {
            for (int num2 =0;num2<num;num2++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public  static void Dia3()
    {
        for (int num =1;num<6;num++)
        {
            for (int num2 =0;num2<5-num;num2++)
            {
                System.out.print(" ");
            }
            for(int num3 =0;num3<num;num3++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void Dia4()
    {
        for (int num =5;num>0;num--)
        {
            for (int num2 =0;num2<5-num;num2++)
            {
                System.out.print(" ");
            }
            for(int num3 =0;num3<num;num3++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void Dia5()
    {
        for (int num=1;num<6;num++)
        {
            for (int num2 = 0; num2<5-num; num2++)
            {
                System.out.print(" ");
            }
            for (int num3=0;num3<2* num-1;num3++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void Dia6()
    {
        for (int num=5;num>0;num--)
        {
            for (int num2 = 0; num2<5-num; num2++)
            {
                System.out.print(" ");
            }
            for (int num3=0;num3<2* num-1;num3++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void Dia7()
    {
        for (int num=1;num<6;num++)
        {
            for (int num2 = 0; num2<5-num; num2++)
            {
                System.out.print(" ");
            }
            for (int num3=0;num3<2* num-1;num3++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int num=4;num>0;num--)
        {
            for (int num2 = 0; num2<5-num; num2++)
            {
                System.out.print(" ");
            }
            for (int num3=0;num3<2* num-1;num3++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void Dia8()
    {
        for (int num=5;num>1;num--)
        {
            for (int num2 = 0; num2<5-num; num2++)
            {
                System.out.print(" ");
            }
            for (int num3=0;num3<2* num-1;num3++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int num=1;num<6;num++)
        {
            for (int num2 = 0; num2<5-num; num2++)
            {
                System.out.print(" ");
            }
            for (int num3=0;num3<2* num-1;num3++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void Dia9()
    {
        for (int num=1;num<6;num++)
        {
            for (int num2 = 0; num2<5-num; num2++)
            {
                System.out.print("*");
            }
            for (int num3=0;num3<2* num-1;num3++)
            {
                System.out.print(" ");
            }
            for (int num2 = 0; num2<5-num; num2++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int num=4;num>0;num--)
        {
            for (int num2 = 0; num2<5-num; num2++)
            {
                System.out.print("*");
            }
            for (int num3=0;num3<2* num-1;num3++)
            {
                System.out.print(" ");
            }
            for (int num2 = 0; num2<5-num; num2++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void Dia10()
    {
        for (int num=5;num>1;num--)
        {
            for (int num2 = 0; num2<5-num; num2++)
            {
                System.out.print("*");
            }
            for (int num3=0;num3<2* num-1;num3++)
            {
                System.out.print(" ");
            }
            for (int num2 = 0; num2<5-num; num2++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int num=1;num<6;num++)
        {
            for (int num2 = 0; num2<5-num; num2++)
            {
                System.out.print("*");
            }
            for (int num3=0;num3<2* num-1;num3++)
            {
                System.out.print(" ");
            }
            for (int num2 = 0; num2<5-num; num2++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("1");
        Dia1();
        System.out.println("2");
        Dia2();
        System.out.println("3");
        Dia3();
        System.out.println("4");
        Dia4();
        System.out.println("5 피라미드");
        Dia5();
        System.out.println("6 역피라미드");
        Dia6();
        System.out.println("7 다이아몬드");
        Dia7();
        System.out.println("8 모레시계");
        Dia8();
        System.out.println("9 다이아몬드 반전");
        Dia9();
        System.out.println("10 모레시계 반전");
        Dia10();
    }
}

