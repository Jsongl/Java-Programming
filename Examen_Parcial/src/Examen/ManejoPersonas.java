/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import Examen.Fecha;
import Examen.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ManejoPersonas {
    
    private ArrayList <Persona> Empleados = new ArrayList();
    private Fecha FechaActual = new Fecha();
    int entradaNum;

    
    public void SolicitarFechaActual ()
    {
        Scanner entrada = new Scanner (System.in);
        int validacion = 0;
        
        System.out.printf ("Entrada de la fecha Actual\n");
        
        System.out.printf ("Digite el ano: ");
        entradaNum = entrada.nextInt();
        this.FechaActual.setAno(entradaNum);

        do {
            System.out.printf ("Digite el mes:");
            validacion = this.FechaActual.setMes(entrada.nextInt());
        } while (validacion == 1);
        
        do {
            System.out.printf ("Digite el dia:");
            validacion = this.FechaActual.setDia(entrada.nextInt());  
        } while (validacion == 1);           
    }
    
    public void SolicitarEmpleado ()
    {
        Persona NuevoRegistro = new Persona();
        Scanner entrada = new Scanner (System.in);
        Fecha FechaEntrada = new Fecha();
        int validacion;
        
        System.out.printf ("\n\nCarga de empleados:\n");
        
        System.out.printf ("Digite el nombre:");
        NuevoRegistro.setNombre(entrada.nextLine());

        
        System.out.printf ("Digite el apellido:");
        NuevoRegistro.setApellidos(entrada.nextLine());

        
        System.out.printf ("Digite la fecha de cumpleanos\n");
        System.out.printf ("Digite el ano:");
        FechaEntrada.setAno(entrada.nextInt());

        do {
            System.out.printf ("Digite el mes:");
            validacion = FechaEntrada.setMes(entrada.nextInt());
        } while (validacion == 1);
        
        do {
            System.out.printf ("Digite el dia:");
            validacion = FechaEntrada.setDia(entrada.nextInt());  
        } while (validacion == 1);     
        
        NuevoRegistro.setFechaCumpleanos(FechaEntrada);
        
        System.out.printf ("Digite la cedula:");
        NuevoRegistro.setCedula(entrada.nextInt());
        
        System.out.printf ("Digite la direccion:");
        NuevoRegistro.setDireccion(entrada.nextLine());
        entrada.nextLine();
        
        System.out.printf ("Digite la Profesion:");
        NuevoRegistro.setProfesion(entrada.nextLine());
        
        System.out.printf ("Digite el salario mensual:");
        NuevoRegistro.setSalarioMensual(entrada.nextInt());

        this.Empleados.add(NuevoRegistro);
    }
    
    public void ImprimirRegistros ()
    {
        Fecha FechaCumpleanos = new Fecha ();
        int edad;
        int salario;

        System.out.printf ("********************\n");
        System.out.printf (" Lista de empleados\n");
        System.out.printf ("********************\n\n");
            
        for (Persona Recorrido: this.Empleados)
        {
            
            salario = Recorrido.getSalarioMensual() * 12;
            FechaCumpleanos = Recorrido.getFechaCumpleanos();
            //edad = this.FechaActual.getAno() - FechaCumpleanos.getAno();
            edad = this.FechaActual.pFechaPosterior(FechaCumpleanos);
            
            System.out.printf ("Nombre: %s %s\n", Recorrido.getNombre(), Recorrido.getApellidos());
            System.out.printf ("Salario anual: %d\n", salario);
            System.out.printf ("Edad: %d \n\n", edad);
        }
    }
    
    
}
