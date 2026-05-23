package model;

import enums.TipoAnimal;
import enums.EstadoSalud;
import enums.TipoHabitat;

/**
 * Clase abstracta que representa un animal genérico del zoológico.
 * Contiene los atributos y métodos comunes a todos los animales.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 */
public abstract class Animal {
    
    // ==================== ATRIBUTOS ====================
    
    /** Nombre del animal */
    private String nombre;
    
    /** Especie del animal */
    private String especie;
    
    /** Edad en años */
    private int edad;
    
    /** Peso en kilogramos */
    private double peso;
    
    /** Altura en metros */
    private double altura;
    
    /** Tipo de animal */
    private TipoAnimal tipo;
    
    /** Estado de salud actual */
    private EstadoSalud estadoSalud;
    
    /** Tipo de hábitat donde vive */
    private TipoHabitat habitat;
    
    /** Tipo de alimentación (Carnívoro, Herbívoro, Omnívoro) */
    private String alimentacion;
    
    /** Indica si está en peligro de extinción */
    private boolean enPeligroExtincion;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Animal.
     * 
     * @param nombre              Nombre del animal
     * @param especie             Especie
     * @param edad                Edad en años
     * @param peso                Peso en kg
     * @param altura              Altura en metros
     * @param tipo                Tipo de animal
     * @param habitat             Tipo de hábitat
     * @param alimentacion        Tipo de alimentación
     * @param enPeligroExtincion  Indica si está en peligro
     */
    public Animal(String nombre, String especie, int edad, double peso, double altura,
                  TipoAnimal tipo, TipoHabitat habitat, String alimentacion,
                  boolean enPeligroExtincion) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.tipo = tipo;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.enPeligroExtincion = enPeligroExtincion;
        this.estadoSalud = EstadoSalud.SALUDABLE;
    }
    
    
    // ==================== MÉTODOS ABSTRACTOS ====================
    
    /**
     * Emite el sonido característico del animal.
     * 
     * @return Sonido del animal
     */
    public abstract String hacerSonido();
    
    /**
     * Describe cómo se mueve el animal.
     * 
     * @return Descripción del movimiento
     */
    public abstract String moverse();
    
    /**
     * Describe cómo se alimenta el animal.
     * 
     * @return Descripción de la alimentación
     */
    public abstract String alimentarse();
    
    
    // ==================== MÉTODOS CONCRETOS ====================
    
    /**
     * Actualiza el estado de salud del animal.
     */
    public void actualizarSalud() {
        // Lógica de actualización de salud según edad, peso, etc.
        if (edad > 20) {
            estadoSalud = EstadoSalud.ATENCION;
        }
    }
    
    /**
     * Registra que el animal recibe tratamiento médico.
     */
    public void recibirTratamiento() {
        estadoSalud = EstadoSalud.SALUDABLE;
        System.out.println(nombre + " ha recibido tratamiento y está saludable");
    }
    
    /**
     * Cambia el hábitat del animal.
     * 
     * @param nuevoHabitat Nuevo tipo de hábitat
     */
    public void cambiarHabitat(TipoHabitat nuevoHabitat) {
        this.habitat = nuevoHabitat;
        System.out.println(nombre + " ha sido trasladado a " + nuevoHabitat);
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    
    public TipoAnimal getTipo() { return tipo; }
    
    public EstadoSalud getEstadoSalud() { return estadoSalud; }
    public void setEstadoSalud(EstadoSalud estadoSalud) { this.estadoSalud = estadoSalud; }
    
    public TipoHabitat getHabitat() { return habitat; }
    public void setHabitat(TipoHabitat habitat) { this.habitat = habitat; }
    
    public String getAlimentacion() { return alimentacion; }
    public void setAlimentacion(String alimentacion) { this.alimentacion = alimentacion; }
    
    public boolean isEnPeligroExtincion() { return enPeligroExtincion; }
    public void setEnPeligroExtincion(boolean enPeligroExtincion) { this.enPeligroExtincion = enPeligroExtincion; }
}
// fin de la clase Animal