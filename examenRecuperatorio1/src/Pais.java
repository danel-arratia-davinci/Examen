import java.util.ArrayList;

public class Pais {


    /// ATRIBUTOS
    String nombre;
    String capital;
    String idioma;
    int anioFundacion;
    ArrayList<Provincia> provincias = new ArrayList<Provincia>();



    ///CONSTRUCTORES


    public Pais(String nombre, String capital, String idioma, int anioFundacion) {
        this.nombre = nombre;
        this.capital = capital;
        this.idioma = idioma;
        this.anioFundacion = anioFundacion;
    }


    ///METODOS
    public int calcularAntiguedad (int anioActual){
        return anioActual - anioFundacion;
    }

    public void agregarProvincia( Provincia provincia){
        this.provincias.add(provincia);


    }

    public void eliminarProvincia( Provincia provincia){
        this.provincias.remove(provincia);


    }

    public void mostrarProvincias(){
        System.out.println("Provincias del País : " + this.nombre);
        for (int i = 0; i < this.provincias.size(); i++) {
            System.out.println(this.provincias.get(i));
        }
    }

    @Override
    public String toString() {
        return "Pais" + " " + this.capital + " (" +this.anioFundacion + ")";
    }
}
