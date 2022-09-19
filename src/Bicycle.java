public class Bicycle extends AvtoTransport{
 public Bicycle(String modelName, int wheelsCoun){
     super(modelName, wheelsCoun);}

    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }
    public void service() {
        updateTyre();
    }
}
