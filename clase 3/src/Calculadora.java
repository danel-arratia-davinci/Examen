public class Calculadora {

    double areaCirculo(double radio) {
        return Math.PI * radio * radio;

    }

    double areaRectangulo(double altura, double base) {
        return altura * base;
    }


    double promedio(double... numeros) {
        double sumatoria = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumatoria += numeros[i];
        }
        return sumatoria / numeros.length;

    }
}