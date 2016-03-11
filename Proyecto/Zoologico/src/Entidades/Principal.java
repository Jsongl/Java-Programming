package Entidades;

public abstract class Principal {
   
    int Codigo;
    
    public abstract String  ConcatenarString ();

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
   
}
