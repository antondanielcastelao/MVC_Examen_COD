import java.util.Scanner;

public class View {
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        Controller.engadirCochesProba();
        int d = 1;
        while (d!=0) {
            System.out.println("----- Coches");
            System.out.println("0. Salir");
            System.out.println("1. Crear Coche");
            System.out.println("2. Modificar velocidad");
            System.out.println("3. Mostrar todos los coches");
            System.out.println("4. Repostar");
            System.out.println("5. Avanzar");
            d = sc.nextInt();
            switch (d) {
                case 1 -> Controller.crearCoche();
                case 2 -> Controller.modificaVelocidad();
                case 3 -> System.out.println(Controller.listaCoches());
                        // este bloque de codigo se corresponde a la funcion
                        // echarGasolina() del pseudocodigo

                        // aqi funcionan las 2 algo diferente porque desde Controller
                        // nos comunicamos con view para pedir los datos en vez
                        // de meterlos como parametros
                case 4 -> Controller.echarGasolina();
                        // este bloque de codigo se corresponde a la funcion
                        // avanzar() del pseudocodigo
                case 5 -> Controller.avanzar();

            }
        }
    }

    /**
     * Pide la matricula al usuario
     * @return
     */
    public static String pedirMatricula() {
        System.out.println("Introduce matricula: ");
        String mat = sc.next();
        return mat;
    }
    /**
     * Pide el modelo al usuario
     * @return
     */
    public static String pedirModelo() {
        System.out.println("Introduce modelo: ");
        return sc.next();
    }

    /**
     * Pide la velocidad al usuario
     * @return
     */
    public static int pedirVelocidad() {
        System.out.println("Introduce velocidad a modificar (- o +): ");
        return sc.nextInt();
    }

    /**
     * Pide litros de gasolina al usuario
     */
    public static int pedirGasolina() {
        System.out.println("Introduce litros de gasolina");
        return sc.nextInt();
    }

    /**
     * Pide distancia al usuario
     */
    public static int pedirDistancia() {
        System.out.println("Introduce distancia a avanzar");
        return sc.nextInt();
    }

    public static void msg(String t) {
        System.out.println("[+] MSG: " + t);
    }

    public static void avisoVelocidad() {
        System.out.println("[OBSERVER] La velocidad ha superado el limite.");
    }

}
