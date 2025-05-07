package com.example.shapes;

/**
 * Interfaz creada para abstraer la lógica de cálculo de área
 * así evitamos que nuestro método calculateArea crezca conforme
 * necesiten más figuras y utilizamos el polimorfismo para obtener
 * los cálculos en base a la figura.
 */
public interface Shape {
    
    double calculateArea();
}
