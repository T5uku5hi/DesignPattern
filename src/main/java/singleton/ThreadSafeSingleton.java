package singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton singleton = null;
    private ThreadSafeSingleton(){
        System.out.println("インスタンスを生成しました");
        slowdown();
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new ThreadSafeSingleton();
        }
        return singleton;
    }
}
