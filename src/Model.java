import java.util.ArrayList;

public class Model {
    public static ArrayList<Coche> parking = new ArrayList<>();

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
}
