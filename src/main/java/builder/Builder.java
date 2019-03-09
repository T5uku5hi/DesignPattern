package builder;

public abstract class Builder {

    private boolean initialized = false;

    void makeTitle(String title) {
        if (!initialized) {
            buildTitle(title);
            initialized = true;
        }
    }

    void makeString(String str) {
        if (initialized) {
            buildString(str);
        }
    }

    void makeItems(String[] items) {
        if (initialized) {
            buildItems(items);
        }
    }

    void close() {
        if (initialized) {
            buildDone();
        }
    }

    protected abstract void buildTitle(String title);
    protected abstract void buildString(String str);
    protected abstract void buildItems(String[] items);
    protected abstract void buildDone();
}
