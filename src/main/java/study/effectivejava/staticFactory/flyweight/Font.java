package study.effectivejava.staticFactory.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Font {
    private String family;
    private int size;
}
