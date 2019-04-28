package abstract_factory.factory;

public abstract class Item {

    protected String caption;

    Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
