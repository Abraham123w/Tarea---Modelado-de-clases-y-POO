package org.example;

public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(int nuemeroDeCuenta, String fechaDeApertura, double saldo, int lineaDegiro, double reajusteAnual, Cliente cliente) {
        super(nuemeroDeCuenta, fechaDeApertura, saldo, lineaDegiro, reajusteAnual, cliente);
    }
}