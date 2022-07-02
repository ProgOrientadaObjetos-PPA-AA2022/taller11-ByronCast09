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
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Menus> listadoCartas = new ArrayList<>();
        
        MenuNiño menN1 = new MenuNiño("Niños 01",2.00,1.00,1.50);
        menN1.calcularValorTotal();
        
        MenuNiño menN2 = new MenuNiño("Niños 02",3.00,1.00,1.50);
        menN1.calcularValorTotal();
        listadoCartas.add(menN1);
        listadoCartas.add(menN2);
        //----------------------------------------
        MenuEconomico menE = new MenuEconomico("Econo 001",4.00,25.00);
        menE.calcularValorTotal();
        listadoCartas.add(menE);
        //-----------------------------------------
        MenudelDia menD = new MenudelDia("Dia 001",5.00,1.00,1.00);
        menD.calcularValorTotal();
        listadoCartas.add(menD);
        //-------------------------------------
        MenuCarta menCar = new MenuCarta("Carta001",6.00,1.50,2.00,10.00);
        menCar.calcularValorTotal();
        listadoCartas.add(menCar);
        //---------------------------------------------
        Cuentas cuent = new Cuentas("Byron Castillo",listadoCartas,10);
        cuent.establecerSubtotal();
        cuent.calcularValorCancelar();
        System.out.print(cuent);
        
        
        
        
        
        
        
    }
    
    
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/