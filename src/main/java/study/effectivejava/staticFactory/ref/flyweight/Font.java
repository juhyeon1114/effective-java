package study.effectivejava.staticFactory.ref.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Font {
    private String family;
    private int size;
}
