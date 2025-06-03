public class ObserverGasolina implements Observer {
    @Override
    public void update(Coche coche) {
        if (coche.gasolina < 10) {
            View.msg("[OBSERVER] Gasolina baja, respostar");
        }
    }
}
