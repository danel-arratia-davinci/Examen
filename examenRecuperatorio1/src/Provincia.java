import java.util.ArrayList;

public class Provincia {
    /// ATRIBUTOS
    String nombre;
    String capital;
    int anioFundacion;
    ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();


    //// CONSTRUCTOR


    public Provincia(String nombre, String capital, int anioFundacion) {
        this.nombre = nombre;
        this.capital = capital;
        this.anioFundacion = anioFundacion;
    }
 /// METODOS
    public int calcularAntiguedad(int anioActual) {
        return anioActual - anioFundacion;
    }

    public void agregarCiudad( Ciudad ciudad){
        this.ciudades.add(ciudad);


    }
    public void eliminarCiudad( Ciudad ciudad){
        this.ciudades.add(ciudad);


    }
    public void mostrarCiudades(){
        System.out.println("Ciudades de la Provincia : " + this.nombre);
        for (int i = 0; i < this.ciudades.size(); i++) {
            System.out.println(this.ciudades.get(i));
        }
    }





}
