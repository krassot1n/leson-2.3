public class Car extends MotorTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String getModel() {
        return getModelName();
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }
}
