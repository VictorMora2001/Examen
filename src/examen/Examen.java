/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author amigo
 */
public class Examen {

    private static String nombre;
    private static int cantidadUsuarios;
    private static Integer  tiempo;
    private static String nivel;
    private static int estrella;
    
public Examen(String nombre, int cantidadUsuarios, int tiempo, String nivel, int estrella){
    Examen.nombre = nombre;
    Examen.cantidadUsuarios = cantidadUsuarios;
    Examen.estrella = estrella;
    Examen.tiempo = tiempo;
    Examen.nivel = nivel;
}
public static int calidad(){
    return cantidadUsuarios*tiempo*estrella;
}
public static void main(String[] args){
    Examen miExamen = new Examen ("Meet", 5,30,"libre",50);
    System.out.println(calidad());
}
}
    

