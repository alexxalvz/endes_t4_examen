package org.example;

/**
 *
 *La clase cuenta bancaria en la que tendremos en cuenta el numero de cuenta, el saldo y el propietario. Con todos estos datos podremos veridicar el autor de la cuenta y de cuanto dinero dispone.
 * @Alejandro
 * @version 12/03/2024
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private Cliente propietario;


    /**
     *Constructor con numerode cuenta, saldo y propietario
     * @param numeroCuenta
     * @param saldo
     * @param propietario
     */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    /**
     * este metodo getter sirve para optener el numero de cuenta del usuario
     * @return (devuelve un numero de cuenta)
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * metodo setter para reconocer el numero de cuenta del ususario
     * @param numeroCuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * este metodo getter sirve para optener el saldo del usuario
     * @return (devuelve el saldo)
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *metodo setter para informar sobre el saldo del usuario
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * este metodo getter sirve para optener el quien es el propietario de la cuenta
     * @return (devuelve el propietario)
     */
    public Cliente getPropietario() {
        return propietario;
    }

    /**
     *metodo setter para saber quien es el propietario de la cuenta
     * @param propietario
     */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    /**
     *metodo que no devuelve nada para saber la cantidad de la cuenta
     * @param cantidad
     */
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    /**
     *  este metodo if sirve para retirar saldo si la cantidad es menor o igual al saldo.
     * @param cantidad
     * @return (devuelve verdadero si se cumple la condicion y si no falso)
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    /**
     * este metodo Override sirve para obtener todos los dato necesarios del usuario.
     * @return (este metodo override devuelve la cuenta bancaria y el numero de cuenta y junto a ello el saldo y de quien es el saldo)
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }

}
