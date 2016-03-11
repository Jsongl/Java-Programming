/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

import java.util.Scanner;
import semana4.Estudiante;
import semana4.LibroCalificaciones;

public class Principal {


    public static void main(String[] args) {
        LibroCalificaciones obj1 = new LibroCalificaciones();
        Scanner teclado = new Scanner (System.in);
        Estudiante registro = new Estudiante();
        
        registro.setNombre("Pablo");
        registro.setParcial1(50.5);
        registro.setParcial2(96.4);
        registro.setFinal(85.5);
        obj1.agregarEstudiantes(registro);
        
        registro = new Estudiante();
        
        registro.setNombre("Marco");
        registro.setParcial1(91.5);
        registro.setParcial2(96.4);
        registro.setFinal(91.2);
        obj1.agregarEstudiantes(registro);
        
        System.out.println (obj1.ObtenerPromedio());
        
        
        
        
        
        
        
    }
    
}
