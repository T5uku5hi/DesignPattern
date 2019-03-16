package phantom;

abstract class Builder {

    PhantomBuilder<Progress> makeTitle(String title, PhantomBuilder<Initial> p) {
        buildTitle(title);
        return new PhantomBuilder<Progress>(p);
    }

    PhantomBuilder<Progress> makeString(String str, PhantomBuilder<Progress> p) {
        buildString(str);
        return p;
    }

    PhantomBuilder<Progress> makeItems(String[] items, PhantomBuilder<Progress> p) {
        buildItems(items);
        return p;
    }

    void close() {
        buildDone();
    }

    protected abstract void buildTitle(String title);
    protected abstract void buildString(String str);
    protected abstract void buildItems(String[] items);
    protected abstract void buildDone();
}
