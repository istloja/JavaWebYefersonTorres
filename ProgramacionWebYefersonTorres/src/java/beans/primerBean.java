/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


/**
 *
 * @author yefersontorresberru
 */
@Named
@ViewScoped
public class primerBean implements Serializable {

    /**
     * Creates a new instance of primerBean
     */
    private int valor1;
    private String nombre;
    public primerBean() {
        //valor1=0;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public String getNombre() {
        return "Hola "+nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
