/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import Cuenta.Cuentas;
import Cuenta.Menus;
import MenusOpc.MenuCarta;
import MenusOpc.MenuEconomico;
import MenusOpc.MenuNiño;
import MenusOpc.MenudelDia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {
    public static void main(String[] args) {
        
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
            {"Niños 02", "3.00", "1", "1.5"},
            {"Niños 03", "2.00", "2", "0.5"},
         };
        
        String[][] datos002 = {{"Econo 001", "4", "25"}, 
            {"Econo 002", "4", "15"},
            {"Econo 003", "4", "35"}
        };
        
        String[][] datos003 = { {"Dia 001", "5", "1", "1"}, 
            {"Dia 002", "6", "2", "2"},
            {"Dia 003", "5.5", "3", "1"},
        };
        
        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"}, 
            {"Carta 002", "7", "1.7", "2.1", "5"}, 
            {"Carta 003", "8", "1.9", "2.2", "5"}, 
            {"Carta 004", "9", "2.5", "2.9", "5"}, 
        };
                
        
        // Lista de Menus
        ArrayList<Menus> lista = new ArrayList<>();
        
        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        for (int i = 0; i < datos001.length; i++) {
            String nombrePlato = datos001[i][0];
            double valorMenu = Double.parseDouble(datos001[i][1]);
            double valorHelado = Double.parseDouble(datos001[i][2]);
            double valorpastel = Double.parseDouble(datos001[i][3]);
            MenuNiño menud = new MenuNiño(nombrePlato, valorMenu,
                    valorHelado, valorpastel);
            lista.add(menud);
        }
        for (int i = 0; i < datos001.length; i++) {
            String nombrePlato = datos002[i][0];
            double valorMenu = Double.parseDouble(datos002[i][1]);
            double descuento = Double.parseDouble(datos002[i][2]);

            MenuEconomico menuEcono = new MenuEconomico(nombrePlato,
                    valorMenu, descuento);
            lista.add(menuEcono);
        }
        for (int i = 0; i < datos003.length; i++) {
            String nombrePlato = datos003[i][0];
            double valorMenu = Double.parseDouble(datos003[i][1]);
            double postre = Double.parseDouble(datos003[i][2]);
            double bebida = Double.parseDouble(datos003[i][3]);

            MenudelDia menud = new MenudelDia(nombrePlato,
                    valorMenu, postre, bebida);
            lista.add(menud);
        }
        for (int i = 0; i < datos004.length; i++) {
            String nombrePlato = datos004[i][0];
            double valorMenu = Double.parseDouble(datos004[i][1]);
            double valorPorcionGuarnicio = Double.parseDouble(datos004[i][2]);
            double valorBebida = Double.parseDouble(datos004[i][3]);
            double porcentaje = Double.parseDouble(datos004[i][4]);
            MenuCarta menucar = new MenuCarta(nombrePlato,
                    valorMenu, valorPorcionGuarnicio, valorBebida, porcentaje);
            lista.add(menucar);
        }
        // Fin de solución
        
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).calcularValorTotal();
        }
        
        // Un objeto de tipo Cuenta
        Cuentas miCuenta = new Cuentas("Luis Andrade",lista, 10.00);
        miCuenta.establecerSubtotal();
        miCuenta.calcularValorCancelar();
        System.out.printf("%s\n", miCuenta);
        


    }
}
