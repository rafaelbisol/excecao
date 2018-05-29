
package utfpr.ct.dainf.if62c.pratica;

import utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException;

/**
 * Representa uma matriz de valores {@code double}.
 * @author Wilson Horstmeyer Bogadao <wilson@utfpr.edu.br>
 */
public class Matriz {
    
    // a matriz representada por esta classe
    private final double[][] mat;
    
    /**
     * Construtor que aloca a matriz.
     * @param m O número de linhas da matriz.
     * @param n O número de colunas da matriz.
     */
    public Matriz(int m, int n) throws MatrizInvalidaException{
        
        if(m <= 0 || n <= 0){
            throw new MatrizInvalidaException(m,n);
        }
        
        mat = new double[m][n];
    }
    
    /**
     * Retorna a matriz representada por esta classe.
     * @return A matriz representada por esta classe
     */
    public double[][] getMatriz() {
        return mat;
    }
    
    /**
     * Retorna a matriz transposta.
     * @return A matriz transposta.
     */
    public Matriz getTransposta() throws MatrizInvalidaException{
        Matriz t = new Matriz(mat[0].length, mat.length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                t.mat[j][i] = mat[i][j];
            }
        }
        return t;
    }
    
    /**
     * Retorna a soma desta matriz com a matriz recebida como argumento.
     * @param m A matriz a ser somada
     * @return A soma das matrizes
     */
    public Matriz soma(Matriz m) throws MatrizInvalidaException, SomaMatrizesIncompativeisException{
        
        if(m.getMatriz().length != this.getMatriz().length || m.getMatriz()[0].length != this.getMatriz()[0].length){
            throw new SomaMatrizesIncompativeisException(this, m);
        }

            
        Matriz soma = new Matriz(mat.length, mat[0].length);
        double[][] som = soma.getMatriz();
        double[][] matr = m.getMatriz();
        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j<mat[0].length ; j++){
                    som[i][j] = mat[i][j] + matr[i][j];

            }
        }

            return soma;
    }

    /**
     * Retorna o produto desta matriz com a matriz recebida como argumento.
     * @param m A matriz a ser multiplicada
     * @return O produto das matrizes
     */
    public Matriz prod(Matriz m) throws MatrizInvalidaException, ProdMatrizesIncompativeisException{
        if(this.getMatriz()[0].length != m.getMatriz().length){
            throw new ProdMatrizesIncompativeisException(this, m);
        }
        
        Matriz prod = new Matriz(mat.length, m.mat[0].length);

        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j < m.mat[0].length ; j++){
                    prod.mat[i][j]=0;
            }
        }

        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j < m.mat[0].length ; j++){
                for(int x=0 ; x< mat[0].length ; x++){
                        prod.mat[i][j] += mat[i][x] * m.mat[x][j];
                }

            }
        }

            return prod;
    }

    /**
     * Retorna uma representação textual da matriz.
     * Este método não deve ser usado com matrizes muito grandes
     * pois não gerencia adequadamente o tamanho do string e
     * poderia provocar um uso excessivo de recursos.
     * @return Uma representação textual da matriz.
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (double[] linha: mat) {
            s.append("[ ");
            for (double x: linha) {
                s.append(x).append(" ");
            }
            s.append("]");
        }
        return s.toString();
    }
    
}
