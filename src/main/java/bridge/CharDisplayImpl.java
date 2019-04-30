package bridge;

public class CharDisplayImpl extends DisplayImpl {

    private char head;
    private char body;
    private char foot;

    public CharDisplayImpl(char head, char body, char foot) {
        this.head = head;
        this.body = body;
        this.foot = foot;
    }

    @Override
    void rawOpen() {
        System.out.print(head);
    }

    @Override
    void rawPrint() {
        System.out.print(body);
    }

    @Override
    void rawClose() {
        System.out.println(foot);
    }
}
