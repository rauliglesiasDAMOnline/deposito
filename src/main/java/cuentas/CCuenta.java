package cuentas;
/**
 * Inicio de la clase CCuenta que es una cuenta bancaria.
 * Esta clase gestiona una cuenta bancaria con las operaciones 
 * de consultar, ingresar y retirar dinero.
 */
public class CCuenta {

/** Nombre del titular de la cuenta */
    private String nombre;
    /** Número de cuenta */
    private String cuenta;
    /** Saldo actual en la cuenta */
    private double saldo;
    /** Tipo de interés de la cuenta */
    private double tipoInterés;
    /**
     * Constructor por defecto de CCuenta.
     */
    public CCuenta()
    {
    }
    /**
     * Constructor que usa parámetros String y double.
     * @param nom String con el nombre del titular
     * @param cue String con el número de cuenta
     * @param sal double indicando el saldo
     * @param tipo double de la tasa de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * @return Devuelve el saldo actual en la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Ingresa una cantidad en la cuenta.
     * @param cantidad indica la cantidad de dinero a ingresar.
     * @throws Exception Si la cantidad a ingresar es negativa salta Exception.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Función para retira dinero de la cuenta.
     * @param cantidad Cantidad a retirar.
     * @throws Exception Lanza error si la cantidad a retirar es negativa o si
     * no hay suficiente saldo en la cuenta.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * @return devuelve el nombre del titular de la cuenta
 */
    public String getNombre() {
        return nombre;
    }
/**
 * @param nombre String con el nombre del titular
 */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
 * @return devuelve el número de cuenta
 */
    public String getCuenta() {
        return cuenta;
    }
/**
 * @param cuenta se indica el número de cuenta
 */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
/**
 * @return devuelve el saldo actual en la cuenta
 */

    public double getSaldo() {
        return saldo;
    }
/**
 * @param saldo Saldo actual en la cuenta
 */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
/**
 * @return Devuelve el tipo de interés de la cuenta
 */
    public double getTipoInterés() {
        return tipoInterés;
    }
/**
 * Indica el tipo de interés que se le aplica a la cuenta bancaria.
 * @param tipoInterés 
 */

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
