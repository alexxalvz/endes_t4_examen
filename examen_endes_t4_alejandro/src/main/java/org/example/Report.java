package org.example;

public class Report {
    void printReport() {
        String titulo ="el vacio";
        String conclusion="Es muy frio";
        // imprimir título
        System.out.println("Título del Reporte");
        System.out.printf(titulo);
        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...

        // imprimir conclusión
        System.out.println("Conclusión del Reporte");
        System.out.println(conclusion);

    }
}
