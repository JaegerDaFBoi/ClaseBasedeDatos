/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainAgregacion;
import agregacion.*;
 
/**
 *
 * @author SENA
 */
public class main {
    
    public static void main(String[] args){
    Fecha hoy= new Fecha(03,02,2022);
    Producto p1= new Producto(1,"leche",2300);
    Producto p2= new Producto(2,"aceite",24000);
    Cliente cliente1= new Cliente(1,"Luis");
    Factura f1=new Factura(1,1,hoy,cliente1);
    f1.agregarProducto(p1);
    f1.agregarProducto(p2);
    f1.mostrar();
    
    }
    
}
