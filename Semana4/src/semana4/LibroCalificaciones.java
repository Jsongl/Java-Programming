 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

import java.util.ArrayList;
import semana4.Estudiante;

public class LibroCalificaciones {
    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

    public LibroCalificaciones() {
    }

    
    public void agregarEstudiantes(Estudiante nuevo) {
        this.estudiantes.add(nuevo);  
    }


    public double ObtenerPromedio () {
        double sumatoria = 0.0;
           
        if (this.estudiantes.isEmpty()) 
            return 0;
        
        for (Estudiante nota: this.estudiantes)
        {
            sumatoria += nota.getParcial1();
        }

        return (sumatoria  / this.estudiantes.size());
                
    }
            
    public void ImprimirTodos () {
        double promedio;
        
        for (Estudiante actual: this.estudiantes)
        {
            promedio = (actual.getParcial1() + actual.getParcial2() + actual.getFinal()) / 3;
            System.out.printf ("El estudiantes %s obtuvo %0.2f de promedio.\n",
                    actual.getNombre(), promedio);
        }
    }
    
    
    
}
