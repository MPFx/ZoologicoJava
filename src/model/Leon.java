package model;

import enums.TipoHabitat;

/**
 * Clase que representa un león, un mamífero carnívoro.
 * Hereda de Mamifero y sobrescribe los métodos abstractos.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 */
public class Leon extends Mamifero {
    
    // ==================== ATRIBUTOS ESPECÍFICOS ====================
    
    /** Indica si es el líder de la manada (alfa) */
    private boolean esAlfa;
    
    /** Tamaño de la manada */
    private int tamanioManada;
    
    /** Color de la melena */
    private String colorMelena;
    
    /** Número de garras retráctiles */
    private int numeroGarras;
    
    /** Poder de mordida en PSI */
    private int poderMordidaPSI;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Leon.
     * 
     * @param nombre              Nombre
     * @param especie             Especie
     * @param edad                Edad
     * @param peso                Peso
     * @param altura              Altura
     * @param habitat             Hábitat
     * @param alimentacion        Alimentación
     * @param enPeligroExtincion  En peligro
     * @param tipoPelaje          Tipo de pelaje
     * @param tiempoGestacionDias Tiempo de gestación
     * @param numeroCrias         Número de crías
     * @param esDomestico         Doméstico
     * @param tipoDentadura       Tipo de dentadura
     * @param temperaturaCorporal Temperatura corporal
     * @param patronManchas       Patrón de manchas
     * @param velocidadMaxima     Velocidad máxima
     * @param esAlfa              Es líder
     * @param tamanioManada       Tamaño de manada
     * @param colorMelena         Color de melena
     * @param numeroGarras        Número de garras
     * @param poderMordidaPSI     Poder de mordida
     */
    public Leon(String nombre, String especie, int edad, double peso, double altura,
                TipoHabitat habitat, String alimentacion, boolean enPeligroExtincion,
                String tipoPelaje, int tiempoGestacionDias, int numeroCrias,
                boolean esDomestico, String tipoDentadura, int temperaturaCorporal,
                String patronManchas, double velocidadMaxima, boolean esAlfa,
                int tamanioManada, String colorMelena, int numeroGarras, int poderMordidaPSI) {
        super(nombre, especie, edad, peso, altura, habitat, alimentacion, enPeligroExtincion,
              tipoPelaje, tiempoGestacionDias, numeroCrias, esDomestico, tipoDentadura,
              temperaturaCorporal, patronManchas, velocidadMaxima);
        this.esAlfa = esAlfa;
        this.tamanioManada = tamanioManada;
        this.colorMelena = colorMelena;
        this.numeroGarras = numeroGarras;
        this.poderMordidaPSI = poderMordidaPSI;
    }
    
    
    // ==================== MÉTODOS SOBRESCRITOS ====================
    
    @Override
    public String hacerSonido() {
        return "¡Rugido fuerte y profundo! GRRRRRR";
    }
    
    @Override
    public String moverse() {
        if (getVelocidadMaxima() > 50) {
            return getNombre() + " corre rápidamente para cazar";
        }
        return getNombre() + " camina con sigilo por la sabana";
    }
    
    @Override
    public String alimentarse() {
        if (getAlimentacion().equals("Carnívoro")) {
            return getNombre() + " caza y devora ñus, cebras y otros herbívoros";
        }
        return getNombre() + " busca alimento en la sabana";
    }
    
    @Override
    public void amamantar() {
        System.out.println(getNombre() + " está amamantando a sus " + getNumeroCrias() + " crías");
    }
    
    /**
     * Rugido característico del león.
     */
    public void rugir() {
        System.out.println(getNombre() + " ruge fuertemente: ¡GRRRRRR!");
    }
    
    /**
     * Caza en manada.
     */
    public void cazarEnManada() {
        System.out.println(getNombre() + " organiza la caza con su manada de " + tamanioManada + " leones");
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public boolean isEsAlfa() { return esAlfa; }
    public void setEsAlfa(boolean esAlfa) { this.esAlfa = esAlfa; }
    
    public int getTamanioManada() { return tamanioManada; }
    public void setTamanioManada(int tamanioManada) { this.tamanioManada = tamanioManada; }
    
    public String getColorMelena() { return colorMelena; }
    public void setColorMelena(String colorMelena) { this.colorMelena = colorMelena; }
    
    public int getNumeroGarras() { return numeroGarras; }
    public void setNumeroGarras(int numeroGarras) { this.numeroGarras = numeroGarras; }
    
    public int getPoderMordidaPSI() { return poderMordidaPSI; }
    public void setPoderMordidaPSI(int poderMordidaPSI) { this.poderMordidaPSI = poderMordidaPSI; }
}
// fin de la clase Leon