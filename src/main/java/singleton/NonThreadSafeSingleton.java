package singleton;

public class NonThreadSafeSingleton {

    private static NonThreadSafeSingleton singleton = null;
    private NonThreadSafeSingleton(){
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

    public static NonThreadSafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new NonThreadSafeSingleton();
        }
        return singleton;
    }
}
