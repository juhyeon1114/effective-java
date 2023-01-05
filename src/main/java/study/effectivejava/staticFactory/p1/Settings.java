package study.effectivejava.staticFactory.p1;

/**
 * 이 클래스는 #getInstance()로 생성한다.
 * @see #getInstance()
 */
// 오직 하나의 인스턴스만 생성하고 싶을 때.
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    // 외부에서 생성자를 생성할 수 없도록 제한
    private Settings() {
    }

    private static final Settings SETTINGS = new Settings();

    public static Settings getInstance() {
        return SETTINGS;
    }

}
