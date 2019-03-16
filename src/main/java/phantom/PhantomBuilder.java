package phantom;

class PhantomBuilder<Status extends BuildStatus> {

    private PhantomBuilder() {}

    PhantomBuilder(PhantomBuilder<? extends BuildStatus> p) {}

    static PhantomBuilder<Initial> newBuilder() {
        return new PhantomBuilder<>();
    }
}