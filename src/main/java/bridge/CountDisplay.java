package bridge;

/**
 * 機能のクラス階層
 * -  Display.javaには「表示する」という機能しかないが、
 *    このクラスでは「指定回数だけ表示する」という機能が追加されている。
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    // 機能が追加されている
    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
