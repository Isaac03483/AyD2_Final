package com.example.builder;

import com.example.validators.UserValidator;

public class ConcreteUserBuilder implements UserBuilder<ConcreteUserBuilder> {

    private String name;
    private String email;
    private String photo;
    private String phone;
    private String city;
    private String zip;


    @Override
    public ConcreteUserBuilder withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ConcreteUserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public ConcreteUserBuilder withPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public ConcreteUserBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public ConcreteUserBuilder withZip(String zip) {
        this.zip = zip;
        return this;
    }

    public String build() {
        UserValidator userValidator = new UserValidator(this);
        if(!userValidator.validateAll()) {
            // error
        }

        return "User created: " + this.name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoto() {
        return photo;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    


    
}
