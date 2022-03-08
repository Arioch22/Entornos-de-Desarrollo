/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package huevoSorpresa;

/**
 *
 * @author Profesor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HuevoSorpresaMonterrosoFloresManuel2122 h_sorpresa;
       
        
        h_sorpresa=new HuevoSorpresaMonterrosoFloresManuel2122(10,5,"peluche",10);
        opera_PrecioMonterrosoFloresManuel2122(h_sorpresa);
        
        opera_UnidadesMonterrosoFloresManuel2122(h_sorpresa);
        
    }

    public static void opera_UnidadesMonterrosoFloresManuel2122(HuevoSorpresaMonterrosoFloresManuel2122 h_sorpresa) {
        /*Vamos a intentar sacar 2 huevos sorpresa, como no hay dinero suficiente saltará
        una excepción y no se modificará el nº de unidades de la tienda*/
        try {
            System.out.println("Vamos a sacar huevos sorpresa");
            h_sorpresa.sacarHuevosSorpresas(2, 4, "llavero");
            System.out.println("Operación realizada, ahora tiene "+h_sorpresa.obtenerUnidades()+" unidades en la tienda");
        } catch (Exception e) {
            System.out.println("Error al sacar huevos sorpresa, el nº de unidades sigue siendo: "+h_sorpresa.obtenerUnidades());
            
        }
    }

    public static void opera_PrecioMonterrosoFloresManuel2122(HuevoSorpresaMonterrosoFloresManuel2122 h_sorpresa) {
        /*Vamos a aumentar el precio 3€, como no supera el precio máximo establecido la operación
        tendrá éxito y el nuevo precio será de 8€*/
        try {
            System.out.println("Vamos a aumentar el precio de venta de un huevo sorpresa");
            h_sorpresa.aumentarPrecio(3);
            System.out.println("El precio actual es "+h_sorpresa.obtenerPrecio()+" €");
        } catch (Exception e) {
            System.out.println("Error al aumentar el precio");
        }
    }
    
    
}
