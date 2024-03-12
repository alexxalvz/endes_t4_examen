package org.example;


import java.util.ArrayList;
import java.util.List;

/**
 * La clase Cliente almacena nombre,apellido,id y cuentas. Con esta clase se podra saber el nombre de el cliente, su apellido, el id que tiene y las cuentas que maneja.
 * @Alejandro
 * @version  12/03/2024
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String id;
    private List<CuentaBancaria> cuentas;

    /**
     *constructor contenido por: nombre,apellido e id
     * @param nombre
     * @param apellido
     * @param id
     */
    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }

    /**
     * este metodo getter sirve para optener el nombre del usuario
     * @return (devuelve el nombre)
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *metodo setter para obtener nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * este metodo getter sirve para optener el apellido del usuario
     * @return (devulve el apellido)
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * metodo setter para conocer el apellido del usuario
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * este metodo getter sirve para optener el id del usuario
     * @return (devuelve un id)
     */
    public String getId() {
        return id;
    }

    /**
     *metodo setter para saber el id del usuario
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * este metodo getter sirve para optener las cuentas del usuario
     * @return (devuelve una lista de arrays de cuentas)
     */
    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    }

    /**
     *metodo setter para agregar cuentas
     * @param cuenta
     */
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    /**
     * este metodo getter sirve para optener el numero de cuenta del usuario y si quiere poder borrarlo
     * @param numeroCuenta
     * @return (devuelve el numero de cuenta)
     */
    public boolean cerrarCuenta(String numeroCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }

    /**
     * este metodo Override sirve para optener todos los datos completos del usuario y poder hacer operaciones en la cuenta.
     * @return (este metodo Override devuelve el nombre del cliente y el apellido y aparte su id y las cuentas que tiene)
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
