/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *Atributos, caracteristicas y metodos
 *
 * 
 */
public class Triangulo 
{
    /*Atributos*/
    private double LadoA;
    private double LadoB;
    private double Base;
    
    /*Constructores*/
    public Triangulo(double LadoA, double LadoB, double Base) 
    {
        this.LadoA = LadoA;
        this.LadoB = LadoB;
        this.Base = Base;
    }
    
    
    public Triangulo()
    {
        this.Base = 0;
        this.LadoA = 0;
        this.LadoB = 0;
    }
    
    //Get
    public double GetLadoA()
    {
        return this.LadoA;
    }
    
    //Set
    public void SetLadoA (double LadoA)
    {
        this.LadoA = LadoA;
    }
    
    //Get
    public double GetLadoB()
    {
        return this.LadoB;
    }
    
    //Set
    public void SetLadoB (double LadoB)
    {
        this.LadoB = LadoB;
    }
    
    //Get
    public double GetBase()
    {
        return this.Base;
    }
    
    //Set
    public void SetBase (double Base)
    {
        this.Base = Base;
    }
    
    public String TrianguloEquilatero(double l1, double l2, double l3)
    {
        if (l1 == l2 && l2 == l3)
        {
            return "Equilatero.\n";
        }
        return "";
    }
    
    public String TrianguloIsoseles(double l1, double l2, double l3)
    {
        if ( (l1 == l2 && l1 != l3) ||
             (l1 == l3 && l2 != l3) ||
             (l2 == l3 && l1 != l3) )
        {
            return "Isoseles.\n";
        }
        return "";
    }
        
    public String TrianguloEscaleno(double l1, double l2, double l3)
    {
        if (l1 != l2 && l2 != l3 && l3 != l1)
        {
            return "Escaleno.\n";
        }
        return "";
    }
}

