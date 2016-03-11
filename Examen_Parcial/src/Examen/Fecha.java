/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;


public class Fecha {

    private int dia;
    private int mes;
    private int ano;

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Fecha() {
    }
 
    public int getDia() {
        return dia;
    }

    public int setDia(int dia) {
        
        if (dia>=1 && dia<=31 && this.mes!=2)
        {
            this.dia = dia;
            return 0;
        }
        else if (dia>=1 && dia<=28 && this.mes==2)
        {
            this.dia = dia;
            return 0;
        }
        else 
        {
            System.out.printf ("    El dia es invalido\n");
            System.out.printf ("    digite un numero de 1 a 28 para el mes de febrero.\n");
            System.out.printf ("    o un numero de 1 a 31 para cualquier otro mes.\n");
            return 1;
        }
        
        
    }

    public int getMes() {
        return mes;
    }

    public int setMes(int mes) {

        if (mes>=1 && mes<=12)
        {
            this.mes = mes;
            return 0;
        }
        else
        {
            System.out.printf ("    El mes es invalido, digite un numero de 1 a 12.\n");
            System.out.printf ("    Trate de nuevo.\n");
            return 1;
        }
        
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int pFechaPosterior (Fecha pFechaPosterior)
    {
        int diferenciaAnos;
        
        diferenciaAnos = this.ano - pFechaPosterior.getAno();
        
        return diferenciaAnos; 
    }
    
}
