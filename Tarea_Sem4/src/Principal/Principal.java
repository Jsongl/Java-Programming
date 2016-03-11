/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Clases.Estudiante;
import Clases.Profesor;
import Clases.Administrativo;
import Operaciones.Ops_administrador;
import Operaciones.Ops_estudiante;
import Operaciones.Ops_profesor;
import java.util.Scanner;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
            int Opcion = 0;
            Ops_administrador OperadorAdministrativo = new Ops_administrador();
            Ops_estudiante Operadorestudiante = new Ops_estudiante();
            Ops_profesor OperadorProfesor = new Ops_profesor();
            Scanner entrada = new Scanner (System.in);
            
            while (Opcion != 7)
            {
                System.out.printf("Menu de Informacion\n");
                System.out.printf("1. Ingresar Estudiantes\n");
                System.out.printf("2. Ingresar Profesores\n");
                System.out.printf("3. Ingresar Personal Aministrativo\n");
                System.out.printf("************************************\n");
                System.out.printf("4. Imprimir lista Estudiantes\n");
                System.out.printf("5. Imprimir lista Profesores\n");
                System.out.printf("6. Imprimir lista Personal Aministrativo\n");
                System.out.printf("7. Salir\n\nOpcion: ");                
                Opcion = entrada.nextInt();
                
                if (Opcion == 1)
                {
                    Operadorestudiante.insertar_estudiante(AgregarInformacionEstudiante());
                }
                
                if (Opcion == 2)
                {
                    OperadorProfesor.insertar_profesor(AgregarInformacionProfesor());
                }
                
                if (Opcion == 3)
                {
                    OperadorAdministrativo.insertar_administrador(AgregarInformacionAdministrativo()); 
                }
                
                if (Opcion == 4)
                {
                    Operadorestudiante.imprimir_array();
                }
                
                if (Opcion == 5)
                {
                    Operadorestudiante.imprimir_array();
                }
                
                if (Opcion == 6)
                {
                    Operadorestudiante.imprimir_array();
                }                
            }
        
    
    }
        
    private static Estudiante AgregarInformacionEstudiante ()
    {
        Estudiante objEstudiante;
        Scanner entrada = new Scanner (System.in);
        
        String Nombre;
        int Edad;
        String Carrera;
        int Identificacion;
        
        System.out.printf ("Ingrese el nombre del estudiante: ");
        Nombre = entrada.nextLine();
        
        System.out.printf ("Ingrese la edad: ");
        Edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.printf ("Ingrese la carrera: ");
        Carrera = entrada.nextLine();
        
        System.out.printf ("Ingrese la identificacion: ");
        Identificacion = entrada.nextInt();
        entrada.nextLine();
        
        objEstudiante = new Estudiante(Nombre, Edad, Carrera, Identificacion);
        
        return objEstudiante;
    }
    
    
    private static Profesor AgregarInformacionProfesor ()
    {
        Profesor objProfesor;
        Scanner entrada = new Scanner (System.in);
        
        String Nombre;
        int Edad;
        String Profesion;
        int Identificacion;
        String Catedra;
        
        System.out.printf ("Ingrese el nombre del profesor: ");
        Nombre = entrada.nextLine();
        
        System.out.printf ("Ingrese la edad: ");
        Edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.printf ("Ingrese la profesion: ");
        Profesion = entrada.nextLine();
        
        System.out.printf ("Ingrese la identificacion: ");
        Identificacion = entrada.nextInt();
        entrada.nextLine();
        
        System.out.printf ("Ingrese la catedra: ");
        Catedra = entrada.nextLine();
        
        objProfesor = new Profesor(Nombre, Edad, Profesion, Identificacion, Catedra);
        
        return objProfesor;
    }

    
    private static Administrativo AgregarInformacionAdministrativo ()
    {
        Administrativo objAdministrativo;
        Scanner entrada = new Scanner (System.in);
        
        String Nombre;
        int Edad;
        String Profesion;
        int Identificacion;
        String Catedra;
        String Extension;
        
        System.out.printf ("Ingrese el nombre del Administrativo: ");
        Nombre = entrada.nextLine();
        
        System.out.printf ("Ingrese la edad: ");
        Edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.printf ("Ingrese la profesion: ");
        Profesion = entrada.nextLine();
        
        System.out.printf ("Ingrese la identificacion: ");
        Identificacion = entrada.nextInt();
        entrada.nextLine();        
        
        System.out.printf ("Ingrese la catedra: ");
        Catedra = entrada.nextLine();
        
        System.out.printf ("Ingrese la Extension: ");
        Extension = entrada.nextLine();
        
        objAdministrativo = new Administrativo(Nombre, Edad, Profesion, Identificacion, Catedra, Extension);
        
        return objAdministrativo;
    }
    
}
