package cuentas;

/**
 * Clase CCuenta
 */
public class CCuenta {

    /**
     * Contiene 4 atributos, siendo estos nombre y cuenta de tipo string; saldo y tipoInteres de tipo double.
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * La clase cuenta con 2 constructores, uno siendo simple, el segundo conteniendo 4 parámetros: nom, cue, sal, tipo.
     */
    public CCuenta()
    {
    }

    /**
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * El método estado simplemente devuelve el valor del saldo actual.
     * @return saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * El método ingresar es de tipo void, por lo que no devolverá ningún valor. Este además lanza un excepcion si no se usa adecuadamente.
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método de tipo void similar al método ingresar.
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
