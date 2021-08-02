/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.model;
import view.NotEs;

/**
 *
 * @author sevar
 */
public class controller{
    
    private NotEs panel;
    private model modelo;
    private int St;

    public void setNotEs(NotEs panel) {
        this.panel = panel;
    }

    public void setmodel(model modelo) {
        this.modelo = modelo;
    }
    
    public void arrancar(){
       panel.setLocationRelativeTo(null);
       panel.setTitle("Interfaz Gráfica de Notas");
       panel.setVisible(true);
    }

    public double cargarNotasFor() {
       St = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de estudiantes"));
       return modelo.get_contadorFor(St);
    }
    public double cargarNotasWhile() {
       St = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de estudiantes"));
       return modelo.get_contadorWhile(St);
    }
    public double cargarNotasDoWhile() {
       St = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de estudiantes"));
       return modelo.get_contadorDoWhile(St);
    }
    

    
}
