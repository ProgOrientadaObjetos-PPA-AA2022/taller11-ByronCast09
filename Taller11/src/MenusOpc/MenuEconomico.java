/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenusOpc;

import Cuenta.Menus;

/**
 *
 * @author USUARIO 2020
 */
public class MenuEconomico extends Menus{
    private double porcentajeDescuento;
    
    public MenuEconomico(String nombreP, double valorM,double porcD) {
        super(nombreP,valorM);
        porcentajeDescuento = porcD;
    }
    public void establecerPorcentajeDescuento(double e){
        porcentajeDescuento = e;
    }
    @Override
    public void calcularValorTotal() {
        valorMenu = valorInicialMenu -((porcentajeDescuento * valorInicialMenu)/100);
    }
    public double obtenerValorcancelartotal() {
        return valorMenu;
    }
    public double obtenerPorcentajeDescuento(){
        return porcentajeDescuento;
    }
    @Override
    public String toString() {
        String cadena = String.format("Menu Económico\n\n"
                + "Plato: %s\n"
                + "Valor Inicial: %.2f\n"
                + "Porcentaje de Descuento: %.2f\n"
                + "Valor del Menu %.2f\n", 
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerPorcentajeDescuento(),
                obtenerValorMenu());
        return cadena;
    }
}
