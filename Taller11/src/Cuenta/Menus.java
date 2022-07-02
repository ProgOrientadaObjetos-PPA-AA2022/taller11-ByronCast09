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
    protected double valorPorcionGuarni;
    protected double valorBebida;
    protected double porcentajeAdiServ;

    public Menus(String nombreP, double valorM, double valorInicialM, double valorPorcionG, double valorB, double porcentajeAdiS) {
        this.nombrePlato = nombreP;
        this.valorMenu = valorM;
        this.valorInicialMenu = valorInicialM;
        this.valorPorcionGuarni = valorPorcionG;
        this.valorBebida = valorB;
        this.porcentajeAdiServ = porcentajeAdiS;
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
    public void establecerValorPorcionGuarni(double n) {
        valorPorcionGuarni = n;
    }
    public void establecerValorBebida(double n) {
        valorBebida = n;
    }
    public void establecerValorPorcentajeAdiServ(double n) {
        porcentajeAdiServ = n;
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
    public double obtenerValorPorcionGuarni() {
        return valorPorcionGuarni;
    }
    public double obtenerValorBebida() {
        return valorBebida;
    }
    public double obtenerValorPorcentajeAdiServ() {
        return porcentajeAdiServ;
    }
    @Override
    public String toString(){
        String cadena = String.format("Plato: %s\n"
                + "Valor Inicial: %.2f\n"
                + "Valor helado: %.2f\n"
                + "Valor pastel: %.2f\n"
                + "Valor del Menu: %.2f\n", 
                obtenerNombreArrendatario(),
                obtenerApellidoArrendatario(),
                obtenerEdadArrendatario());
        return cadena;
    }
    
}
