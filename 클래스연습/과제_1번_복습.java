package 클래스연습;

public class 과제_1번_복습 {
    static class Developer{
        String name;
        int year;
        int salary;
        Developer(){}
        Developer(String name,int year){
            this.name = name ;
            this.year = year ;

            if (year < 3){
                salary = 2800 + 100 * year;
            }
            else if ( year < 7){
                salary = 3500 + 100 * year;
            }
            else{
                salary = 4500 + 100 * year;
            }
        }

    }
    public static void main(String[] args) {

        Developer d1 = new Developer("박근원",2);
        Developer d2 = new Developer("김희진",5);
        Developer d3 = new Developer("박현준",9);

        System.out.println(d1.name +"의 연봉은 "+d1.salary+"만원입니다.");
        System.out.println(d2.name +"의 연봉은 "+d2.salary+"만원입니다.");
        System.out.println(d3.name +"의 연봉은 "+d3.salary+"만원입니다.");
    }
}
