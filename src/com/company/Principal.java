package com.company;

public class Principal {

    public static void main(String[] args) {
      Auto peugeot = new Auto();
       peugeot.fabricante="Peugeot";
       peugeot.modelo="208";
       peugeot.color="azul";
       peugeot.cilindrada= 1.457;


       System.out.println(peugeot.detalle());


    }
}
