package study.effectivejava.functionalInterface;

@FunctionalInterface
public interface HelloFunctionalInterface<T> {

    T hello();

    default String bye() {
        return "bye";
    }

    static String world() {
        return "world";
    }

}
