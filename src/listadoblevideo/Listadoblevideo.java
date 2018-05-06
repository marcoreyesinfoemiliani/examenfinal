/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblevideo;

/**
 *
 * @author admin
 */
public class Listadoblevideo {
static listaequipos leq = new listaequipos();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      leq.insertarequipo("Arg", 1, 2);
       
          leq.insertarequipo("urue", 3, 2);
          leq.Verlista();
          System.out.println(leq.vertamaño());
          
// TODO code application logic here
    }
    
}
