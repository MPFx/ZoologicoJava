package service;

import model.Animal;
import enums.EstadoSalud;
import enums.TipoAnimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el zoológico completo.
 * Gestiona hábitats, cuidadores y animales.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 */
public class Zoologico {
    
    // ==================== ATRIBUTOS ====================
    
    /** Nombre del zoológico */
    private String nombre;
    
    /** Ciudad donde se ubica */
    private String ciudad;
    
    /** Dirección del zoológico */
    private String direccion;
    
    /** Teléfono de contacto */
    private String telefono;
    
    /** Horario de atención */
    private String horarioAtencion;
    
    /** Presupuesto anual */
    private double presupuestoAnual;
    
    /** Lista de hábitats */
    private List<Habitat> habitats;
    
    /** Lista de cuidadores */
    private List<Cuidador> cuidadores;
    
    /** Número de visitantes anuales */
    private int visitantesAnuales;
    
    /** Precio de la entrada */
    private double precioEntrada;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Zoologico.
     * 
     * @param nombre           Nombre del zoológico
     * @param ciudad           Ciudad
     * @param direccion        Dirección
     * @param telefono         Teléfono
     * @param horarioAtencion  Horario de atención
     * @param presupuestoAnual Presupuesto anual
     * @param precioEntrada    Precio de entrada
     */
    public Zoologico(String nombre, String ciudad, String direccion, String telefono,
                     String horarioAtencion, double presupuestoAnual, double precioEntrada) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horarioAtencion = horarioAtencion;
        this.presupuestoAnual = presupuestoAnual;
        this.precioEntrada = precioEntrada;
        this.habitats = new ArrayList<>();
        this.cuidadores = new ArrayList<>();
        this.visitantesAnuales = 0;
    }
    
    
    // ==================== MÉTODOS ====================
    
    /**
     * Agrega un hábitat al zoológico.
     * 
     * @param h Hábitat a agregar
     */
    public void agregarHabitat(Habitat h) {
        habitats.add(h);
        System.out.println("Hábitat '" + h.getNombreHabitat() + "' agregado al zoológico");
    }
    
    /**
     * Contrata a un cuidador.
     * 
     * @param c Cuidador a contratar
     */
    public void contratarCuidador(Cuidador c) {
        cuidadores.add(c);
        System.out.println("Cuidador " + c.getNombre() + " contratado");
    }
    
    /**
     * Busca un animal por su nombre.
     * 
     * @param nombre Nombre del animal
     * @return Animal encontrado o null
     */
    public Animal buscarAnimal(String nombre) {
        for (Habitat h : habitats) {
            for (Animal a : h.getAnimales()) {
                if (a.getNombre().equalsIgnoreCase(nombre)) {
                    return a;
                }
            }
        }
        return null;
    }
    
    /**
     * Obtiene los animales por estado de salud.
     * 
     * @param estado Estado de salud deseado
     * @return Lista de animales
     */
    public List<Animal> getAnimalesPorEstado(EstadoSalud estado) {
        List<Animal> resultado = new ArrayList<>();
        for (Habitat h : habitats) {
            resultado.addAll(h.getAnimalesPorSalud(estado));
        }
        return resultado;
    }
    
    /**
     * Obtiene los animales por tipo.
     * 
     * @param tipo Tipo de animal
     * @return Lista de animales
     */
    public List<Animal> getAnimalesPorTipo(TipoAnimal tipo) {
        List<Animal> resultado = new ArrayList<>();
        for (Habitat h : habitats) {
            for (Animal a : h.getAnimales()) {
                if (a.getTipo() == tipo) {
                    resultado.add(a);
                }
            }
        }
        return resultado;
    }
    
    /**
     * Calcula los gastos mensuales del zoológico.
     * 
     * @return Gastos mensuales
     */
    public double calcularGastosMensuales() {
        // Gastos fijos: 10% del presupuesto anual
        return presupuestoAnual * 0.1;
    }
    
    /**
     * Calcula los ingresos estimados por visitantes.
     * 
     * @param visitantes Número de visitantes
     * @return Ingresos estimados
     */
    public double calcularIngresosEstimados(int visitantes) {
        return visitantes * precioEntrada;
    }
    
    /**
     * Registra visitantes al zoológico.
     * 
     * @param cantidad Cantidad de visitantes a registrar
     */
    public void registrarVisitantes(int cantidad) {
        this.visitantesAnuales += cantidad;
        System.out.println("Se registraron " + cantidad + " visitantes. Total anual: " + visitantesAnuales);
    }
    
    /**
     * Muestra el resumen del zoológico.
     */
    public void mostrarResumen() {
        System.out.println("\n=== ZOOLÓGICO " + nombre.toUpperCase() + " ===");
        System.out.println("Ubicación: " + ciudad + ", " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Horario: " + horarioAtencion);
        System.out.println("Hábitats: " + habitats.size());
        System.out.println("Cuidadores: " + cuidadores.size());
        
        int totalAnimales = 0;
        for (Habitat h : habitats) {
            totalAnimales += h.getCantidadAnimales();
        }
        System.out.println("Animales totales: " + totalAnimales);
        System.out.println("Visitantes anuales: " + visitantesAnuales);
        System.out.printf("Presupuesto anual: $%,.0f\n", presupuestoAnual);
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    
    public String getHorarioAtencion() { return horarioAtencion; }
    public void setHorarioAtencion(String horarioAtencion) { this.horarioAtencion = horarioAtencion; }
    
    public double getPresupuestoAnual() { return presupuestoAnual; }
    public void setPresupuestoAnual(double presupuestoAnual) { this.presupuestoAnual = presupuestoAnual; }
    
    public List<Habitat> getHabitats() { return habitats; }
    public List<Cuidador> getCuidadores() { return cuidadores; }
    
    public int getVisitantesAnuales() { return visitantesAnuales; }
    public void setVisitantesAnuales(int visitantesAnuales) { this.visitantesAnuales = visitantesAnuales; }
    
    public double getPrecioEntrada() { return precioEntrada; }
    public void setPrecioEntrada(double precioEntrada) { this.precioEntrada = precioEntrada; }
}
// fin de la clase Zoologico