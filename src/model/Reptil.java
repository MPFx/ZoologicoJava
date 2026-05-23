package model;

import enums.TipoAnimal;
import enums.TipoHabitat;

/**
 * Clase abstracta que representa un reptil.
 * Hereda de Animal y añade atributos específicos de reptiles.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 */
public abstract class Reptil extends Animal {
    
    // ==================== ATRIBUTOS ESPECÍFICOS ====================
    
    /** Indica si es venenoso */
    private boolean esVenenoso;
    
    /** Tipo de escamas (Quilladas, Lisas) */
    private String tipoEscamas;
    
    /** Tipo de veneno (Neurotóxico, Hemotóxico, etc.) */
    private String tipoVeneno;
    
    /** Temperatura ideal del hábitat en °C */
    private double temperaturaIdeal;
    
    /** Indica si tiene caparazón (tortugas) */
    private boolean tieneCaparazon;
    
    /** Tiempo de vida promedio en años */
    private int tiempoVidaPromedio;
    
    /** Tipo de reproducción (Oviparo, Ovoviviparo) */
    private String tipoReproduccion;
    
    /** Número de huevos por puesta */
    private int numeroHuevosPuesta;
    
    /** Longitud máxima en metros */
    private double longitudMaxima;
    
    /** Patrón de coloración */
    private String patronColoracion;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Reptil.
     * 
     * @param nombre              Nombre
     * @param especie             Especie
     * @param edad                Edad
     * @param peso                Peso
     * @param altura              Altura
     * @param habitat             Hábitat
     * @param alimentacion        Alimentación
     * @param enPeligroExtincion  En peligro
     * @param esVenenoso          Es venenoso
     * @param tipoEscamas         Tipo de escamas
     * @param tipoVeneno          Tipo de veneno
     * @param temperaturaIdeal    Temperatura ideal
     * @param tieneCaparazon      Tiene caparazón
     * @param tiempoVidaPromedio  Tiempo de vida
     * @param tipoReproduccion    Tipo de reproducción
     * @param numeroHuevosPuesta  Número de huevos
     * @param longitudMaxima      Longitud máxima
     * @param patronColoracion    Patrón de coloración
     */
    public Reptil(String nombre, String especie, int edad, double peso, double altura,
                  TipoHabitat habitat, String alimentacion, boolean enPeligroExtincion,
                  boolean esVenenoso, String tipoEscamas, String tipoVeneno,
                  double temperaturaIdeal, boolean tieneCaparazon, int tiempoVidaPromedio,
                  String tipoReproduccion, int numeroHuevosPuesta, double longitudMaxima,
                  String patronColoracion) {
        super(nombre, especie, edad, peso, altura, TipoAnimal.REPTIL, habitat,
              alimentacion, enPeligroExtincion);
        this.esVenenoso = esVenenoso;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.temperaturaIdeal = temperaturaIdeal;
        this.tieneCaparazon = tieneCaparazon;
        this.tiempoVidaPromedio = tiempoVidaPromedio;
        this.tipoReproduccion = tipoReproduccion;
        this.numeroHuevosPuesta = numeroHuevosPuesta;
        this.longitudMaxima = longitudMaxima;
        this.patronColoracion = patronColoracion;
    }
    
    
    // ==================== MÉTODOS ABSTRACTOS ====================
    
    /**
     * Regula la temperatura corporal tomando sol.
     */
    public abstract void regularTemperatura();
    
    /**
     * Muda la piel periódicamente.
     */
    public abstract void mudarPiel();
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public boolean isEsVenenoso() { return esVenenoso; }
    public void setEsVenenoso(boolean esVenenoso) { this.esVenenoso = esVenenoso; }
    
    public String getTipoEscamas() { return tipoEscamas; }
    public void setTipoEscamas(String tipoEscamas) { this.tipoEscamas = tipoEscamas; }
    
    public String getTipoVeneno() { return tipoVeneno; }
    public void setTipoVeneno(String tipoVeneno) { this.tipoVeneno = tipoVeneno; }
    
    public double getTemperaturaIdeal() { return temperaturaIdeal; }
    public void setTemperaturaIdeal(double temperaturaIdeal) { this.temperaturaIdeal = temperaturaIdeal; }
    
    public boolean isTieneCaparazon() { return tieneCaparazon; }
    public void setTieneCaparazon(boolean tieneCaparazon) { this.tieneCaparazon = tieneCaparazon; }
    
    public int getTiempoVidaPromedio() { return tiempoVidaPromedio; }
    public void setTiempoVidaPromedio(int tiempoVidaPromedio) { this.tiempoVidaPromedio = tiempoVidaPromedio; }
    
    public String getTipoReproduccion() { return tipoReproduccion; }
    public void setTipoReproduccion(String tipoReproduccion) { this.tipoReproduccion = tipoReproduccion; }
    
    public int getNumeroHuevosPuesta() { return numeroHuevosPuesta; }
    public void setNumeroHuevosPuesta(int numeroHuevosPuesta) { this.numeroHuevosPuesta = numeroHuevosPuesta; }
    
    public double getLongitudMaxima() { return longitudMaxima; }
    public void setLongitudMaxima(double longitudMaxima) { this.longitudMaxima = longitudMaxima; }
    
    public String getPatronColoracion() { return patronColoracion; }
    public void setPatronColoracion(String patronColoracion) { this.patronColoracion = patronColoracion; }
}
// fin de la clase Reptil