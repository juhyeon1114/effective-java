package study.effectivejava.staticFactory.p2;

import java.util.Optional;
import java.util.ServiceLoader;

/**
 * 인터페이스 기반의 생성자를 사용할 수 있다.
 * 그에 따라서, 실제로는 다른 인스턴스들을 return할 수 있다.
 */
public class HelloServiceFactory {

//    public static HelloService of(String lang) {
//        if (lang.equals("ko")) {
//            return new KoreanHelloService();
//        } else {
//            return new EnglishHelloService();
//        }
//    }

    // 인터페이스에 static 메서드를 선언함
//    public static void main(String[] args) {
//        HelloService eng = HelloService.of("eng");
//        System.out.println("eng = " + eng.hello());
//    }

    // 인터페이스에 아무것도 선언이 되어 있지 않음
    public static void main(String[] args) {
        // ServiceLoader.load() : Java에서 제공하는 클래스를 불러올 수 있는 정적 메서드
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> helloService = loader.findFirst();
        helloService.ifPresent(h -> {
            System.out.println(h.hello());
        });
    }


}
