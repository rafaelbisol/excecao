/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author rafaelbisol
 */
public class SomaMatrizesIncompativeisException extends MatrizesIncompativeisException {
    private final Matriz m1;
    private final Matriz m2;
    
    public SomaMatrizesIncompativeisException(Matriz m1, Matriz m2) {
        super(m1, m2, "Matrizes de %dx%d e %dx%d não podem ser somadas");
        this.m1=m1;
        this.m2=m2;
    }

    @Override
    public Matriz getM1() {
        return m1;
    }

    @Override
    public Matriz getM2() {
        return m2;
    }
    
    
}
