public class CuentaBancaria {
    String titular;
    String tipoDeCuenta;
    double saldo;
    ///CONSTRUCTOR

    CuentaBancaria(String titular, String tipoDeCuenta, double saldo){
        this.titular = titular;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
    }

    ///Metodos

    void ingresarDinero(double cantidad){
        saldo += cantidad;
    }

    void  retirarDinero(double cantidad ){
        saldo -= cantidad;

    }
    void cambiarTipoDeCuenta (String nuevoTipo){
        tipoDeCuenta= nuevoTipo;

    }

    double consultarSaldo(){
        return saldo;
    }



}
