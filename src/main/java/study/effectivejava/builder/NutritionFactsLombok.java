package study.effectivejava.builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder(builderClassName = "Builder")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class NutritionFactsLombok {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;
}

