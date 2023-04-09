public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[]{
                new Bicycle("Аист", 2),
                new Bicycle("Stels", 2),
                new Car("Audi", 4),
                new Car("Ferrari", 4),
                new Truck("Volvo", 6),
                new Truck("Mercedes", 8)};

        ServiceStation station = new ServiceStation();
        for (Transport transport : transports) {
            station.check(transport);
            System.out.println();
        }


    }
}
