package 클래스연습;

public class 오버워치 {
    static class Hero{
        int HP;
        int speed;
        int damage;
        String name;
        Hero(){}
        Hero(String name,int HP,int speed,int damage){
            this.name = name;
            this.HP = HP;
            this.speed = speed;
            this.damage = damage;
        }
    void move(){
        System.out.println( this.name +"(이)가 "+ speed+"의 속도로 이동합니다.");
        }

    void eSkill(){
        System.out.println( this.name +"(이)가 스킬을 사용했습니다.");
    }

    void attack(Hero hero){
            int HP_before = hero.HP;
            hero.HP -= this.damage;
            if (hero.HP < 0){
                hero.HP =0;
            }
        System.out.println(this.name+ "(이)가"+hero.name+"을 공격해서 체력을"+HP_before+"에서"+hero.HP+"로 깍았습니다.");
        }
    String getdetailnfo(){
            String str = "";
            str="이름: "+this.name
                    +"\nHp: "+this.HP
                    +"\nspeed: "+this.speed
                    +"\ndamage: "+this.damage;
            return str;
        }
    }




    public static void main(String[] args) {


        Hero hanzo = new Hero("hanzo",100,50,70);
        Hero lucio = new Hero("lucio",80,100,40);

        hanzo.move();
        hanzo.eSkill();
        System.out.println(hanzo.getdetailnfo());

        lucio.move();
        lucio.eSkill();
        System.out.println(lucio.getdetailnfo());

        hanzo.attack(lucio);
        lucio.attack(hanzo);

        System.out.println(hanzo.getdetailnfo());
        System.out.println(lucio.getdetailnfo());
    }
}
