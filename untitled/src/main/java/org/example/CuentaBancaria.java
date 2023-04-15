package org.example;

public class CuentaBancaria {
    private int nuemeroDeCuenta;
    private String fechaDeApertura;
    private double saldo;
    private int lineaDegiro;
    private double reajusteAnual;
    public Cliente cliente;

    public CuentaBancaria(int nuemeroDeCuenta, String fechaDeApertura, double saldo, int lineaDegiro, double reajusteAnual, Cliente cliente) {
        this.nuemeroDeCuenta = nuemeroDeCuenta;
        this.fechaDeApertura = fechaDeApertura;
        this.saldo = saldo;
        this.lineaDegiro = lineaDegiro;
        this.reajusteAnual = reajusteAnual;
        this.cliente = cliente;
    }

    public int getNuemeroDeCuenta() {
        return this.nuemeroDeCuenta;
    }

    public void setNuemeroDeCuenta(int aNuemeroDeCuenta) {
        this.nuemeroDeCuenta = aNuemeroDeCuenta;
    }

    public String getFechaDeApertura() {
        return this.fechaDeApertura;
    }

    public void setFechaDeApertura(String aFechaDeApertura) {
        this.fechaDeApertura = aFechaDeApertura;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double aSaldo) {
        this.saldo = aSaldo;
    }

    public int getLineaDegiro() {
        return this.lineaDegiro;
    }

    public void setLineaDegiro(int aLineaDegiro) {
        this.lineaDegiro = aLineaDegiro;
    }

    public double getReajusteAnual() {
        return this.reajusteAnual;
    }

    public void setReajusteAnual(double aReajusteAnual) {
        this.reajusteAnual = aReajusteAnual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "nuemeroDeCuenta=" + nuemeroDeCuenta +
                ", fechaDeApertura='" + fechaDeApertura + '\'' +
                ", saldo=" + saldo +
                ", lineaDegiro=" + lineaDegiro +
                ", reajusteAnual=" + reajusteAnual +
                ", cliente=" + cliente +
                '}';
    }
}
