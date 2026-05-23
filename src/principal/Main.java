package principal;

import model.*;
import service.*;
import util.*;
import enums.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal del Zoológico con Hábitats.
 * Demuestra el uso de herencia y polimorfismo con diferentes tipos de animales.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 */
public class Main {
    
    /**
     * Método principal que ejecuta la demostración del sistema.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("ZOOLÓGICO CON HÁBITATS - DEMOSTRACIÓN");
        System.out.println("=".repeat(60));
        
        // ========== CREAR ZOOLÓGICO ==========
        System.out.println("\n1. CREANDO ZOOLÓGICO...");
        Zoologico zoologico = new Zoologico(
            "Zoológico Metropolitano",
            "Santiago",
            "Av. Las Palmeras 1234",
            "+56212345678",
            "Lun-Dom 09:00-18:00",
            50000000,
            8000
        );
        
        // ========== CREAR ANIMALES CON POLIMORFISMO ==========
        System.out.println("\n2. CREANDO ANIMALES DE DIFERENTES TIPOS...");
        
        List<Animal> animales = new ArrayList<>();
        
        // Polimorfismo: variable de tipo Animal, objeto de clase concreta
        Animal leon = new Leon("Simba", "Panthera leo", 5, 190.0, 1.2,
                               TipoHabitat.SABANA, "Carnívoro", true,
                               "Corto", 110, 4, false, "Caninos", 38,
                               "Manchas", 80.0, true, 8, "Oscura", 18, 650);
        
        Animal aguila = new Aguila("Aguila Real", "Aquila chrysaetos", 8, 5.0, 0.8,
                                   TipoHabitat.JUNGLA, "Carnívoro", true,
                                   2.2, true, "Ganchudo", "Marrón", 120.0,
                                   "Migratorio", 2, 45, 3000.0, "Acantilado",
                                   5000.0, "Ganchudo", 1200, 2.5, 0.08);
        
        Animal serpiente = new Serpiente("Cobra Real", "Ophiophagus hannah", 6, 6.0, 0.2,
                                         TipoHabitat.JUNGLA, "Carnívoro", false,
                                         true, "Quilladas", "Neurotóxico", 28.0,
                                         false, 20, "Oviparo", 30, 5.5, "Moteada",
                                         4.5, 0.08, 12.0, "Veneno", 20.0);
        
        animales.add(leon);
        animales.add(aguila);
        animales.add(serpiente);
        
        // ========== DEMOSTRACIÓN DE POLIMORFISMO ==========
        System.out.println("\n3. DEMOSTRACIÓN DE POLIMORFISMO:");
        System.out.println("   (Recorriendo lista de Animales y llamando a métodos polimórficos)");
        System.out.println("-".repeat(60));
        
        for (Animal a : animales) {
            System.out.printf("Animal: %-12s | Especie: %-15s | Sonido: %s\n",
                a.getNombre(), a.getEspecie(), a.hacerSonido());
            System.out.printf("        Movimiento: %s\n", a.moverse());
            System.out.printf("        Alimentación: %s\n", a.alimentarse());
            System.out.println("-".repeat(40));
        }
        
        // ========== CREAR HÁBITATS ==========
        System.out.println("\n4. CREANDO HÁBITATS...");
        Habitat sabana = new Habitat("Sabana Africana", TipoHabitat.SABANA,
                                      28.0, 40.0, 5000.0, 20,
                                      "Pastizales, Acacias",
                                      "Ríos, Lagos", true);
        
        Habitat jungla = new Habitat("Jungla Tropical", TipoHabitat.JUNGLA,
                                     26.0, 85.0, 8000.0, 25,
                                     "Vegetación densa, Árboles altos",
                                     "Ríos, Cascadas", true);
        
        zoologico.agregarHabitat(sabana);
        zoologico.agregarHabitat(jungla);
        
        // Agregar animales a hábitats
        sabana.agregarAnimal(leon);
        jungla.agregarAnimal(aguila);
        jungla.agregarAnimal(serpiente);
        
        // ========== CREAR CUIDADORES ==========
        System.out.println("\n5. CONTRATANDO CUIDADORES...");
        Cuidador cuidador1 = new Cuidador("Juan Pérez", "C001",
                                         "Mamíferos", 10, "+56912345678",
                                         "juan@zoologico.cl", "Lun-Vie 08:00-17:00",
                                         "Avanzado", true);
        
        Cuidador cuidador2 = new Cuidador("María González", "C002",
                                         "Aves y Reptiles", 8, "+56987654321",
                                         "maria@zoologico.cl", "Mar-Dom 09:00-18:00",
                                         "Intermedio", true);
        
        zoologico.contratarCuidador(cuidador1);
        zoologico.contratarCuidador(cuidador2);
        
        // Asignar animales a cuidadores
        cuidador1.asignarAnimal(leon);
        cuidador2.asignarAnimal(aguila);
        cuidador2.asignarAnimal(serpiente);
        
        // ========== ALIMENTACIÓN ==========
        System.out.println("\n6. PROCESO DE ALIMENTACIÓN...");
        Alimentador alimentador = new Alimentador("10:00 - 16:00", 2, 1000000);
        Alimentador.alimentarHabitat(sabana);
        Alimentador.alimentarHabitat(jungla);
        
        // ========== ATENCIÓN VETERINARIA ==========
        System.out.println("\n7. ATENCIÓN VETERINARIA...");
        Veterinario veterinario = new Veterinario("Dra. Ana López", "V001",
                                                 "Animales Exóticos", 15,
                                                 "Universidad de Chile",
                                                 "+56912345678",
                                                 "Lun-Vie 09:00-17:00", true);
        
        veterinario.realizarChequeo(leon);
        veterinario.realizarChequeo(aguila);
        
        // ========== MOSTRAR INFORMACIÓN DE HÁBITATS ==========
        System.out.println("\n8. INFORMACIÓN DE HÁBITATS...");
        sabana.mostrarInfo();
        jungla.mostrarInfo();
        
        // ========== REGISTRAR VISITANTES ==========
        System.out.println("\n9. REGISTRO DE VISITANTES...");
        zoologico.registrarVisitantes(1500);
        zoologico.registrarVisitantes(2000);
        
        // ========== RESUMEN DEL ZOOLÓGICO ==========
        System.out.println("\n10. RESUMEN DEL ZOOLÓGICO...");
        zoologico.mostrarResumen();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("DEMOSTRACIÓN DE HERENCIA Y POLIMORFISMO COMPLETADA");
        System.out.println("=".repeat(60));
    }
}
// fin de la clase Main