public class Car extends AvtoTransport{
    public Car(String modelName, int wheelsCoun){
        super(modelName, wheelsCoun);}
@Override
    public void updateTyre() {
        System.out.println("Меняем покрышку автомобиля");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }

    public void service() {
        updateTyre();
        checkEngine();
    }
}
