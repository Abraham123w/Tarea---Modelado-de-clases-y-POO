package org.example;

public class CuentaAhorro extends CuentaBancaria {
    public CuentaAhorro(int nuemeroDeCuenta, String fechaDeApertura, double saldo, int lineaDegiro, double reajusteAnual, Cliente cliente) {
        super(nuemeroDeCuenta, fechaDeApertura, saldo, lineaDegiro, reajusteAnual, cliente);
    }
}