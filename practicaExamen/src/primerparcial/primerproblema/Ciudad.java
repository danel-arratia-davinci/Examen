package primerparcial.primerproblema;

public class Ciudad {

    //ATRIBUTOS

    String nombre;

    int poblacion;




    // CONSTRUCTORES

    public Ciudad(String nombre, int poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }


    // METODOS


    @Override
    public String toString() {
        return "Esta Ciudad se llama " + this.nombre + "y su poblacion es de " + this.poblacion;
    }
}
