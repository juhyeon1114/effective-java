package study.effectivejava.staticFactory.p1;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

//    public Order(Product product, boolean prime) {
//        this.product = product;
//        this.prime = prime;
//    }

    // === 정적 팩토리 메서드 ===
    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

}
