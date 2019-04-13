import singleton.NonThreadSafeSingleton;

public class Main extends Thread {

    public static void main(String[] args) {
        System.out.println("Start.");
        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
        System.out.println("End.");
    }

    public void run() {
        NonThreadSafeSingleton obj = NonThreadSafeSingleton.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }

    private Main(String name) {
        super(name);
    }
}
