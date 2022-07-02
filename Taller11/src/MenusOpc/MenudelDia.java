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
public class MenudelDia extends Menus{
    private double valorPostre;
    private double valorBebida;
    
    public MenudelDia(String nombreP, double valorInicialM,double valPostre,
            double valBebida) {
        super(nombreP,valorInicialM);
        valorPostre= valPostre;
        valorBebida = valBebida;
    }
    public void establecerValorPostre(double e){
        valorPostre = e;
    }
    public void establecerValorBebida(double e){
        valorBebida = e;
    }
    @Override
    public void calcularValorTotal() {
        valorMenu = valorInicialMenu + valorPostre+ valorBebida;
    }
     public double obtenerValorcancelartotal() {
        return valorMenu;
    }
    
    public double obtenerValorPostre(){
        return valorPostre;
    }
    public double obtenerValorBebida(){
        return valorBebida;
    }
    @Override
    public String toString() {
        String cadena = String.format("\nMenu del Dia\n"
                + "Plato: %s\n"
                + "Valor Inicial: %.2f\n"
                + "Valor Bebida: %.2f\n"
                + "Valor Postre: %.2f\n"
                + "Valor del Menu %.2f\n", 
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerValorBebida(),
                obtenerValorPostre(),
                obtenerValorMenu());
        return cadena;
    }
}
