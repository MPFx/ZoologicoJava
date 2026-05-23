package util;

import model.Animal;
import enums.EstadoSalud;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un veterinario del zoológico.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 */
public class Veterinario {
    
    // ==================== ATRIBUTOS ====================
    
    /** Nombre del veterinario */
    private String nombre;
    
    /** ID del veterinario */
    private String idVeterinario;
    
    /** Especialidad médica */
    private String especialidad;
    
    /** Años de experiencia */
    private int anosExperiencia;
    
    /** Universidad de egreso */
    private String universidad;
    
    /** Teléfono de emergencia */
    private String telefonoEmergencia;
    
    /** Tratamientos aplicados */
    private List<String> tratamientosAplicados;
    
    /** Número de animales atendidos */
    private int animalesAtendidos;
    
    /** Horario de disponibilidad */
    private String horarioDisponibilidad;
    
    /** Indica si está disponible para emergencias */
    private boolean disponibleEmergencias;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Veterinario.
     * 
     * @param nombre               Nombre
     * @param idVeterinario        ID
     * @param especialidad         Especialidad
     * @param anosExperiencia      Años de experiencia
     * @param universidad          Universidad
     * @param telefonoEmergencia   Teléfono de emergencia
     * @param horarioDisponibilidad Horario de disponibilidad
     * @param disponibleEmergencias Disponible para emergencias
     */
    public Veterinario(String nombre, String idVeterinario, String especialidad,
                       int anosExperiencia, String universidad, String telefonoEmergencia,
                       String horarioDisponibilidad, boolean disponibleEmergencias) {
        this.nombre = nombre;
        this.idVeterinario = idVeterinario;
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
        this.universidad = universidad;
        this.telefonoEmergencia = telefonoEmergencia;
        this.horarioDisponibilidad = horarioDisponibilidad;
        this.disponibleEmergencias = disponibleEmergencias;
        this.tratamientosAplicados = new ArrayList<>();
        this.animalesAtendidos = 0;
    }
    
    
    // ==================== MÉTODOS ====================
    
    /**
     * Realiza un chequeo médico a un animal.
     * 
     * @param a Animal a chequear
     */
    public void realizarChequeo(Animal a) {
        System.out.println(nombre + " está realizando un chequeo a " + a.getNombre());
        a.actualizarSalud();
        animalesAtendidos++;
        
        if (a.getEstadoSalud() != EstadoSalud.SALUDABLE) {
            System.out.println("Se detectaron problemas de salud en " + a.getNombre());
        } else {
            System.out.println(a.getNombre() + " está saludable");
        }
    }
    
    /**
     * Aplica un tratamiento a un animal.
     * 
     * @param a          Animal a tratar
     * @param tratamiento Nombre del tratamiento
     */
    public void aplicarTratamiento(Animal a, String tratamiento) {
        System.out.println(nombre + " aplica '" + tratamiento + "' a " + a.getNombre());
        tratamientosAplicados.add(tratamiento + " - " + a.getNombre());
        a.recibirTratamiento();
        animalesAtendidos++;
    }
    
    /**
     * Vacuna a un animal.
     * 
     * @param a       Animal a vacunar
     * @param vacuna  Nombre de la vacuna
     */
    public void vacunar(Animal a, String vacuna) {
        System.out.println(nombre + " vacuna a " + a.getNombre() + " contra " + vacuna);
        tratamientosAplicados.add("Vacuna: " + vacuna + " - " + a.getNombre());
        animalesAtendidos++;
    }
    
    /**
     * Diagnostica un animal basado en síntomas.
     * 
     * @param a       Animal a diagnosticar
     * @param sintomas Síntomas del animal
     */
    public void diagnosticar(Animal a, String sintomas) {
        System.out.println(nombre + " diagnostica a " + a.getNombre());
        System.out.println("Síntomas: " + sintomas);
        
        if (sintomas.toLowerCase().contains("fiebre") || 
            sintomas.toLowerCase().contains("debilidad")) {
            a.setEstadoSalud(EstadoSalud.ATENCION);
            System.out.println("Diagnóstico: Animal necesita atención médica");
        } else {
            System.out.println("Diagnóstico: Sin problemas graves detectados");
        }
        animalesAtendidos++;
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getIdVeterinario() { return idVeterinario; }
    public void setIdVeterinario(String idVeterinario) { this.idVeterinario = idVeterinario; }
    
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    
    public int getAnosExperiencia() { return anosExperiencia; }
    public void setAnosExperiencia(int anosExperiencia) { this.anosExperiencia = anosExperiencia; }
    
    public String getUniversidad() { return universidad; }
    public void setUniversidad(String universidad) { this.universidad = universidad; }
    
    public String getTelefonoEmergencia() { return telefonoEmergencia; }
    public void setTelefonoEmergencia(String telefonoEmergencia) { this.telefonoEmergencia = telefonoEmergencia; }
    
    public List<String> getTratamientosAplicados() { return tratamientosAplicados; }
    
    public int getAnimalesAtendidos() { return animalesAtendidos; }
    public void setAnimalesAtendidos(int animalesAtendidos) { this.animalesAtendidos = animalesAtendidos; }
    
    public String getHorarioDisponibilidad() { return horarioDisponibilidad; }
    public void setHorarioDisponibilidad(String horarioDisponibilidad) { this.horarioDisponibilidad = horarioDisponibilidad; }
    
    public boolean isDisponibleEmergencias() { return disponibleEmergencias; }
    public void setDisponibleEmergencias(boolean disponibleEmergencias) { this.disponibleEmergencias = disponibleEmergencias; }
}
// fin de la clase Veterinario