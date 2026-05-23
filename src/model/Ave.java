package model;

import enums.TipoAnimal;
import enums.TipoHabitat;

/**
 * Clase abstracta que representa un ave.
 * Hereda de Animal y añade atributos específicos de aves.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 */
public abstract class Ave extends Animal {
    
    // ==================== ATRIBUTOS ESPECÍFICOS ====================
    
    /** Envergadura de alas en metros */
    private double envergaduraAlas;
    
    /** Indica si puede volar */
    private boolean puedeVolar;
    
    /** Tipo de pico (Cónico, Ganchudo, etc.) */
    private String tipoPico;
    
    /** Color del plumaje */
    private String colorPlumaje;
    
    /** Velocidad de vuelo en km/h */
    private double velocidadVuelo;
    
    /** Patrón migratorio (Residente, Migratorio) */
    private String patronMigratorio;
    
    /** Número de huevos por puesta */
    private int numeroHuevosPuesta;
    
    /** Tiempo de incubación en días */
    private int tiempoIncubacionDias;
    
    /** Altura de vuelo máxima en metros */
    private double alturaVueloMaxima;
    
    /** Tipo de nido */
    private String tipoNido;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Ave.
     * 
     * @param nombre              Nombre
     * @param especie             Especie
     * @param edad                Edad
     * @param peso                Peso
     * @param altura              Altura
     * @param habitat             Hábitat
     * @param alimentacion        Alimentación
     * @param enPeligroExtincion  En peligro
     * @param envergaduraAlas     Envergadura de alas
     * @param puedeVolar          Puede volar
     * @param tipoPico            Tipo de pico
     * @param colorPlumaje        Color del plumaje
     * @param velocidadVuelo      Velocidad de vuelo
     * @param patronMigratorio    Patrón migratorio
     * @param numeroHuevosPuesta  Número de huevos
     * @param tiempoIncubacionDias Tiempo de incubación
     * @param alturaVueloMaxima   Altura máxima de vuelo
     * @param tipoNido            Tipo de nido
     */
    public Ave(String nombre, String especie, int edad, double peso, double altura,
               TipoHabitat habitat, String alimentacion, boolean enPeligroExtincion,
               double envergaduraAlas, boolean puedeVolar, String tipoPico,
               String colorPlumaje, double velocidadVuelo, String patronMigratorio,
               int numeroHuevosPuesta, int tiempoIncubacionDias, double alturaVueloMaxima,
               String tipoNido) {
        super(nombre, especie, edad, peso, altura, TipoAnimal.AVE, habitat,
              alimentacion, enPeligroExtincion);
        this.envergaduraAlas = envergaduraAlas;
        this.puedeVolar = puedeVolar;
        this.tipoPico = tipoPico;
        this.colorPlumaje = colorPlumaje;
        this.velocidadVuelo = velocidadVuelo;
        this.patronMigratorio = patronMigratorio;
        this.numeroHuevosPuesta = numeroHuevosPuesta;
        this.tiempoIncubacionDias = tiempoIncubacionDias;
        this.alturaVueloMaxima = alturaVueloMaxima;
        this.tipoNido = tipoNido;
    }
    
    
    // ==================== MÉTODOS ABSTRACTOS ====================
    
    /**
     * Realiza el vuelo del ave.
     */
    public abstract void volar();
    
    /**
     * Construye un nido.
     */
    public abstract void anidar();
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public double getEnvergaduraAlas() { return envergaduraAlas; }
    public void setEnvergaduraAlas(double envergaduraAlas) { this.envergaduraAlas = envergaduraAlas; }
    
    public boolean isPuedeVolar() { return puedeVolar; }
    public void setPuedeVolar(boolean puedeVolar) { this.puedeVolar = puedeVolar; }
    
    public String getTipoPico() { return tipoPico; }
    public void setTipoPico(String tipoPico) { this.tipoPico = tipoPico; }
    
    public String getColorPlumaje() { return colorPlumaje; }
    public void setColorPlumaje(String colorPlumaje) { this.colorPlumaje = colorPlumaje; }
    
    public double getVelocidadVuelo() { return velocidadVuelo; }
    public void setVelocidadVuelo(double velocidadVuelo) { this.velocidadVuelo = velocidadVuelo; }
    
    public String getPatronMigratorio() { return patronMigratorio; }
    public void setPatronMigratorio(String patronMigratorio) { this.patronMigratorio = patronMigratorio; }
    
    public int getNumeroHuevosPuesta() { return numeroHuevosPuesta; }
    public void setNumeroHuevosPuesta(int numeroHuevosPuesta) { this.numeroHuevosPuesta = numeroHuevosPuesta; }
    
    public int getTiempoIncubacionDias() { return tiempoIncubacionDias; }
    public void setTiempoIncubacionDias(int tiempoIncubacionDias) { this.tiempoIncubacionDias = tiempoIncubacionDias; }
    
    public double getAlturaVueloMaxima() { return alturaVueloMaxima; }
    public void setAlturaVueloMaxima(double alturaVueloMaxima) { this.alturaVueloMaxima = alturaVueloMaxima; }
    
    public String getTipoNido() { return tipoNido; }
    public void setTipoNido(String tipoNido) { this.tipoNido = tipoNido; }
}
// fin de la clase Ave