public class Main {
    public static void main(String[] args) {


        Ciudad primerCiudad = new Ciudad("C.A.B.A", 200_000);
        Ciudad segundaCiudad = new Ciudad("C.A.B.A", 200_000);
        Ciudad terceraCiudad = new Ciudad("C.A.B.A", 200_000);
        Ciudad cuartaCiudad = new Ciudad("C.A.B.A", 200_000);


        Provincia primerProvincia = new Provincia("Santa Fe","Santa Fe de la Vera Cruz.",1932);
        Provincia segundaProvincia = new Provincia("Santa Fe","Santa Fe de la Vera Cruz.",1932);



        Pais primerPais = new Pais("Argentina", "Buenos Aires", "Español", 1981);


        /// METODO AGREGAR
        primerProvincia.agregarCiudad(primerCiudad);
        segundaProvincia.agregarCiudad(segundaCiudad);

        primerPais.agregarProvincia(primerProvincia);


    }
}
