import java.util.Scanner;

public class View {
    static Scanner sc = new Scanner(System.in);

    public  void menu() {
        Controller.engadirCochesProba();
        int d = 1;
        while (d!=0) {
            System.out.println("----- Coches");
            System.out.println("0. Salir");
            System.out.println("1. Crear Coche");
            System.out.println("2. Modificar velocidad");
            System.out.println("3. Mostrar todos los coches");
            d = sc.nextInt();
            switch (d) {
                case 1 -> Controller.crearCoche();
                case 2 -> Controller.modificaVelocidad();
                case 3 -> System.out.println(Controller.listaCoches());
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

}
