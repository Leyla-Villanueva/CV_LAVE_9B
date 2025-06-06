package utez.edu.mx.cv_lave_b.controller;

public class User1Controller1 {
    // Atributo simple
    private String userName;

    // Constructor
    public User1Controller1(String userName) {
        this.userName = userName;
    }


    public void greetUser() {
        System.out.println("¡Hola, " + userName + "! Bienvenido al sistema.");
    }


    public void updateUserName(String newName) {
        this.userName = newName;
        System.out.println("El nombre se actualizó a: " + userName);
    }
}

