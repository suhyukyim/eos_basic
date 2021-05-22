package HomeWork;

public class HomeWork_2 {
    interface Healer{
        public void healingAura();//초당 체력회복 +10
        public void holyArmor();// 데미지 감소 -10
    }
    interface Sorcerer{
        public void fireArmor(); //주변 적 초당 데미지 +10
        public void thunderBlade(); // 공격시 추가 데미지 +10
    }
    interface Tanker{
        public void increaseArmor();// 아머 +5
        public void increaseHp();// 체력 +100
    }
    public static class Knight implements Tanker{
        String Name;
        int HP;
        int Armor;
        Knight(String Name,int HP,int Armor){
            this.Name=Name;
            this.HP=HP;
            this.Armor=Armor;
        }
        public void increaseArmor() {
            System.out.println("["+Name+"] "+"increaseAromor() 시전!");
            System.out.println("    아머가 +5증가합니다.");
            Armor+=5;
        }
        public void increaseHp() {
            System.out.println("["+Name+"]"+"increaseHp() 시전!");
            System.out.println("    체력이 +100 증가합니다.");
            HP+=100;
        }
    }
    public static class HolyKnight extends Knight implements Healer{

        HolyKnight(String Name, int HP, int Armor) {
            super(Name, HP, Armor);
        }
        public void healingAura() {
            System.out.println("["+Name+"] "+"healingAura() 시전!");
            System.out.println("    초당 체력회복이 +10 증가합니다.");
        }
        public void holyArmor() {
            System.out.println("["+Name+"] "+"holyArmor() 시전!");
            System.out.println("    데미지를 -10 덜 받습니다.");
        }
    }
    public static class MagicKnight extends Knight implements Sorcerer{

        MagicKnight(String Name, int HP, int Armor) {
            super(Name, HP, Armor);
        }
        public void fireArmor() {
            System.out.println("["+Name+"] "+ "fireArmor() 시전!");
            System.out.println("    주변 적에게 초당 +10의 데미지를 줍니다.");
        }
        public void thunderBlade() {
            System.out.println("["+Name+"] "+ "thunderBlade() 시전!");
            System.out.println("    매 공격시 +10의 추가 데미지를 줍니다.");
        }
    }
    public class Main {
        public  void main(String[] args) {
            // 두 영웅 생성
            Knight uther = new HolyKnight("우서", 200, 10);
            Knight arthas = new MagicKnight("아서스", 150, 8);
            // 우서: 기사 버프
            uther.increaseHp();
            uther.increaseArmor();
            // 우서: 성기사 버프
            HolyKnight holyUther = (HolyKnight) uther;
            holyUther.healingAura();
            holyUther.holyArmor();
            // 아서스: 기사 버프
            arthas.increaseHp();
            arthas.increaseArmor();
            // 아서스: 마검사 버프
            MagicKnight magicArthas = (MagicKnight) arthas;
            magicArthas.fireArmor();
            magicArthas.thunderBlade();
        }
    }
}

