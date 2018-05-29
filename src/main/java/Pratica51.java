import utfpr.ct.dainf.if62c.pratica.Matriz;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica51 {
    public static void main(String[] args) {
    double[][] m;
        
        //instancia valida
        try{
            Matriz orig = new Matriz(3, 2);
            m = orig.getMatriz();
            m[0][0] = 0.0;
            m[0][1] = 0.1;
            m[1][0] = 1.0;
            m[1][1] = 1.1;
            m[2][0] = 2.0;
            m[2][1] = 2.1;
            
            System.out.println("Matriz original: " + orig);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
        
        //instancia invalida
        try{
            Matriz orig = new Matriz(0, 2);
            m = orig.getMatriz();
            m[0][0] = 0.0;
            m[0][1] = 0.1;
            
            System.out.println("Matriz original: " + orig);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        //soma valida
        try{
            Matriz m1 = new Matriz(3,3);
            m = m1.getMatriz();
            m[0][0] = 3.0;
            m[0][1] = 0.0;
            m[0][2] = 5.0;
            m[1][0] = 2.0;
            m[1][1] = 1.0;
            m[1][2] = 0.0;
            m[2][0] = 0.0;
            m[2][1] = 2.0;
            m[2][2] = 3.0;

            Matriz m2 = new Matriz(3,3);
            m = m2.getMatriz();
            m[0][0] = 4.0;
            m[0][1] = 2.0;
            m[0][2] = 1.0;
            m[1][0] = 4.0;
            m[1][1] = 0.0;
            m[1][2] = 17.0;
            m[2][0] = 2.0;
            m[2][1] = 3.0;
            m[2][2] = 0.0;
            
            System.out.println("Matriz 1:\n " + m1);
            System.out.println("Matriz 2:\n " + m2);

            System.out.println("m1 + m2:\n " + m1.soma(m2));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        //soma invalida
        try{
            Matriz m1 = new Matriz(2,3);
            m = m1.getMatriz();
            m[0][0] = 4.0;
            m[0][1] = 2.0;
            m[0][2] = 1.0;
            m[1][0] = 4.0;
            m[1][1] = 0.0;
            m[1][2] = 17.0;
            
            Matriz m2 = new Matriz(3,2);
            m = m2.getMatriz();
            m[0][0] = 3.0;
            m[0][1] = 0.0;
            m[1][0] = 2.0;
            m[1][1] = 1.0;
            m[2][0] = 0.0;
            m[2][1] = 2.0;
            
            System.out.println("Matriz 1:\n " + m1);
            System.out.println("Matriz 2:\n " + m2);

            System.out.println("m1 + m2:\n " + m1.soma(m2));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        //produto valido e invalido
        try{
            Matriz m1 = new Matriz(2,3);
            m = m1.getMatriz();
            m[0][0] = 4.0;
            m[0][1] = 2.0;
            m[0][2] = 1.0;
            m[1][0] = 4.0;
            m[1][1] = 0.0;
            m[1][2] = 17.0;
            
            Matriz m2 = new Matriz(3,1);
            m = m2.getMatriz();
            m[0][0] = 3.0;
            m[1][0] = 2.0;
            m[2][0] = 0.0;
            
            System.out.println("Matriz 1:\n " + m1);
            System.out.println("Matriz 2:\n " + m2);

            System.out.println("m1 x m2:\n " + m1.prod(m2));
            System.out.println("m2 x m1:\n " + m2.prod(m1));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }        
    }
}
