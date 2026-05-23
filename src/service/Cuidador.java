package service;

import model.Animal;
import enums.EstadoSalud;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un cuidador del zoológico.
 * Es responsable de alimentar y cuidar a los animales.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 */
public class Cuidador {
    
    // ==================== ATRIBUTOS ====================
    
    /** Nombre del cuidador */
    private String nombre;
    
    /** ID del cuidador */
    private String idCuidador;
    
    /** Especialidad del cuidador */
    private String especialidad;
    
    /** Años de experiencia */
    private int experienciaAnos;
    
    /** Teléfono de contacto */
    private String telefono;
    
    /** Correo electrónico */
    private String email;
    
    /** Lista de animales a cargo */
    private List<Animal> animalesACargo;
    
    /** Horario de trabajo */
    private String horarioTrabajo;
    
    /** Nivel de certificación */
    private String nivelCertificacion;
    
    /** Indica si está capacitado para emergencias */
    private boolean capacitadoEmergencias;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Cuidador.
     * 
     * @param nombre               Nombre
     * @param idCuidador           ID
     * @param especialidad         Especialidad
     * @param experienciaAnos      Años de experiencia
     * @param telefono             Teléfono
     * @param email                Email
     * @param horarioTrabajo       Horario de trabajo
     * @param nivelCertificacion   Nivel de certificación
     * @param capacitadoEmergencias Capacitado para emergencias
     */
    public Cuidador(String nombre, String idCuidador, String especialidad,
                    int experienciaAnos, String telefono, String email,
                    String horarioTrabajo, String nivelCertificacion,
                    boolean capacitadoEmergencias) {
        this.nombre = nombre;
        this.idCuidador = idCuidador;
        this.especialidad = especialidad;
        this.experienciaAnos = experienciaAnos;
        this.telefono = telefono;
        this.email = email;
        this.horarioTrabajo = horarioTrabajo;
        this.nivelCertificacion = nivelCertificacion;
        this.capacitadoEmergencias = capacitadoEmergencias;
        this.animalesACargo = new ArrayList<>();
    }
    
    
    // ==================== MÉTODOS ====================
    
    /**
     * Asigna un animal al cuidador.
     * 
     * @param a Animal a asignar
     */
    public void asignarAnimal(Animal a) {
        animalesACargo.add(a);
        System.out.println(nombre + " ahora está a cargo de " + a.getNombre());
    }
    
    /**
     * Remueve un animal del cuidado del cuidador.
     * 
     * @param a Animal a remover
     */
    public void removerAnimal(Animal a) {
        if (animalesACargo.remove(a)) {
            System.out.println(nombre + " ya no está a cargo de " + a.getNombre());
        }
    }
    
    /**
     * Alimenta a un animal.
     * 
     * @param a Animal a alimentar
     */
    public void alimentarAnimal(Animal a) {
        if (animalesACargo.contains(a)) {
            System.out.println(nombre + " alimenta a " + a.getNombre() + 
                             " con " + a.getAlimentacion());
            a.alimentarse();
        }
    }
    
    /**
     * Atiende una emergencia con un animal.
     * 
     * @param a Animal que requiere atención
     */
    public void atenderEmergencia(Animal a) {
        if (capacitadoEmergencias && animalesACargo.contains(a)) {
            System.out.println(nombre + " atiende una emergencia con " + a.getNombre());
            a.recibirTratamiento();
        } else if (!capacitadoEmergencias) {
            System.out.println(nombre + " no está capacitado para emergencias");
        }
    }
    
    /**
     * Registra el estado de salud de un animal.
     * 
     * @param a      Animal a registrar
     * @param nuevoEstado Nuevo estado de salud
     */
    public void registrarEstado(Animal a, EstadoSalud nuevoEstado) {
        if (animalesACargo.contains(a)) {
            a.setEstadoSalud(nuevoEstado);
            System.out.println(nombre + " registra que " + a.getNombre() + 
                             " ahora está " + nuevoEstado);
        }
    }
    
    /**
     * Obtiene los animales que necesitan atención médica.
     * 
     * @return Lista de animales con estado ATENCION o CRITICO
     */
    public List<Animal> getAnimalesNecesitanAtencion() {
        List<Animal> necesitan = new ArrayList<>();
        for (Animal a : animalesACargo) {
            if (a.getEstadoSalud() == EstadoSalud.ATENCION || 
                a.getEstadoSalud() == EstadoSalud.CRITICO) {
                necesitan.add(a);
            }
        }
        return necesitan;
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getIdCuidador() { return idCuidador; }
    public void setIdCuidador(String idCuidador) { this.idCuidador = idCuidador; }
    
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    
    public int getExperienciaAnos() { return experienciaAnos; }
    public void setExperienciaAnos(int experienciaAnos) { this.experienciaAnos = experienciaAnos; }
    
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public List<Animal> getAnimalesACargo() { return animalesACargo; }
    
    public String getHorarioTrabajo() { return horarioTrabajo; }
    public void setHorarioTrabajo(String horarioTrabajo) { this.horarioTrabajo = horarioTrabajo; }
    
    public String getNivelCertificacion() { return nivelCertificacion; }
    public void setNivelCertificacion(String nivelCertificacion) { this.nivelCertificacion = nivelCertificacion; }
    
    public boolean isCapacitadoEmergencias() { return capacitadoEmergencias; }
    public void setCapacitadoEmergencias(boolean capacitadoEmergencias) { this.capacitadoEmergencias = capacitadoEmergencias; }
}
// fin de la clase Cuidador