package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

	
    private final String contraseña = "Hello World!";

    public App() {}
    
    public static void main(String[] args) {
        System.out.println(new App().getcontraseña());
    	
        
    }

    private final String getcontraseña() {
        return contraseña;
    }

}

