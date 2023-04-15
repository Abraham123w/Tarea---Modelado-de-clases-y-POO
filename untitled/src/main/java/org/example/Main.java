package org.example;

public class Main {

    public static void main(String[] args) {
    SucursalBancaria sucursalBancaria1= new SucursalBancaria(123,495000);
    Cliente cliente1= new Cliente("diego ortiz","18.000.000");
    CuentaCorriente cuentaCorriente1= new CuentaCorriente(123,"12-12-2000",520000 ,308956, 0.2,cliente1);
    CuentaBancaria cuentaBancaria1= new CuentaBancaria(124,"12-10-2000",25000,8956,0.2,cliente1);

    GestionBanco gestionBanco= new GestionBanco();
    System.out.println();
    System.out.println(sucursalBancaria1);
}}