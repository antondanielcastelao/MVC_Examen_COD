public class ObserverVelocidad implements Observer {

    @Override
    public void update(Coche coche) {
        if (coche.velocidad > 120) {
            View.avisoVelocidad();
        }
    }
}
