/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuenta;

/**
 *
 * @author SALA I
 */
public abstract class Menus {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;
    

    public Menus(String nombreP, double valorM, double valorInicialM) {
        this.nombrePlato = nombreP;
        this.valorMenu = valorM;
        this.valorInicialMenu = valorInicialM;
        
    }
    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }
    public void establecerValorMenu(double n) {
        valorMenu = n;
    }
    public void establecerValorInicial(double n) {
        valorInicialMenu = n;
    }
    
    //-----------------------------------------
    public String obtenerNombrePlato() {
        return nombrePlato;
    }
    public double obtenerValorMenu() {
        return valorMenu;
    }
    public double obtenerValorInicial() {
        return valorInicialMenu;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Plato: %s\n"
                + "Valor Menu: %.2f\n"
                + "Valor Inicial Menu: %.2f\n", 
                obtenerNombrePlato(),
                obtenerValorMenu(),
                obtenerValorInicial());
        return cadena;
    }
    
}
