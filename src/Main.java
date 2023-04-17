public class Main {
    public static void main(String[] args) {

        int start = 100; // остаток на счете
        int replenishment = 1200; // сумма пополнения
        int balance; // итоговый баланс

        if (replenishment >= 1000) {
            balance = start + replenishment + replenishment / 100 ;
        } else {
            balance = start + replenishment;
        }

        System.out.println("Баланс: " + balance + " руб. ни в чём себе не отказывай.");

    }
}