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
public class MenuNiño extends Menus{
    private double valorPorcionHelado;
    private double valorPorcionPastel;
    
    public MenuNiño(String nombreP, double valorM,double valPorHe,
            double valPst) {
        super(nombreP,valorM);
        valorPorcionHelado= valPorHe;
        valorPorcionPastel = valPst;
    }
    public void establecerValorPorcionHelado(double e){
        valorPorcionHelado = e;
    }
    public void establecerValorPorcionPastel(double e){
        valorPorcionPastel = e;
    }
    @Override
    public void calcularValorTotal() {
        valorMenu = valorInicialMenu + valorPorcionHelado+ valorPorcionPastel;
    }
    public double obtenerValorcancelartotal() {
        return valorMenu;
    }
    public double obtenerValorPorcionHelado(){
        return valorPorcionHelado;
    }
    public double obtenerValorPorcionPastel(){
        return valorPorcionPastel;
    }
    @Override
    public String toString() {
        String cadena = String.format("Menu de Niños\n\n"
                + "Plato: %s\n"
                + "Valor Inicial: %.2f\n"
                + "Valor porcion helado: %.2f\n"
                + "Valor porcion pastel: %.2f\n"
                + "Valor del Menu %.2f\n", 
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerValorPorcionHelado(),
                obtenerValorPorcionPastel(),
                obtenerValorMenu());
        return cadena;
    }
}
