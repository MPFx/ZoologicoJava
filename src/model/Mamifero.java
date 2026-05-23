package model;

import enums.TipoAnimal;
import enums.TipoHabitat;

/**
 * Clase abstracta que representa un mamífero.
 * Hereda de Animal y añade atributos específicos de mamíferos.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 */
public abstract class Mamifero extends Animal {
    
    // ==================== ATRIBUTOS ESPECÍFICOS ====================
    
    /** Tipo de pelaje (Corto, Largo, Lanudo) */
    private String tipoPelaje;
    
    /** Tiempo de gestación en días */
    private int tiempoGestacionDias;
    
    /** Número de crías por parto */
    private int numeroCrias;
    
    /** Indica si es doméstico */
    private boolean esDomestico;
    
    /** Tipo de dentadura (Caninos, Molares, etc.) */
    private String tipoDentadura;
    
    /** Temperatura corporal en °C */
    private int temperaturaCorporal;
    
    /** Patrón de manchas o rayas */
    private String patronManchas;
    
    /** Velocidad máxima en km/h */
    private double velocidadMaxima;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Mamifero.
     * 
     * @param nombre              Nombre
     * @param especie             Especie
     * @param edad                Edad
     * @param peso                Peso
     * @param altura              Altura
     * @param habitat             Hábitat
     * @param alimentacion        Alimentación
     * @param enPeligroExtincion  En peligro
     * @param tipoPelaje          Tipo de pelaje
     * @param tiempoGestacionDias Tiempo de gestación
     * @param numeroCrias         Número de crías
     * @param esDomestico         Doméstico
     * @param tipoDentadura       Tipo de dentadura
     * @param temperaturaCorporal Temperatura corporal
     * @param patronManchas       Patrón de manchas
     * @param velocidadMaxima     Velocidad máxima
     */
    public Mamifero(String nombre, String especie, int edad, double peso, double altura,
                    TipoHabitat habitat, String alimentacion, boolean enPeligroExtincion,
                    String tipoPelaje, int tiempoGestacionDias, int numeroCrias,
                    boolean esDomestico, String tipoDentadura, int temperaturaCorporal,
                    String patronManchas, double velocidadMaxima) {
        super(nombre, especie, edad, peso, altura, TipoAnimal.MAMIFERO, habitat,
              alimentacion, enPeligroExtincion);
        this.tipoPelaje = tipoPelaje;
        this.tiempoGestacionDias = tiempoGestacionDias;
        this.numeroCrias = numeroCrias;
        this.esDomestico = esDomestico;
        this.tipoDentadura = tipoDentadura;
        this.temperaturaCorporal = temperaturaCorporal;
        this.patronManchas = patronManchas;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    
    // ==================== MÉTODOS ABSTRACTOS ====================
    
    /**
     * Amamanta a las crías.
     */
    public abstract void amamantar();
    
    
    // ==================== MÉTODOS CONCRETOS ====================
    
    /**
     * Realiza el proceso de gestación.
     */
    public void gestar() {
        System.out.println(getNombre() + " está gestando por " + tiempoGestacionDias + " días");
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public String getTipoPelaje() { return tipoPelaje; }
    public void setTipoPelaje(String tipoPelaje) { this.tipoPelaje = tipoPelaje; }
    
    public int getTiempoGestacionDias() { return tiempoGestacionDias; }
    public void setTiempoGestacionDias(int tiempoGestacionDias) { this.tiempoGestacionDias = tiempoGestacionDias; }
    
    public int getNumeroCrias() { return numeroCrias; }
    public void setNumeroCrias(int numeroCrias) { this.numeroCrias = numeroCrias; }
    
    public boolean isEsDomestico() { return esDomestico; }
    public void setEsDomestico(boolean esDomestico) { this.esDomestico = esDomestico; }
    
    public String getTipoDentadura() { return tipoDentadura; }
    public void setTipoDentadura(String tipoDentadura) { this.tipoDentadura = tipoDentadura; }
    
    public int getTemperaturaCorporal() { return temperaturaCorporal; }
    public void setTemperaturaCorporal(int temperaturaCorporal) { this.temperaturaCorporal = temperaturaCorporal; }
    
    public String getPatronManchas() { return patronManchas; }
    public void setPatronManchas(String patronManchas) { this.patronManchas = patronManchas; }
    
    public double getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(double velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }
}
// fin de la clase Mamifero