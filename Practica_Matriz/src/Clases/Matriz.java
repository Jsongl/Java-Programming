/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author leungure
 */
public class Matriz {
    
    
    private int mat[][] = new int [3][3];

   
    public Matriz () {
        int x,y, cont = 1;
        
        
        for (x=0; x<3; x++)
        {
            for (y=0; y<3; y++) 
                this.mat[x][y]=cont++;
        }
    }
    
    public void SetMat (int x, int y, int valor)
    {
        this.mat[x][y]=valor;
    }
    
    public int GetMat (int x, int y)
    {
        return this.mat[x][y];
    }
    
    public void printMat () {
        int x, y;
        
        for (x=0; x<3; x++)
        {
            System.out.printf("\n");
            for (y=0; y<3; y++)
                System.out.printf(" %d ", this.mat[x][y]);
        }
        System.out.printf("\n");
    } 
    
}
