package singleton;

public class TicketMaker {

    private int ticket = 1000;
    private TicketMaker(){}
    private static TicketMaker singleton = new TicketMaker();

    public static TicketMaker getInstance() {
        return singleton;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
