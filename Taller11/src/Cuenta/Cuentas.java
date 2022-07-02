/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuenta;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public abstract class Cuentas {
    protected String nombreCliente;
    protected ArrayList<Menus> listadoCartas = new ArrayList<>();
    protected double valorCancelar;
    protected double subtotal;
    protected double iva;
    
    public Cuentas(String n, ArrayList<Menus> lista) {
        nombreCliente = n;
        listadoCartas = lista;
    }
    
    public void establecerNombreCliente(String n) {
        nombreCliente = n;
    }
    public void establecerListadoCartas(ArrayList<Menus> l) {
        listadoCartas = l;
    }
    public void establecerValorCancelar(double v) {
        valorCancelar = v;
    }
    public void establecerSubtotal(double s) {
        subtotal = s;
    }
    public void establecerIva(double i) {
        iva = i;
    }
    //---------------------------
    public String obtenerNombreCliente() {
        return nombreCliente;
    }
    public ArrayList<Menus> obtenerListadoCartas() {
        return listadoCartas;
    }
    public double obtenerValorCancelar() {
        return listadoCartas;
    }
}
