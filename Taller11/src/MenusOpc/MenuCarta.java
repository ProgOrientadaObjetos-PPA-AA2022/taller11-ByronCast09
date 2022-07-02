/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenusOpc;

import Cuenta.Menus;

/**
 *
 * @author SALA I
 */
public class MenuCarta extends Menus{
    protected double valorPorcion;
    protected double valorBebida;
    protected double porcetajeAdicional;
    
    public MenuCarta(String nombreP, double valorM, double valorInicialM,double valPor,
            double valBeb, double porAd) {
        super(nombreP,valorM,valorInicialM);
        valorPorcion= valPor;
        valorBebida = valBeb;
        porcetajeAdicional = porAd;
    }
    public void establecerValorPorcion(double x){
        valorPorcion = x;
    }
    public void establecerValorBebida(double e){
        valorBebida = e;
    }
    public void establecerPorcentajeAdicional(double e){
        porcetajeAdicional = e;
    }
    public double obtenerValorPorcion(){
        return valorPorcion;
    }
    public double obtenerValorBebida(){
        return valorBebida;
    }
    public double obtenerPorcentajeAdicional(){
        return porcetajeAdicional;
    }
    @Override
    public String toString() {
        String cadena = String.format("Menu a la Carta\n\n"
                + "Plato: %s\n"
                + "Valor Inicial: %.2f\n"
                + "Valor guarnicion: %.2f\n"
                + "Valor bebida: %.2f\n"
                + "Porcentaje Adicional: %.2f\n"
                + "Valor del Menu %.2f\n", 
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerValorHelado(),
                obtenerValorPastel(),
                obtenertValorMenu());
        return cadena;
    }
}   
