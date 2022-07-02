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
    

    public Menus(String nombreP, double valorM) {
        this.nombrePlato = nombreP;
        this.valorInicialMenu = valorM;
        
    }
    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }
    public void establecerValorMenu(double e) {
        valorMenu = e;
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
    public abstract void calcularValorTotal();
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
