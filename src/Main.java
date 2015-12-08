import ch1_tour.Fibonacci.Fibonacci3;
import ch1_tour.Point.PointMain;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Fibonacci3.printFibonacci3();

//        PingPongThread thread1 = new PingPongThread("ping");
//        PingPongThread thread2 = new PingPongThread("pong");
//        thread1.start();
//        thread2.start();

        PointMain.run();
    }
}
