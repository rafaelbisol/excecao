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
public class MatrizesIncompativeisException extends RuntimeException{
    
    private final Matriz m1;
    private final Matriz m2;
    
    public MatrizesIncompativeisException(Matriz m1, Matriz m2, String mensagem){
        super(mensagem);
        
        this.m1 = m1;
        this.m2 = m2;
    }
    
    protected MatrizesIncompativeisException(Matriz m1, Matriz m2){
        super(String.format("Matriz de %dx%d e %dx%d imcompativeis", m1.getMatriz().length, m1.getMatriz()[0].length, m2.getMatriz().length, m2.getMatriz()[0].length));
        
        this.m1 = m1;
        this.m2 = m2;
    }
    
    public Matriz getM1(){
        return m1;
    }
    
    public Matriz getM2(){
        return m2;
    }
    
}