package service;

import model.Animal;
import enums.TipoHabitat;
import enums.EstadoSalud;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un hábitat dentro del zoológico.
 * Gestiona los animales que viven en él.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 */
public class Habitat {
    
    // ==================== ATRIBUTOS ====================
    
    /** Nombre del hábitat */
    private String nombreHabitat;
    
    /** Tipo de hábitat */
    private TipoHabitat tipo;
    
    /** Temperatura promedio en °C */
    private double temperaturaPromedio;
    
    /** Humedad relativa del ambiente (%) */
    private double humedad;
    
    /** Superficie en metros cuadrados */
    private double superficieMetros;
    
    /** Capacidad máxima de animales */
    private int capacidadMaxima;
    
    /** Lista de animales en el hábitat */
    private List<Animal> animales;
    
    /** Tipo de vegetación presente */
    private String vegetacion;
    
    /** Fuentes de agua disponibles */
    private String fuentesAgua;
    
    /** Indica si tiene zona de sombra */
    private boolean tieneZonaSombra;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Habitat.
     * 
     * @param nombreHabitat     Nombre del hábitat
     * @param tipo              Tipo de hábitat
     * @param temperaturaPromedio Temperatura promedio
     * @param humedad           Humedad
     * @param superficieMetros  Superficie en m²
     * @param capacidadMaxima   Capacidad máxima
     * @param vegetacion        Tipo de vegetación
     * @param fuentesAgua       Fuentes de agua
     * @param tieneZonaSombra   Tiene zona de sombra
     */
    public Habitat(String nombreHabitat, TipoHabitat tipo, double temperaturaPromedio,
                   double humedad, double superficieMetros, int capacidadMaxima,
                   String vegetacion, String fuentesAgua, boolean tieneZonaSombra) {
        this.nombreHabitat = nombreHabitat;
        this.tipo = tipo;
        this.temperaturaPromedio = temperaturaPromedio;
        this.humedad = humedad;
        this.superficieMetros = superficieMetros;
        this.capacidadMaxima = capacidadMaxima;
        this.vegetacion = vegetacion;
        this.fuentesAgua = fuentesAgua;
        this.tieneZonaSombra = tieneZonaSombra;
        this.animales = new ArrayList<>();
    }
    
    
    // ==================== MÉTODOS ====================
    
    /**
     * Agrega un animal al hábitat.
     * 
     * @param a Animal a agregar
     * @return true si fue agregado exitosamente
     */
    public boolean agregarAnimal(Animal a) {
        if (esCompatible(a) && hayEspacio()) {
            animales.add(a);
            System.out.println(a.getNombre() + " ha sido agregado a " + nombreHabitat);
            return true;
        }
        return false;
    }
    
    /**
     * Remueve un animal del hábitat.
     * 
     * @param a Animal a remover
     */
    public void removerAnimal(Animal a) {
        if (animales.remove(a)) {
            System.out.println(a.getNombre() + " ha sido removido de " + nombreHabitat);
        }
    }
    
    /**
     * Verifica si el animal es compatible con el hábitat.
     * 
     * @param a Animal a verificar
     * @return true si es compatible
     */
    public boolean esCompatible(Animal a) {
        return a.getHabitat() == this.tipo;
    }
    
    /**
     * Verifica si hay espacio disponible en el hábitat.
     * 
     * @return true si hay espacio
     */
    public boolean hayEspacio() {
        return animales.size() < capacidadMaxima;
    }
    
    /**
     * Obtiene la cantidad de animales en el hábitat.
     * 
     * @return Número de animales
     */
    public int getCantidadAnimales() {
        return animales.size();
    }
    
    /**
     * Obtiene los animales por estado de salud.
     * 
     * @param estado Estado de salud a filtrar
     * @return Lista de animales con ese estado
     */
    public List<Animal> getAnimalesPorSalud(EstadoSalud estado) {
        List<Animal> resultado = new ArrayList<>();
        for (Animal a : animales) {
            if (a.getEstadoSalud() == estado) {
                resultado.add(a);
            }
        }
        return resultado;
    }
    
    /**
     * Muestra información del hábitat.
     */
    public void mostrarInfo() {
        System.out.println("\n--- HÁBITAT: " + nombreHabitat + " ---");
        System.out.println("Tipo: " + tipo);
        System.out.printf("Temperatura: %.1f°C | Humedad: %.1f%%\n", temperaturaPromedio, humedad);
        System.out.printf("Superficie: %.0f m² | Capacidad: %d/%d\n", 
                         superficieMetros, animales.size(), capacidadMaxima);
        System.out.println("Vegetación: " + vegetacion);
        System.out.println("Agua: " + fuentesAgua);
        System.out.println("Sombra: " + (tieneZonaSombra ? "Sí" : "No"));
        System.out.println("Animales en el hábitat:");
        for (Animal a : animales) {
            System.out.printf("  - %s (%s) - Salud: %s\n", 
                             a.getNombre(), a.getEspecie(), a.getEstadoSalud());
        }
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public String getNombreHabitat() { return nombreHabitat; }
    public void setNombreHabitat(String nombreHabitat) { this.nombreHabitat = nombreHabitat; }
    
    public TipoHabitat getTipo() { return tipo; }
    public void setTipo(TipoHabitat tipo) { this.tipo = tipo; }
    
    public double getTemperaturaPromedio() { return temperaturaPromedio; }
    public void setTemperaturaPromedio(double temperaturaPromedio) { this.temperaturaPromedio = temperaturaPromedio; }
    
    public double getHumedad() { return humedad; }
    public void setHumedad(double humedad) { this.humedad = humedad; }
    
    public double getSuperficieMetros() { return superficieMetros; }
    public void setSuperficieMetros(double superficieMetros) { this.superficieMetros = superficieMetros; }
    
    public int getCapacidadMaxima() { return capacidadMaxima; }
    public void setCapacidadMaxima(int capacidadMaxima) { this.capacidadMaxima = capacidadMaxima; }
    
    public List<Animal> getAnimales() { return animales; }
    
    public String getVegetacion() { return vegetacion; }
    public void setVegetacion(String vegetacion) { this.vegetacion = vegetacion; }
    
    public String getFuentesAgua() { return fuentesAgua; }
    public void setFuentesAgua(String fuentesAgua) { this.fuentesAgua = fuentesAgua; }
    
    public boolean isTieneZonaSombra() { return tieneZonaSombra; }
    public void setTieneZonaSombra(boolean tieneZonaSombra) { this.tieneZonaSombra = tieneZonaSombra; }
}
// fin de la clase Habitat