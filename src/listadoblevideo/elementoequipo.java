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
public class elementoequipo {
  public  int id;
  public  String nombre;
  public  int ganados;
  public  elementoequipo siguiente;
  public  elementoequipo anterior;
    public elementoequipo(){
//    siguiente= sig;
//    anterior = ant;
//    id = dato;
//    
    
    }
public void cambiaranterior(elementoequipo eq){

this.anterior = eq;
}
public void cambiarsiguiente (elementoequipo eq){

this.siguiente = eq;
}

public elementoequipo devuelveant(){
return anterior;
}

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGanados() {
        return ganados;
    }

    public elementoequipo getSiguiente() {
        return siguiente;
    }

    public elementoequipo getAnterior() {
        return anterior;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public void setSiguiente(elementoequipo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(elementoequipo anterior) {
        this.anterior = anterior;
    }

    void setsiguiente(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
