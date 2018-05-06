/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
package listadoblevideo;



/**
 *
 * @author admin
 */
public class listaequipos {
    public elementoequipo primero ;
    public elementoequipo ultimo ;
    listaequipos(){
    
    primero = null;
     ultimo = null;
    }
    
    public void insertarequipo(String nombreb, int idb, int ganadosb ){
    elementoequipo equipo = new elementoequipo();
    equipo.nombre = nombreb;
    equipo.id = idb;
    equipo.ganados = ganadosb;
    if (primero == null){
    primero = equipo;
    primero.cambiarsiguiente(null);
    ultimo = primero;
    ultimo.cambiaranterior(null);
    }else{
    ultimo.siguiente = equipo;
    equipo.siguiente = null;
    ultimo = equipo;
    ultimo.cambiaranterior(equipo);
    }
    
    
    }
     public void insertarequipoinicio(String nombreb, int idb, int ganadosb ){
    elementoequipo equipo = new elementoequipo();
    equipo.nombre = nombreb;
    equipo.id = idb;
    equipo.ganados = ganadosb;
    if (primero == null){
    primero = equipo;
    ultimo = primero;
    ultimo.cambiaranterior(null);
    }else{
    primero.anterior = equipo;
    primero = equipo;   }
    
    
    }
    public listaequipos (int i){
    
    
    }
//    public String buscarequipo(int dato){
//    elementoequipo actual = new elementoequipo();
//    actual = primero;
//    while(actual!=null){
//    if (actual.id == dato){
//    return actual.nombre;
//    break;
//    }else{
//    return "No se ha encontrado";
//    }
//    }
//    
//    }
    
    public void Verlista(){
    elementoequipo actual = new elementoequipo();
    actual = primero;
    while(actual != null){
    System.out.println(actual.nombre);
    
    actual = actual.siguiente;
    }
    
    }
     public void buscar(int ida){
    elementoequipo actual = new elementoequipo();
    actual = ultimo;
    while(actual != null){
        if(actual.id==ida){
    System.out.println("Encontrado");
        break;
        }
    actual = actual.anterior;
    actual.siguiente = actual;
    }
    }
public void modificar(int ida, int ganadosa, String nombrea){
    elementoequipo actual = new elementoequipo();
    actual = ultimo;
    while(actual != null){
      if(actual.id == ida){
       actual.nombre = nombrea;
       actual.ganados = ganadosa;
       break;
        }
       actual.anterior = actual;
       actual = actual.siguiente;
        }
}
public boolean  estavacia(){
   
    if (primero != null){
      
       return false;
        }
    else{
    return true;
    }
}
public void eliminar(int id){
   
    elementoequipo actual = primero;
       elementoequipo anterior = null;
        while(actual!=null){
        if(actual.id == id){
        if(actual == primero){
        primero = primero.siguiente;
       
        }else{
        anterior.siguiente = actual.siguiente;
        
        }
        }
       anterior = actual;
       actual = actual.siguiente;
        }
}

}
