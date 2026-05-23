package model;

import enums.TipoHabitat;

/**
 * Clase que representa una serpiente, un reptil.
 * Hereda de Reptil y sobrescribe los métodos abstractos.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 */
public class Serpiente extends Reptil {
    
    // ==================== ATRIBUTOS ESPECÍFICOS ====================
    
    /** Longitud actual en metros */
    private double longitudActual;
    
    /** Diámetro del cuerpo en cm */
    private double diametroCuerpo;
    
    /** Velocidad de desplazamiento en km/h */
    private double velocidadDesplazamiento;
    
    /** Método de caza (Constricción, Veneno) */
    private String metodoCaza;
    
    /** Capacidad de apertura de mandíbula (cm) */
    private double aperturaMandibulaCm;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Serpiente.
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
     * @param longitudActual      Longitud actual
     * @param diametroCuerpo      Diámetro del cuerpo
     * @param velocidadDesplazamiento Velocidad
     * @param metodoCaza          Método de caza
     * @param aperturaMandibulaCm Apertura de mandíbula
     */
    public Serpiente(String nombre, String especie, int edad, double peso, double altura,
                     TipoHabitat habitat, String alimentacion, boolean enPeligroExtincion,
                     boolean esVenenoso, String tipoEscamas, String tipoVeneno,
                     double temperaturaIdeal, boolean tieneCaparazon, int tiempoVidaPromedio,
                     String tipoReproduccion, int numeroHuevosPuesta, double longitudMaxima,
                     String patronColoracion, double longitudActual, double diametroCuerpo,
                     double velocidadDesplazamiento, String metodoCaza, double aperturaMandibulaCm) {
        super(nombre, especie, edad, peso, altura, habitat, alimentacion, enPeligroExtincion,
              esVenenoso, tipoEscamas, tipoVeneno, temperaturaIdeal, tieneCaparazon,
              tiempoVidaPromedio, tipoReproduccion, numeroHuevosPuesta, longitudMaxima,
              patronColoracion);
        this.longitudActual = longitudActual;
        this.diametroCuerpo = diametroCuerpo;
        this.velocidadDesplazamiento = velocidadDesplazamiento;
        this.metodoCaza = metodoCaza;
        this.aperturaMandibulaCm = aperturaMandibulaCm;
    }
    
    
    // ==================== MÉTODOS SOBRESCRITOS ====================
    
    @Override
    public String hacerSonido() {
        return "¡Siseo amenazante! SSSSSS";
    }
    
    @Override
    public String moverse() {
        return getNombre() + " se arrastra serpenteando a " + velocidadDesplazamiento + " km/h";
    }
    
    @Override
    public String alimentarse() {
        if (metodoCaza.equals("Constricción")) {
            return getNombre() + " envuelve a su presa y la asfixia";
        } else if (metodoCaza.equals("Veneno")) {
            return getNombre() + " inyecta veneno " + getTipoVeneno() + " a su presa";
        }
        return getNombre() + " traga entera a su presa gracias a su mandíbula de " + 
               aperturaMandibulaCm + " cm de apertura";
    }
    
    @Override
    public void regularTemperatura() {
        System.out.println(getNombre() + " toma sol sobre una roca a " + getTemperaturaIdeal() + "°C");
    }
    
    @Override
    public void mudarPiel() {
        System.out.println(getNombre() + " ha mudado su piel completamente");
    }
    
    /**
     * Ataca a su presa.
     */
    public void atacar() {
        if (isEsVenenoso()) {
            System.out.println(getNombre() + " ataca con su veneno " + getTipoVeneno());
        } else {
            System.out.println(getNombre() + " ataca envolviendo a su presa con su cuerpo");
        }
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public double getLongitudActual() { return longitudActual; }
    public void setLongitudActual(double longitudActual) { this.longitudActual = longitudActual; }
    
    public double getDiametroCuerpo() { return diametroCuerpo; }
    public void setDiametroCuerpo(double diametroCuerpo) { this.diametroCuerpo = diametroCuerpo; }
    
    public double getVelocidadDesplazamiento() { return velocidadDesplazamiento; }
    public void setVelocidadDesplazamiento(double velocidadDesplazamiento) { this.velocidadDesplazamiento = velocidadDesplazamiento; }
    
    public String getMetodoCaza() { return metodoCaza; }
    public void setMetodoCaza(String metodoCaza) { this.metodoCaza = metodoCaza; }
    
    public double getAperturaMandibulaCm() { return aperturaMandibulaCm; }
    public void setAperturaMandibulaCm(double aperturaMandibulaCm) { this.aperturaMandibulaCm = aperturaMandibulaCm; }
}
// fin de la clase Serpiente