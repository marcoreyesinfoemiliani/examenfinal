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
    public elementoequipo primero ; //Nodos que hacen referencia al inicio y fin de nuestra lista
    public elementoequipo ultimo ;
   
    listaequipos(){ //Constructor de la lista, se inicia nula porque esta vacia.
    
    primero = null;
     ultimo = null;
    }
    
    public void insertarequipo(String nombreb, int idb, int ganadosb ){ //Se inserta un equipo al final de la lista
    elementoequipo equipo = new elementoequipo();
    equipo.nombre = nombreb;
    equipo.id = idb;
    equipo.ganados = ganadosb;
    if (primero == null){ //Se condiciona que si la lista es nula se agregue el nuevo nodo como el primero

    primero = equipo;
   
    ultimo = primero;
  
    }else{ //de lo contrario se ingresa hasta el final de la lista.
    ultimo.siguiente = equipo;

    ultimo = equipo;
    
    }
    
    
    }
     public void insertarequipoinicio(String nombreb, int idb, int ganadosb ){//Se inserta un equipo al inicio de la lista
    elementoequipo equipo = new elementoequipo();
    equipo.nombre = nombreb;
    equipo.id = idb;
    equipo.ganados = ganadosb;
    if (primero == null){
    primero = equipo;
    ultimo = primero;

    }else{
    primero.cambiaranterior(equipo);
    primero = equipo;   
    
    }
    
    
    }
    public void Verlista(){ //Método para recorrer la lista e imprimirla
    elementoequipo actual = new elementoequipo();
    actual = primero;
    while(actual != null){
System.out.println(actual.nombre + actual.id);
    
    actual = actual.siguiente; //Aca se pasa de un nodo a otro por medio del apuntador
    }
    
    }
    public int vertamaño(){ //Se recorre la lista para contar el numero de nodos existentes en la lista.
    elementoequipo actual = new elementoequipo();
    actual = primero;
    int tamaño =1;
    while(actual != null){

    tamaño++;
    actual = actual.siguiente; //Se da un salto entre cada nodo.
    }
    return tamaño;
    }
     public String mostrarultimo(){ // se muestran los atributos de la ultima lista
    
   String nombreultimo = ultimo.nombre;
   
    return nombreultimo;
    }
    
    public void buscar(int ida){ // Se recorre la lista para buscar el nodo con el id ingresado
    elementoequipo actual = new elementoequipo();
    actual = ultimo;
    while(actual != null){ //Se comparan los nodos con el nodo ingresado
        if(actual.id==ida){
    System.out.println("Encontrado");
        break;
        }
    actual = actual.anterior; //Se da un salto entre cada nodo.
    actual.siguiente = actual;
    }
    }
public void modificar(int ida, int ganadosa, String nombrea){  //Sucede lo mismo que con el buscador, pero aca se modifican los atributos cuando se encuentra el elemento.
    elementoequipo actual = new elementoequipo();
    actual = ultimo;
    while(actual != null){
      if(actual.id == ida){
       actual.nombre = nombrea;
       actual.ganados = ganadosa;
       break;
        }
       actual.anterior = actual;    //Se da un salto entre cada nodo.
       actual = actual.siguiente;
        }
}
public boolean  estavacia(){ // Se comprueba si la lista esta vacia o no al verificar el primer nodo.
   
    if (primero != null){
      
       return false;
        }
    else{
    return true;
    }
}
public void eliminar(int id){ //Se elimina el nodo que se ingreso por medio de una busqueda
   
    elementoequipo actual = primero;
       elementoequipo anterior = null;
        while(actual!=null){
        if(actual.id == id){ // al encontrar el nodo se revisa si es el primero de la lista
        if(actual == primero){ //Si es el primero de la lista, se corre un espacio la lista para eliminarlo
        primero = primero.siguiente;
       
        }
        else{
        actual.anterior.siguiente = actual.siguiente; // Si el nodo no es el primero, al encontrarlo se da un salto para dejarlo sin punteros. 
        
        }
        }
       anterior = actual;
       actual = actual.siguiente;    //Se da un salto entre cada nodo.
        }
}

}
