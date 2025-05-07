package com.example.builder;

/**
 * Interface creada para obligar a las clases que la implementan
 * a implementar el método de los campos obligatorios.
 */
public interface UserBuilder<T> {
    
    T withName(String name);
    T withEmail(String email);

}
