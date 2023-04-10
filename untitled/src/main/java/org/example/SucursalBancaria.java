package org.example;

public class SucursalBancaria {
    private int codigoSucursal;
    private int codigoPostal;
    //public CuentaBancaria cuentasBancarias = new CuentasBancarias[0];

    public int getCodigoSucursal() {
        return this.codigoSucursal;
    }

    public void setCodigoSucursal(int aCodigoSucursal) {
        this.codigoSucursal = aCodigoSucursal;
    }

    public int getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(int aCodigoPostal) {
        this.codigoPostal = aCodigoPostal;
    }
}