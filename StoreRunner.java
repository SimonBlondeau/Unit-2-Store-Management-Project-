public class StoreRunner {
  public static void main(String[] args) {

  BabyToy testBabyToy = new BabyToy ("Baby Toy", 20.00);
  System.out.println(testBabyToy.toString());

  SoftToy testSoft = new SoftToy ("Soft Plush Toy", 15.00, "Soft");
  System.out.println(testSoft.toString());
  System.out.println("");

  testSoft.setPrice(21.50);
  testSoft.setTexture("Smooth");
  System.out.println("Updated " + testSoft.toString());
  System.out.println("");

  Ball testBall = new Ball("Tennis Ball,", 10.00, 5);
  System.out.println(testBall.toString());

  testBall.setPrice(15.00);
  testBall.setBall(20);
  System.out.println("Updated " + testBall.toString());
  }
}