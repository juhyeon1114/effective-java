package study.effectivejava.staticFactory.flyweight;

/**
 * Flyweight 패턴
 * - 자주 사용하는 인스턴스들을 미리 Factory에 생성해두고, 필요할 때마다 생성하는 것이 아닌 꺼내어 쓰는 패턴
 */
public class Main {

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('1', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('2', "white", fontFactory.getFont("nanum:14"));
    }

}
