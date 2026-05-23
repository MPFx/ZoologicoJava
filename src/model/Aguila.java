package model;

import enums.TipoHabitat;

/**
 * Clase que representa un águila, un ave rapaz.
 * Hereda de Ave y sobrescribe los métodos abstractos.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 */
public class Aguila extends Ave {
    
    // ==================== ATRIBUTOS ESPECÍFICOS ====================
    
    /** Distancia de visión en metros */
    private double visionDistancia;
    
    /** Tipo de pico especializado */
    private String tipoPicoEspecializado;
    
    /** Fuerza de las garras (kg/cm²) */
    private int fuerzaGarras;
    
    /** Capacidad de carga en vuelo (kg) */
    private double capacidadCargaKg;
    
    /** Envergadura de garras */
    private double envergaduraGarras;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Aguila.
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
     * @param visionDistancia     Distancia de visión
     * @param tipoPicoEspecializado Tipo de pico
     * @param fuerzaGarras        Fuerza de garras
     * @param capacidadCargaKg    Capacidad de carga
     * @param envergaduraGarras   Envergadura de garras
     */
    public Aguila(String nombre, String especie, int edad, double peso, double altura,
                  TipoHabitat habitat, String alimentacion, boolean enPeligroExtincion,
                  double envergaduraAlas, boolean puedeVolar, String tipoPico,
                  String colorPlumaje, double velocidadVuelo, String patronMigratorio,
                  int numeroHuevosPuesta, int tiempoIncubacionDias, double alturaVueloMaxima,
                  String tipoNido, double visionDistancia, String tipoPicoEspecializado,
                  int fuerzaGarras, double capacidadCargaKg, double envergaduraGarras) {
        super(nombre, especie, edad, peso, altura, habitat, alimentacion, enPeligroExtincion,
              envergaduraAlas, puedeVolar, tipoPico, colorPlumaje, velocidadVuelo,
              patronMigratorio, numeroHuevosPuesta, tiempoIncubacionDias, alturaVueloMaxima,
              tipoNido);
        this.visionDistancia = visionDistancia;
        this.tipoPicoEspecializado = tipoPicoEspecializado;
        this.fuerzaGarras = fuerzaGarras;
        this.capacidadCargaKg = capacidadCargaKg;
        this.envergaduraGarras = envergaduraGarras;
    }
    
    
    // ==================== MÉTODOS SOBRESCRITOS ====================
    
    @Override
    public String hacerSonido() {
        return "¡Chillido agudo y penetrante! ¡KREE-KREE!";
    }
    
    @Override
    public String moverse() {
        if (isPuedeVolar()) {
            return getNombre() + " vuela majestuosamente a " + getVelocidadVuelo() + " km/h";
        }
        return getNombre() + " camina erguido sobre sus patas";
    }
    
    @Override
    public String alimentarse() {
        if (getAlimentacion().equals("Carnívoro")) {
            return getNombre() + " caza con sus garras y pico afilado";
        }
        return getNombre() + " busca carroña en el territorio";
    }
    
    @Override
    public void volar() {
        System.out.println(getNombre() + " vuela hasta los " + getAlturaVueloMaxima() + " metros de altura");
    }
    
    @Override
    public void anidar() {
        System.out.println(getNombre() + " construye su nido en lo alto de las montañas");
    }
    
    /**
     * Realiza un picado en picada para cazar.
     */
    public void picarEnPicada() {
        System.out.println(getNombre() + " se lanza en picada a " + getVelocidadVuelo() + " km/h para atrapar a su presa");
    }
    
    /**
     * Caza con sus garras afiladas.
     */
    public void cazar() {
        System.out.println(getNombre() + " usa sus garras de " + fuerzaGarras + " kg/cm² para atrapar a su presa");
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public double getVisionDistancia() { return visionDistancia; }
    public void setVisionDistancia(double visionDistancia) { this.visionDistancia = visionDistancia; }
    
    public String getTipoPicoEspecializado() { return tipoPicoEspecializado; }
    public void setTipoPicoEspecializado(String tipoPicoEspecializado) { this.tipoPicoEspecializado = tipoPicoEspecializado; }
    
    public int getFuerzaGarras() { return fuerzaGarras; }
    public void setFuerzaGarras(int fuerzaGarras) { this.fuerzaGarras = fuerzaGarras; }
    
    public double getCapacidadCargaKg() { return capacidadCargaKg; }
    public void setCapacidadCargaKg(double capacidadCargaKg) { this.capacidadCargaKg = capacidadCargaKg; }
    
    public double getEnvergaduraGarras() { return envergaduraGarras; }
    public void setEnvergaduraGarras(double envergaduraGarras) { this.envergaduraGarras = envergaduraGarras; }
}
// fin de la clase Aguila