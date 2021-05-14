package Week_5;

import java.util.Currency;

public class homwork_1 {
    static class currency{
        String unit ;
        double money;
        currency(double money,String unit) {
            this.unit = unit;
            this.money = money;
        }
    }
    public static void main(String[] args) {
        class KRW extends currency{
            KRW(double money,String unit) {
                super(money, unit);

            }
            public void country(){
                super.country();
            }
        }
        class USD extends currency{
            USD( double money,String unit) {
                super(money , unit);
            }
            public void country(){
                super.country();
            }
        }
        class EUR extends currency{
            EUR(double money,String unit) {
                super(money, unit);
            }
            public void country(){
                super.country();
            }
        }
        class JPY extends currency{
            JPY(double money,String unit) {
                super(money, unit);
            }
            public void country(){
                super.country();
            }
        }

        KRW krw = new KRW(1500.0, "원");
        USD usd = new USD(100.5,"달러");
        EUR eur = new EUR(260.87,"유로");
        JPY jpy =new JPY(1400.0,"엔");

        Currency[] currencies = {krw, usd ,eur, jpy};

        for (Currency c : currencies){
            System.out.println(c.toString());
        }
    }
}
