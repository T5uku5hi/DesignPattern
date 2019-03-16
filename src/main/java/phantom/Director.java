package phantom;

public class Director {

    private Builder builder;

    public Director(Builder builder) { this.builder = builder; }

    public void construct() {
        PhantomBuilder<Progress> phantomBuilder = builder.makeTitle("Greeting", PhantomBuilder.newBuilder());
        builder.makeString("朝から昼にかけて", phantomBuilder);
        builder.makeItems(new String[]{ "おはようございます。", "こんにちは。"}, phantomBuilder);
        builder.close();
    }
}