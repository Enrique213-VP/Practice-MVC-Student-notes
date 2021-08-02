package view;

import controller.controller;
import model.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sevar
 */
public class NotaStudent {


    public static void main(String[] args) {
       
        controller controlador = new controller();
        NotEs panel = new NotEs();
        model modelo = new model();
        
        panel.setcontroller(controlador);
        modelo.setcontroller(controlador);

        controlador.setNotEs(panel);
        controlador.setmodel(modelo);
        controlador.arrancar();
        panel.setVisible(true);
    }
    
}
