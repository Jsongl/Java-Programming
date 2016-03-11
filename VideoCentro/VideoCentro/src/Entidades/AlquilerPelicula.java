
package Entidades;


public class AlquilerPelicula 
{

    int CodigoAlquiler;
    int CodigoPelicula;
    String FechaAlquiler;
    Boolean Alquilada;
    String Estado; // (D = Dañada - E = Extraviada - D = Detenida)

    public AlquilerPelicula(int CodigoAlquiler, int CodigoPelicula, String FechaAlquiler, Boolean Alquilada, String Estado) {
        this.CodigoAlquiler = CodigoAlquiler;
        this.CodigoPelicula = CodigoPelicula;
        this.FechaAlquiler = FechaAlquiler;
        this.Alquilada = Alquilada;
        this.Estado = Estado;
    }

    
    
    public int getCodigoAlquiler() {
        return CodigoAlquiler;
    }

    public void setCodigoAlquiler(int CodigoAlquiler) {
        this.CodigoAlquiler = CodigoAlquiler;
    }

    public int getCodigoPelicula() {
        return CodigoPelicula;
    }

    public void setCodigoPelicula(int CodigoPelicula) {
        this.CodigoPelicula = CodigoPelicula;
    }

    public String getFechaAlquiler() {
        return FechaAlquiler;
    }

    public void setFechaAlquiler(String FechaAlquiler) {
        this.FechaAlquiler = FechaAlquiler;
    }

    public Boolean getAlquilada() {
        return Alquilada;
    }

    public void setAlquilada(Boolean Alquilada) {
        this.Alquilada = Alquilada;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    
}
