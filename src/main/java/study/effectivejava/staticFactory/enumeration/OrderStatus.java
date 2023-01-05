package study.effectivejava.staticFactory.enumeration;

// Enum의 각 값들은 jvm내에서 오직 1번만 생성된다.
public enum OrderStatus {

    PREPARED, SHIPPED, DELIVERING, COMPLETED

}
