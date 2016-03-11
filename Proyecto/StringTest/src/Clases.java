
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leungure
 */
public class Clases {
    
    private String Nombre;
    private ArrayList<Integer> codigos;
    
    public Clases() {
        this.Nombre = "";
        this.codigos = new ArrayList<Integer> ();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Integer> getCodigos() {
        return codigos;
    }

    public void setCodigos(int codigo) {
        this.codigos.add(codigo);
    }

}
