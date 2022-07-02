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
public class Cuentas{
    protected String nombreCliente;
    protected ArrayList<Menus> listadoCartas = new ArrayList<>();
    protected double valorCancelar;
    protected double subtotal;
    protected double iva;
    
    public Cuentas(String n, ArrayList<Menus> lista,double iv) {
        nombreCliente = n;
        listadoCartas = lista;
        iva =iv;
    }

    
    public void establecerNombreCliente(String n) {
        nombreCliente = n;
    }
    public void establecerListadoCartas(ArrayList<Menus> l) {
        listadoCartas = l;
    }
    public void calcularValorCancelar() {
        valorCancelar = subtotal+((iva * subtotal)/100);
    }
    public void establecerSubtotal() {
        for (int i = 0; i < listadoCartas.size(); i++) {
            subtotal += listadoCartas.get(i).valorMenu;
        }
        
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
        return valorCancelar;
    }
    public double obtenerSubtotal() {
        return subtotal;
    }
    public double obtenerIva() {
        return iva;
    }
    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n",obtenerNombreCliente()
                + "Menu del Dia\n\n");

        for (int i = 0; i < obtenerListadoCartas().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerListadoCartas().get(i));
        }

        cadena = String.format("\n%s"+"Subtotal:%.2f\n"+"Iva: %.2f\n"+"Total a pagar:%.2f\n",
                cadena,
                obtenerSubtotal(),
                obtenerIva(),
                obtenerValorCancelar());
        return cadena;
    }
}
