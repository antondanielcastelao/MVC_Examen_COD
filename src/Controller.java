public class Controller {

    /**
     * Añade  coches de prueba llamando al model
     * @return
     */
    public static boolean engadirCochesProba() {
        Model.crearCoche("Audi", "123");
        Model.crearCoche("Mercedes", "456");
        Model.crearCoche("Lexus", "789");
        return true;
    }
    /**
     * Añade un coche llamando al model
     * @return
     */
    public static boolean crearCoche() {
        String modelo = View.pedirModelo();
        String matricula = View.pedirMatricula();
        Model.crearCoche(
                matricula,
                modelo);
        return true;
    };

    /**
     * Modifica la velocidad de un coche
     * @return
     */
    public static boolean modificaVelocidad() {
        String mat = View.pedirMatricula();
        int v = View.pedirVelocidad();
        Model.cambiarVelocidad(mat, v);
        return true;
    }

    /**
     * Hace un listado de coches
     * @return
     */
    public static String listaCoches() {
        StringBuilder aux = new StringBuilder("\n+++ Listado de coches:\n");
        for (Coche c: Model.parking) {
            aux.append("\nMatricula ").append(c.getMatricula())
                    .append(" Modelo ").append(c.getModelo())
                    .append("\nVelocidade: ").append(c.getVelocidad())
                    .append(" Gasolina ").append(c.gasolina)
                    .append(" Distancia ").append(c.distancia)
                    .append("\n");
        }

        return aux.toString();
    }

    /**
     * Añade gasofa a un coche
     * @return
     */
    public static boolean echarGasolina() {
        String mat = View.pedirMatricula();
        int l = View.pedirGasolina();
        Model.echarGasolina(mat, l);
        return true;
    }

    /**
     * Avanza n metros
     * @return
     */
    public static boolean avanzar() {
        String mat = View.pedirMatricula();
        int m = View.pedirDistancia();
        Model.avanzar(mat, m);
        return true;
    }

}
