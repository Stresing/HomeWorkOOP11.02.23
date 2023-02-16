import javax.tools.Tool;

public class Fruits {

    String name;
    String color;
    double weight;
    double buyPrice;

    public Fruits(String name, String color, double weight, double buyPrice) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.buyPrice = buyPrice;
    }

   @Override
   public String toString() {
       
       return "Fruts{" +
       "name="+name+
       ", color=" +color+
       ", buy price="+ buyPrice +
       ", weight= " + weight +
       '}';
   }

    public String getNameFruts() {
        return this.name;
    }

    public double getFruitsWeight(){
        return this.weight;

    }
}
