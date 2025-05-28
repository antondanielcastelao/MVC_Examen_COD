public class Coche {
    String matricula;
    String modelo;
    int velocidad;


    /**
     * Constructor de la clase, deja velocidad a 0
     * @param mat
     * @param modelo
     */
    public Coche(String mat, String modelo) {
        this.setMatricula(mat);
        this.setModelo(modelo);
        this.setVelocidad(0);
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


}
