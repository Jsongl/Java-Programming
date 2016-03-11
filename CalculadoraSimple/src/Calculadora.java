public class Calculadora {
    private String cadena;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;

    Calculadora() {
        cadena = "";
        suma = false;
        resta = false;
        division = false;
        multiplicacion = false;
        resultado = 0;
    }

    public String limpiar () {
        this.cadena = "";
        this.suma = false;
        this.resta = false;
        this.division = false;
        this.multiplicacion = false;
        this.resultado = 0;   
        return this.cadena;
    }
    
    public String concatenamiento(String cadena) {
        if (this.cadena.isEmpty()) {
            this.cadena = cadena;
        }
        else {
            this.cadena += cadena;
        }
        return this.cadena;
    }

    public double Suma(String cadena) {
        operacion(cadena);
        suma = true;
        return resultado;
    }

    public double Resta(String cadena) {
        operacion(cadena);
        resta = true;
        return resultado;
    }

    public double Multiplicacion(String cadena) {
        operacion(cadena);
        multiplicacion = true;
        return resultado;
    }

    public double Division(String cadena) {
        operacion(cadena);
        division = true;
        return resultado;
    }

    public double resultado(String numero) {
  
        operacion(numero);
        return this.resultado;
    }

    public void operacion (String cadena) {
        if (Double.parseDouble(cadena) != 0) {
            if (suma == true) {
                resultado += Double.parseDouble(cadena);
            } else if (resta == true) {
                resultado -= Double.parseDouble(cadena);
            } else if (multiplicacion == true) {
                resultado *= Double.parseDouble(cadena);
            } else if (division == true) {
                resultado /= Double.parseDouble(cadena);
            } else {
                resultado = Double.parseDouble(cadena);
            }
        }  
        this.cadena = "";
        
        suma = false;
        resta = false;
        division = false;
        multiplicacion = false;
    }
    
}
