public class Horse implements Humanable {
    @Override
    public void run() {
        System.out.println("Конь бежит");
    }

    @Override
    public void sleep() {
        System.out.println("Конь спит");
    }
}
