public class Ball extends BabyToy {
int ball;

  public Ball() {
    super();
    this.ball = 0;
  }

  public Ball(String name, double price, int ball) {
    super(name, price);
    this.ball = ball;
  }

    public int getBall() {
      return  ball;
    }

  public void setBall(int ball) {
    this.ball = ball;
  }

  public String toString() {
    String text = "Product: Ball ";
    text += "Name: " + super.getName() + " Price: " + this.getPrice();
    text += ", Ball Count: " + ball;
    return text;
  }

}





