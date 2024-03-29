public class Truck extends MotorTransport{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }

    @Override
    public String getModel() {
        return getModelName();
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}
