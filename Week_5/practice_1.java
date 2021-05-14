package Week_5;

public class practice_1 {
    static class Hero{
        String name;
        int HP;
        int speed;
        int damage;
        Hero(String name,int HP,int speed,int damage){
            this.name=name;
            this.HP=HP;
            this.speed=speed;
            this.damage=damage;
        }
        void move(){
            System.out.println(name+"(이)가"+speed+"의 속도로 이동합니다.");
        }
        void  attack(Hero hero){
            int before_HP=HP;
            HP -= hero.damage;
            if (HP<=0){
                HP=0;
            }
            System.out.println(hero+"(이)가 "+name+"를 공격해서 체력을 "+before_HP+"에서 "+HP+"로 깎았습니다.");
        }
        String  getDetailnfo(){
            String str;
            str = "이름: "+name+"\n HP: "+HP+"\n speed: "+speed+"\n damage: "+damage;
            return str;
        }
    }
    public static void main(String[] args) {

        class Lucio extends Hero{
            final String str;
            Lucio() {
                super("lucio", 80, 100, 40);
                str = "치유 증폭";
                /* 생성자에 치유 증폭을 쓰면 왜 아래 함수에  적용이 x? */
            }
            void eSkill(String str){
                str = "치유 증폭";
                System.out.println(name+"(이)가 eSkill인 "+str+"을(를) 사용했습니다.");
            }
        }
        class Hanzo extends Hero{
            String str;
            /*왜 경고? Field 'str' is never used.*/
            Hanzo() {
                super("hanzo", 100, 50, 70);
            }
            void eSkill(String str){
                str = "갈래화살";
                System.out.println(name+"(이)가 eSkill인 "+str+"을(를) 사용했습니다.");
            }
        }
        String str = " ";
        Lucio lucio = new Lucio();
        Hanzo hanzo = new Hanzo();

        hanzo.move();
        hanzo.eSkill(str);
        System.out.println(hanzo.getDetailnfo());

        lucio.move();
        lucio.eSkill(str);
        System.out.println(lucio.getDetailnfo());

        hanzo.attack(lucio);
        lucio.attack(hanzo);

        System.out.println(hanzo.getDetailnfo());
        System.out.println(lucio.getDetailnfo());
    }
}
