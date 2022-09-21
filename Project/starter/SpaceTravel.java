import java.util.Scanner;

public class SpaceTravel {
  static {
    System.loadLibrary("native");
  }

  public native static int measureDistance(double s, double t);

  public static void main(String[] args) {
    double speed = 1;
    double time = 1;
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome scientist! Let's get started with measuring the distance a rocket can travel in a set amount of time.");
    System.out.println("At what speed (in miles) will the rocket travel?");
    speed = input.nextDouble();
    System.out.println("How much time (in hours) will the rocket travel?");
    time = input.nextDouble();

    int distance = measureDistance(speed, time); 

    System.out.println("The distance the rocket will travel at " + speed +" miles in "+ time + " hours is " + distance + " miles/hour." );
    input.close();
  }
}