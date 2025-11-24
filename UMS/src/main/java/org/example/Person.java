package org.example;

import java.util.UUID;

public abstract class Person implements Identity {

    protected String id;
    protected String name;
    protected String email;

    public Person(String name, String email) {
        this.id = UUID.randomUUID().toString();  // auto-generated ID
        this.name = name;
        this.email = email;
    }

    @Override
    public String getID() {
        return id;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
