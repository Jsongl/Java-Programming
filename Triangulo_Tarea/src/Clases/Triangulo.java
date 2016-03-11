/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.lang.Math;
        

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
    
    public double TrianguloPerimetro(double l1, double l2, double l3)
    {
        return (l1 + l2 + l3);
    }
    
    public double TrianguloArea(double l1, double l2, double l3)
    {
        double Semiperimetro = (l1 + l2 + l3) / 2;
        double Altura;
        
        
        Altura = ((Math.sqrt(Semiperimetro * (Semiperimetro - l1) * (Semiperimetro - l2) * (Semiperimetro - l3)))
                 / l3) * 2;
    
                
        return ((Altura * l3)/2);

    }
    
}

