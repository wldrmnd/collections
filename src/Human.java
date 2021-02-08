import jdk.swing.interop.SwingInterOpUtils;

public class Human implements Humanable, Readable {

    @Override
    public void run() {
        System.out.println("Человек бежит :)");
    }

    @Override
    public void sleep() {
        System.out.println("Человек спит");

    }

    @Override
    public void read() {
        System.out.println("Человек читает");
    }
}
