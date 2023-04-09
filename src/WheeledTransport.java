public abstract class WheeledTransport implements Transport {
    private String modelName;
    private int wheelCount;

    public WheeledTransport(String modelName, int wheelCount) {
        this.modelName = modelName;
        this.wheelCount = wheelCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void updateTyre() {
        for (int i = 0; i < wheelCount; i++) {
            System.out.println("Меняем покрышки");
        }
    }
}
