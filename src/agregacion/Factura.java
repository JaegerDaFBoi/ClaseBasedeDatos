package agregacion;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SENA
 */
public class Factura extends Comprobante{
    private ArrayList<Producto> mproductos;
    private float total;
    private Cliente mCliente;

    public Factura(int t,int n, Fecha f,  Cliente mCliente) {
        super(t,n,f);
        this.mCliente = mCliente;
    }
    

    public ArrayList<Producto> getMproductos() {
        return mproductos;
    }

    public void setMproductos(ArrayList<Producto> mproductos) {
        this.mproductos = mproductos;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getmCliente() {
        return mCliente;
    }

    public void setmCliente(Cliente mCliente) {
        this.mCliente = mCliente;
    }
    
    public void agregarProducto(Producto p){
    mproductos.add(p);
    setTotal(getTotal()+p.getPrecio());
    
    }
  public void mostrarProducto(){
  Iterator<Producto> iter=mproductos.iterator();
  while(iter.hasNext()){
  Producto p = iter.next();
  System.out.printf("codigo: %d Descripción: %s Precio %5.2f \n",p.getCodigo(),p.getDescripcion(),p.getPrecio());
  }
  
  }  
  
  public void mostrar(){
      System.out.printf("Tipo: %d Numero: %d Fecha %d/%d%/%d \n",getTipo(),getNumero(),getFecha().getDia(),getFecha().getMes(),getFecha().getAnio());
      System.out.printf("Cliente:\n");
      System.out.printf("codigo: %d Razon Social: %s \n",mCliente.getCodigo(),mCliente.getRazonsocial());
      System.out.printf("Producto \n");
      mostrarProducto();
      System.out.printf("Total: 6.2f \n",getTotal());
  }
}
