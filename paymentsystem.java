interface Paym {
    void pay();
}

class UPI implements Paym {
    
    public void pay() {
        System.out.println("Payment made using UPI");
    }
}

class Card implements Paym {
    
    public void pay() {
        System.out.println("Payment made using Card");
    }
}

class Cash implements Paym {
    
    public void pay() {
        System.out.println("Payment made using Cash");
    }
}

public class paymentsystem {
    public static void main(String[] args) {

        UPI upi = new UPI();
        Card card = new Card();
        Cash cash = new Cash();

        upi.pay();
        card.pay();
        cash.pay();
    }
}