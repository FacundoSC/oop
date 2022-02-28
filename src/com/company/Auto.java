package com.company;

public class Auto {
    String fabricante;
    String modelo;
    String color;
    double  cilindrada;
   public String detalle(){
       StringBuilder sb = new StringBuilder();
       sb.append("fabricante:"+fabricante+"\n");
       sb.append("modelo:"+modelo+"\n");
       sb.append("color:"+color+"\n");
       sb.append("cilindrada:"+cilindrada+"\n");
      return sb.toString();
   }
}
