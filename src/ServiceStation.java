import java.util.SortedMap;

public class ServiceStation implements NecessaryRepairs {

    @Override
    public void repair(Car[] cars) {
        if (cars != null) {
            for (int i = 0; i < cars.length; i++) {
                Car car = cars[i];
                System.out.println("Обслуживаем " + car.getModelName());
                for (int j = 0; j < car.getWheelsCount(); j++) {
                    System.out.println("Меняем шины");
                }
                System.out.println("Проверяем двигатель");
                System.out.println();
            }
        }
    }

    @Override
    public void repair(Bicycle[] bicycles) {
        if (bicycles != null) {
            for (int i = 0; i < bicycles.length; i++) {
                Bicycle bicycle = bicycles[i];
                System.out.println("Обслуживаем " + bicycle.getModelName());
                for (int j = 0; j < bicycle.getWheelsCount(); j++) {
                    System.out.println("Меняем покрышки");
                }
                System.out.println();

            }
        }
    }

    @Override
    public void repair(Truck[] trucks) {
        if (trucks != null) {
            for (int i = 0; i < trucks.length; i++) {
                Truck truck = trucks[i];
                System.out.println("Обслуживаем " + truck.getModelName());
                for (int j = 0; j < truck.getWheelsCount(); j++) {
                    System.out.println("Меняем шины");
                }
                System.out.println("Проверяем двигатель");
                System.out.println("Проверяем прицеп");
                System.out.println();
            }
        }
    }
}
