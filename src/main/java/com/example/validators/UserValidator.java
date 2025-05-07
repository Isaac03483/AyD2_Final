package com.example.validators;

import com.example.builder.ConcreteUserBuilder;

/**
 * Clase creada para abstraer la lógica de validación.
 */
public class UserValidator {
    
    private ConcreteUserBuilder concreteUserBuilder;

    public UserValidator(ConcreteUserBuilder concreteUserBuilder) {
        this.concreteUserBuilder = concreteUserBuilder;
    }

    private boolean validateName() {
        return this.concreteUserBuilder.getName() != null && !this.concreteUserBuilder.getName().isEmpty();
    }

    private boolean validateEmail() {
        return this.concreteUserBuilder.getEmail() != null && !this.concreteUserBuilder.getEmail().contains("@");
    }

    // more validations

    public boolean validateAll() {
        return validateName() &&
                validateEmail();
    }
}
