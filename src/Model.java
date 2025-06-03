import java.util.ArrayList;

public class Model {
    public static ArrayList<Coche> parking = new ArrayList<>();
    // instanciamos todos los observadores
    static Observer oLimite = new ObserverVelocidad();
    static Observer oGasolina = new ObserverGasolina();

    // los almacenamos en una lista de observadores
    static ArrayList<Observer> observers = new ArrayList<>();
    static {
        observers.add(oLimite);
        observers.add(oGasolina);
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
        // Cada vez que se cambia la velocidad notificamos a todos los observadores
        notifyObservers(aux);
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

    public static boolean avanzar(String matricula, int m) {
        Coche c = getCoche(matricula);
        c.avanzar(m);
        notifyObservers(c);
        return true;
    }

    public static void notifyObservers(Coche coche) {
        // avisamos a todos los observadores
        for (Observer o: observers) {
            o.update(coche);
        }
    }
}
