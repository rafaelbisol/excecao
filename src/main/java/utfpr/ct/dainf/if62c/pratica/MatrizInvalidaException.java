
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author woich
 */
public class MatrizInvalidaException extends Exception{
    private final int linMat, colMat;
    
    public MatrizInvalidaException (int linMat, int colMat){
        super(String.format("Matriz %dx%d não pode ser criada", linMat, colMat));
        
        this.linMat = linMat;
        this.colMat = colMat;
        
    }
    
    public int getNumLinhas(){
        return linMat;
    }
    
    public int getNumColunas(){
        return colMat;
    }
}

