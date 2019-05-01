package decorator;

public abstract class Border extends Display {

    protected Display display;

    Border(Display display) {
        this.display = display;
    }
}
