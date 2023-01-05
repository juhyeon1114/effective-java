package study.effectivejava.staticFactory.ref.staticMethodInInterface;

public interface HelloService {

    String hello();

    // 정적 메서드: 인터페이스에서도 정적메서드를 쓸 수 있다.
    static String hi() {
        return "hi";
    }

    // private 정적 메서드: 인터페이스 내부적으로 공통되는 로직을 처리하기 위함
    static private String common() {
        return "common";
    }

    // 기본 메서드: 인터페이스를 사용하는 모든 인스턴스에서 해당 메서드를 쓸 수 있다.
    static String bye() {
        return "bye";
    }

}
