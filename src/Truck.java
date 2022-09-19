public class Truck extends Transport implements Trailer {
    public Truck(String modelName, int wheelsCoun){
        super(modelName, wheelsCoun);}
@Override
        public void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }
    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }

}
