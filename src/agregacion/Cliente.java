/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacion;
/**
 *
 * @author SENA
 */
public class Cliente {
    private int codigo;
    private String razonsocial;

    public Cliente(int codigo, String razonsocial) {
        this.codigo = codigo;
        this.razonsocial = razonsocial;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }
   
    
}
