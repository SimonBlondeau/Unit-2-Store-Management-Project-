public class SoftToy extends BabyToy{
  String texture;

  public SoftToy() {
    super();
    this.texture = "default";
  }
 
  public SoftToy(String name, double price, String texture) {
    super(name, price);
    this.texture = texture;
  }

  public String getTexture() {
    return texture;
}

  public void setTexture(String textureUpdate) {
    texture = textureUpdate;
    }

  public String toString() {
    String text = "Product: SoftToy ";
    text += super.toString();
    text += ", Texture: " + texture;
    return text;
  }

}

