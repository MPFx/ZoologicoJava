package util;

import model.Animal;
import service.Habitat;
import java.time.LocalTime;
import java.util.List;

/**
 * Clase utilitaria para gestionar la alimentación de los animales.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 */
public class Alimentador {
    
    // ==================== CONSTANTES ====================
    
    /** Ración base para alimentación (kg) */
    private static final double RACION_BASE = 1.0;
    
    
    // ==================== ATRIBUTOS ====================
    
    private String horarioAlimentacion;
    private int comidasPorDia;
    private double presupuestoComida;
    private String ultimaAlimentacion;
    private List<String> alimentosDisponibles;
    private int totalAnimalesAlimentados;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Alimentador.
     * 
     * @param horarioAlimentacion Horario de alimentación
     * @param comidasPorDia       Número de comidas por día
     * @param presupuestoComida   Presupuesto para comida
     */
    public Alimentador(String horarioAlimentacion, int comidasPorDia, double presupuestoComida) {
        this.horarioAlimentacion = horarioAlimentacion;
        this.comidasPorDia = comidasPorDia;
        this.presupuestoComida = presupuestoComida;
        this.ultimaAlimentacion = "";
        this.totalAnimalesAlimentados = 0;
    }
    
    
    // ==================== MÉTODOS ESTÁTICOS ====================
    
    /**
     * Alimenta a un animal específico.
     * 
     * @param a Animal a alimentar
     */
    public static void alimentarAnimal(Animal a) {
        System.out.println("Alimentando a " + a.getNombre() + " con " + a.getAlimentacion());
        double racion = calcularRacionDiaria(a);
        System.out.println("Ración: " + racion + " kg de alimento");
        a.alimentarse();
    }
    
    /**
     * Alimenta a todos los animales de un hábitat.
     * 
     * @param h Hábitat a alimentar
     */
    public static void alimentarHabitat(Habitat h) {
        System.out.println("\n--- ALIMENTANDO HÁBITAT: " + h.getNombreHabitat() + " ---");
        for (Animal a : h.getAnimales()) {
            alimentarAnimal(a);
        }
    }
    
    /**
     * Programa la alimentación para una lista de animales.
     * 
     * @param animales Lista de animales
     * @param hora     Hora programada
     */
    public static void programarAlimentacion(List<Animal> animales, LocalTime hora) {
        System.out.println("\n--- PROGRAMACIÓN DE ALIMENTACIÓN ---");
        System.out.println("Hora: " + hora);
        System.out.println("Animales a alimentar: " + animales.size());
        for (Animal a : animales) {
            System.out.println("  - " + a.getNombre() + " (" + a.getEspecie() + ")");
        }
    }
    
    /**
     * Calcula la ración diaria para un animal.
     * 
     * @param a Animal
     * @return Ración en kg
     */
    public static double calcularRacionDiaria(Animal a) {
        // Ración base más ajuste por peso
        double racion = RACION_BASE + (a.getPeso() / 100.0);
        return Math.min(racion, 10.0); // Máximo 10 kg
    }
    
    
    // ==================== MÉTODOS DE INSTANCIA ====================
    
    /**
     * Asigna una ración específica a un animal.
     * 
     * @param a        Animal
     * @param cantidad Cantidad en kg
     */
    public void asignarRacion(Animal a, double cantidad) {
        System.out.println("Asignando " + cantidad + " kg de comida a " + a.getNombre());
    }
    
    /**
     * Registra una alimentación realizada.
     * 
     * @param a Animal alimentado
     */
    public void registrarAlimentacion(Animal a) {
        this.ultimaAlimentacion = a.getNombre() + " alimentado a las " + LocalTime.now();
        this.totalAnimalesAlimentados++;
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public String getHorarioAlimentacion() { return horarioAlimentacion; }
    public void setHorarioAlimentacion(String horarioAlimentacion) { this.horarioAlimentacion = horarioAlimentacion; }
    
    public int getComidasPorDia() { return comidasPorDia; }
    public void setComidasPorDia(int comidasPorDia) { this.comidasPorDia = comidasPorDia; }
    
    public double getPresupuestoComida() { return presupuestoComida; }
    public void setPresupuestoComida(double presupuestoComida) { this.presupuestoComida = presupuestoComida; }
    
    public String getUltimaAlimentacion() { return ultimaAlimentacion; }
    
    public List<String> getAlimentosDisponibles() { return alimentosDisponibles; }
    public void setAlimentosDisponibles(List<String> alimentosDisponibles) { this.alimentosDisponibles = alimentosDisponibles; }
    
    public int getTotalAnimalesAlimentados() { return totalAnimalesAlimentados; }
}
// fin de la clase Alimentador