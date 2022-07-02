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
public class Cuentas extends Menus {
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
                + "Menu del Dia\n\n", obtenerNombre());

        for (int i = 0; i < obtenerArriendos().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerArriendos().get(i));
        }

        cadena = String.format("\n%sTotal Arriendos base Mensual: %.2f\n"
                + "Total Arriendos Mensual: %.2f\n",
                cadena,
                obtenerTotalArriendosBaseMensual(),
                obtenerTotalArriendosFinalMensual());
        return cadena;
    }
}
