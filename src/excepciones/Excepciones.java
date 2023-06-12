/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Estudiante
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            String valorNumerico = "16";
            int numero = Utilitario.convertir(valorNumerico);
            System.out.println("El numero es:"+numero);
            
        }catch(MExcepcionesNumerica e){
            
            System.err.println(e.getMessage());
            
        }catch(MExcepcionGenerica e){
            
            System.err.println(e.getMessage());
        
    }
    
    }
}
