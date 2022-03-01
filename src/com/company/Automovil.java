package com.company;

import java.util.Objects;

public class Automovil {
    private  int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private double cilindrada;
    private int capacidadGas = 40;
    private static int generadorId;
    private static Color colorPatente = Color.NARANJA;
    private final static int VELOCIDAD_MAXIMA_CARRETERA=120;
    private final static int VELOCIDAD_MAXIMA_CIUDAD=60;
    private TipoAutomovil tipo;

    public Automovil() {
        ++generadorId;
        id =generadorId;
    }
    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }
    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }
    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadGas) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadGas = capacidadGas;
    }

    public static Color getColorPatente(){
        return colorPatente;
    }
    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadGas() {
        return capacidadGas;
    }

    public void setCapacidadGas(int capacidadGas) {
        this.capacidadGas = capacidadGas;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String verDetalle() {
        return "fabricante:" + fabricante + "\n" +
                "modelo:" + modelo + "\n" +
                "color:" + color.getColor() + "\n" +
                "cilindrada:" + cilindrada + "\n";
    }

    public String acelerar(int rpm) {
        return "el auto " + fabricante + " " + modelo + " acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return fabricante + " " + modelo + " frenando!!!";
    }

    public String acelerarFrenar(int rpm) {
        return acelerar(rpm) + "\n" + frenar();
    }

    public float calcularConsumo(int kmRecorridos, float porcentajeGas) {
        return kmRecorridos / (capacidadGas * porcentajeGas);
    }

    public float calcularConsumo(int kmRecorridos, int porcentajeGas) {
        return kmRecorridos / (capacidadGas * (porcentajeGas / 100f));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Automovil)) return false;
        Automovil automovil = (Automovil) o;
        return Objects.equals(fabricante, automovil.fabricante) && Objects.equals(modelo, automovil.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fabricante, modelo);
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id="+id+
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadGas=" + capacidadGas +
                ", colorPatente='" +colorPatente +'\'' +
                ", TipoAutomovil{" +
                "nombre='" + tipo.getNombre() + '\'' +
                ", descripcion='" + tipo.getDescripcion() + '\'' +
                ", numeroPuertas=" + getTipo().getNumeroPuertas() +
                '}'+
                '}';
    }
}
