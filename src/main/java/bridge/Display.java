package bridge;

/**
 * 機能のクラス階層の最上位のクラス
 */
public class Display {

    private DisplayImpl impl;

    Display(DisplayImpl impl) {
        this.impl = impl;
    }

    void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
