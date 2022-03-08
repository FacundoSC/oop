package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploArregloAutomovil {
    public static void main(String[] args) {
        Motor motorPeugeot208 = new Motor(3.0,TipoMotor.BENCINA);
        Persona conductorPeugeot208 = new Persona("Facundo","Cordoba");
        Automovil peugeot = new Automovil("Peugeot", "208",Color.AZUL ,motorPeugeot208,new Estanque(),conductorPeugeot208);
        peugeot.setTipo(TipoAutomovil.SEDAN);

        Persona conductorCitroenC4 = new Persona("Fatima", "Quinteros");
        Motor motorCitroeC4 = new Motor(2.0,TipoMotor.BENCINA);
        Automovil citroenC4Louge = new Automovil("Citroën", "C4 Lounge",Color.BLANCO,motorCitroeC4,new Estanque(),conductorCitroenC4,null);
        citroenC4Louge.setColor(Color.BLANCO);
        citroenC4Louge.setTipo(TipoAutomovil.COUPE);

        Automovil[] automoviles = new Automovil[2];
        automoviles[0]= peugeot;
        automoviles[1]= citroenC4Louge;
        Arrays.sort(automoviles);
        for (Automovil auto: automoviles) {
            System.out.println(auto);
        }

    }
}
