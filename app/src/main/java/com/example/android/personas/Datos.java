package com.example.android.personas;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by android on 30/09/2017.
 */

public class Datos {
    private static ArrayList<Persona> personas = new ArrayList();

    public static void guardarPersonas(Persona p){
        personas.add(p);
    }
    public static ArrayList<Persona> getPersonas(){
        return personas;
    }
}
