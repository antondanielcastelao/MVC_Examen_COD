import java.util.ArrayList;

public class Model {
    public static ArrayList<Coche> parking = new ArrayList<>();
    // al iniciar el programa creamos un arraylist de observer
    public static ArrayList<Observer> observers = new ArrayList<>();
    static {
        // añadimos los observers instanciados al arraylist
        observers.add(new ObserverGasolina());
    }
    /**
     * Añade un nuevo coche al parking
     * @param modelo
     * @param matricula
     * @return
     */

    public static Coche crearCoche(String modelo, String matricula) {
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca un coche en el parking por matricula
     * @param matricula
     * @return
     */
    public static Coche getCoche(String matricula) {
        for (Coche c: parking) {
            if (c.getMatricula().equals(matricula)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Aumenta la velocidad de un coche
     * @param matricula
     * @param velocidad
     */
    public static void cambiarVelocidad(String matricula, int velocidad) {
        Coche aux = getCoche(matricula);
        aux.setVelocidad(aux.getVelocidad() + velocidad);
    };

    /**
     * Añade gasofa a un coche
     * @return
     */
    public static boolean echarGasolina(String matricula, int litros) {
        Coche c = getCoche(matricula);
        c.gasolina += litros;
        return true;
    }

    /**
     * Avanza m metros de un coche segun su matricula
     * @param matricula
     * @param m
     * @return
     */
    public static boolean avanzar(String matricula, int m) {
        Coche c = getCoche(matricula);
        c.avanzar(m);
        // cada vez que se avanza, como se consume gasolina
        // avisamos a todos los observadores por si tenemos que repostar
        notifyObservers(c);
        return true;
    }

    /**
     * Metodo notify para actualizar a todos los observadores
     * instanciados en el arraylist
     * @param c
     */
    public static void notifyObservers(Coche c) {
        for (Observer o: observers) {
            o.update(c);
        }
    }

}
