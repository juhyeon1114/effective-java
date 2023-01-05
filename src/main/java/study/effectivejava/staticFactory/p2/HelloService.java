package study.effectivejava.staticFactory.p2;

public interface HelloService {

    public String hello();

    // 인터페이스에 static 메서드를 선언할 수 있다. - Java 8
//    static HelloService of(String lang) {
//        if (lang.equals("ko")) {
//            return new KoreanHelloService();
//        } else {
//            return new EnglishHelloService();
//        }
//    }

}
