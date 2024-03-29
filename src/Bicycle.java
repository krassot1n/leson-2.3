public class Bicycle extends WheeledTransport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String getModel() {
        return getModelName();
    }

    @Override
    public void service() {
        updateTyre();
    }
}
