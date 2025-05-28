public class Coche {
    String matricula;
    String modelo;
    int velocidad;
    double gasolina;
    int distancia;


    /**
     * Constructor de la clase, deja velocidad y distancia a 0,
     * la gasolina la empieza en 100
     * @param mat
     * @param modelo
     */
    public Coche(String modelo, String mat ) {
        this.setMatricula(mat);
        this.setModelo(modelo);
        this.setVelocidad(0);
        this.gasolina = 100;
        this.distancia = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Avanza y quita gasolina
     * @param m
     */
    public boolean avanzar(int m) {
        this.distancia += m;
        this.gasolina -= m*0.2;
        return true;
    }

}
