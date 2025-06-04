public class ObserverGasolina implements Observer {

    @Override
    public void update(Coche c) {
        // cada vez que actualizamos comprobamos que el nivel de gasolina
        // esta por encima de 10l para enviar la alerta al usuario en caso contrario
        if (c.gasolina < 10) {
            View.msg("[OBSERVER] Alerta: Repostar");
        }
    }
}
