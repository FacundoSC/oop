package com.company;

import java.util.Objects;

public class Automovil implements  Comparable<Automovil>{
    private  int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas = new Rueda[5];
    private static int generadorId;
    private int indiceArregloRueda;
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
    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor) {
        this(fabricante, modelo, color, motor,estanque);
        this.conductor = conductor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante,modelo,color,motor,estanque,conductor);
        this.ruedas = ruedas;
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

    public Motor getMotor() {
        return motor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Automovil addRueda(Rueda rueda){
        this.ruedas[indiceArregloRueda++]=rueda;
        return this;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String verDetalle() {
        String detalle = (fabricante != null)?"fabricante:" + fabricante + "\n" :"";
             detalle += (modelo != null)?  "modelo:" + modelo + "\n" :"";
             detalle +=(color != null)? "color:" + color.getColor() + "\n" :"";
             detalle +=(motor != null)? "cilindrada:" + motor.getCilindrada() + "\n" :"";
             detalle +=(estanque != null) ? "capacidad tanque:" + estanque.getCapacidad() + "\n" :"";
             detalle +=(conductor != null)?"conductor:" + conductor.toString() + "\n" :"";
             if(ruedas != null) {
                 detalle += "Ruedas:{\n";
                 for (Rueda rueda : ruedas) {
                  detalle+= rueda.toString() +"\n";
                 }
                 detalle+="}\n";
             }

        return detalle;
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
        return kmRecorridos / ( ((float)motor.getCilindrada()) * porcentajeGas);
    }

    public float calcularConsumo(int kmRecorridos, int porcentajeGas) {
        return kmRecorridos / ( ((float) motor.getCilindrada()) * (porcentajeGas / 100f));
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
                ", cilindrada=" + motor.getCilindrada() +
                ", capacidadGas=" + motor.getCilindrada() +
                ", colorPatente='" +colorPatente +'\'' +
                ", TipoAutomovil{" +
                "nombre='" + tipo.getNombre() + '\'' +
                ", descripcion='" + tipo.getDescripcion() + '\'' +
                ", numeroPuertas=" + getTipo().getNumeroPuertas() +
                '}'+
                '}';
    }

    @Override
    public int compareTo(Automovil a) {
        return  this.fabricante.compareTo(a.getFabricante());
    }
}
