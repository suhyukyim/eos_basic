package Practice;

public class WorkTest {
    public interface BurgerCook{
        void makeBurger();
        void makeSalad();
    }
    public static class HotelCook implements BurgerCook{
        public void makeBurger() {
            System.out.println("호텔식 햄버거 만듦");
        }
        public void makeSalad() {
            System.out.println("호텔식 샐러드 만듦");
        }
    }
    public static class PartTimer implements BurgerCook{
        public void makeBurger() {
            System.out.println("알바식 햄버거 만듦");
        }
        public void makeSalad() {
            System.out.println("알바식 샐러드 만듦");
        }
    }
    public static class BurgerClerk{
        public void oderBurger(BurgerCook cook){
            System.out.println("주방에 햄버거를 주문합니다.");
            cook.makeBurger();
        }
        public void orderSalad(BurgerCook cook){
            System.out.println("주방에 샐러드를 주문합니다.");
            cook.makeSalad();
        }
    }
    public static void main(String[] args) {
        BurgerCook hcook = new HotelCook();
        BurgerCook pcook = new PartTimer();
        BurgerClerk bk = new BurgerClerk();

        System.out.println("호텔식 햄버거 주문요청 들어옴");
        bk.oderBurger(hcook);

        System.out.println("알바식 샐러드 주문요청 들어옴");
        bk.orderSalad(pcook);

        System.out.println("알바식 햄버거 주문요청 들어옴");
        bk.oderBurger(pcook);

        System.out.println("호텔식 샐러드 주문요청 들어옴");
        bk.orderSalad(hcook);
    }
}
