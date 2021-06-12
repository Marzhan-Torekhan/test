package Tank;

public class Main {
    public static void main(String[] args) {
        Tank tank1 = new Tank(10,15);
        tank1.goForward(20);
        tank1.printPosition();
        tank1.goForward(100);
        tank1.printPosition();

        Tank tank2 = new Tank(10,2,200);
        tank2.printPosition();

        Tank jastTank = new Tank();
        jastTank.printPosition();
    }
}
