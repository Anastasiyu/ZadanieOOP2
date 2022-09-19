public abstract class AvtoTransport extends Transport {
    public AvtoTransport (String modelName, int wheelsCoun){
        super(modelName, wheelsCoun);
    }



    @Override
    public abstract void service();


    @Override
    public abstract void updateTyre();

}
