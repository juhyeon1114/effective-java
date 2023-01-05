package study.effectivejava.staticFactory.ref.enumeration;

import java.util.EnumMap;
import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {
        // Enum 순회
        OrderStatus[] values = OrderStatus.values();
        for (OrderStatus value : values) {
            System.out.println("value = " + value);
        }

        /**
         * Enum을 Key로 갖고 있는 Map -> EnumMap을 쓰자.
         * - Array를 이용하기 때문에 성능적으로 우수
         * - 해싱 과정이 필요 없어 HashMap보다 빠름
         * - null을 key로 넣는 경우 NullPointerException 발생
         * - thread-safe하지 않음
         */
        EnumMap<OrderStatus, Object> map = new EnumMap<>(OrderStatus.class);
        map.put(OrderStatus.DELIVERING, "hello");
        System.out.println("enumMap = " + map);

        /**
         * Enum을 사용하는 Set -> EnumSet을 쓰자
         */
        EnumSet<OrderStatus> set = EnumSet.allOf(OrderStatus.class);
        EnumSet<OrderStatus> emptySet = EnumSet.noneOf(OrderStatus.class);
    }

}
