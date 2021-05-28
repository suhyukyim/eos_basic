import java.util.Scanner;
class IndexOutOfBoundsException extends Exception{
    public IndexOutOfBoundsException(){
        super("에러발생");
    }
}
public class HomeWork_1 {
    static void call(int[] str,int num){
            System.out.println("call value : "+str[num]);
    }
    public static void main(String[] args) throws IndexOutOfBoundsException {
        int[] str = {2,0,0,1,0,7,2,7};

        try {
            int num = readNum();
            call(str,num);
        }catch(IndwxOutIfBoundsException e){
             System.out.println(e.getMessage());
        }finally{
            System.out.println("해당 문장은 무조건 수행");
        }
    }
    public static int readNum() throws IndexOutOfBoundsException{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<0 || num >=8)
            throw new IndexOutOfBoundsException();
        return num;
    }
}
