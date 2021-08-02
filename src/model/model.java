/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.controller;
import javax.swing.JOptionPane;

/**
 *
 * @author sevar
 */
public class model {

    
    private controller controlador;
   
    private double notas;

    public model() {
    }
    
    public double getNotas() {
        return notas;

    }
    
    
    public void setcontroller(controller controlador) {
       this.controlador = controlador;
    }
    public double get_contadorFor(int St){
        double count = 0;
        double notaMat = 0;
        for(int i=1; i<= St; i++){
        notaMat = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la nota del estudiante " + i));
        count += notaMat;
        }
        double total = count / St;
        JOptionPane.showMessageDialog(null, "El promedio del gupo es: " + total + " en la materia de matematicas");
        return 0;
    }
    
        public double get_contadorWhile(int St){
        int count2 = 1;
        double notaEsp = 0;
        double Esp = 0;
        
        while(count2 <= St){
        notaEsp = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la nota del estudiante " + count2));
        Esp += notaEsp;
        count2++;
        }
        double totalE = Esp / St;
        JOptionPane.showMessageDialog(null, "El promedio del gupo es: " + totalE + " en la materia de Español");
        return 0;
    }
        public double get_contadorDoWhile(int St){
        int count3 = 1;
        double notaIn = 0;
        double In = 0;
        
        do{
        notaIn = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la nota del estudiante " + count3));
        In += notaIn;
        count3++;
        }while(count3 <= St);
        double totalI = In / St;
        System.out.print(totalI);
        JOptionPane.showMessageDialog(null, "El promedio del gupo es: " + totalI + " en la materia Ingles");
        return 0;
    }
    
}
