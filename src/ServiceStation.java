public class ServiceStation{

    public void check(Transport transport){
        System.out.println("Обслуживаем " + transport.getModel());
        transport.service();
    }
}
