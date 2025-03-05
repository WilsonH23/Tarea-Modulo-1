/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareamodulo1;

public class TareaModulo1 {
//Ejercicio 1: Saludo
    public static void main(String[] args) {
        System.out.println("Hola, Soy Wilson Hernandez!");
       
//Ejercicio 2: Operaciones Aritméticas
  int num1= 10, num2= 5;
  System.out.println("Suma:" +(num1 + num2));
  System.out.println("Resta:" +(num1 - num2));
  System.out.println("Multiplicacion:" +(num1 * num2));
  System.out.println("Division:" +(num1 / num2));
  System.out.println("Modulo:" +(num1 % num2));
  
  //Ejercicio 3: Operaciones Booleanas
  int M= 6, T = 1, K =-10;
  System.out.println("M > T:" +(M > T));
  System.out.println("T > K == -5:" +(T / K == -5));
  System.out.println("M +T == 7 || (M-T ==5 ):" +((M + T == 7) || (M - T == 5)));
  
  //Ejercicio 4: Arreglo de Nombres
  String [] nombres= {"Juan", "Ana", "Carlos", "Maria", "Luis", "Sofia", "Pedro","Lucia", "Daniel", "Laura"}; 
  System.out.println("Nombre de los compañeros:");
  for (String nombre: nombres) {
  System.out.println(nombre);
  }
  
  //Ejercicio 5: Arreglo Multidimensional
  String[][] datosPersonales = {
      {"Daniel", "Medina", "Electronica", "Taller Pizzaty"},
      {"Monica", "Lizzeth", "Computacion", "NASA"},
      {"Miguel", "Guzman", "Ingenieria", "Diunsa"},
      {"Ana", "Luisa", "Administracion", "Walmart"},
      {"Luis", "Hernandez", "Medicina", "Hospital Atlantida"},
  };
  System.out.println("Datos Personales: ");
  for (String[] persona: datosPersonales) {
  System.out.println("Nombre: " + persona[0] + ", Apellido: " + persona [1] + ", Carrera: " + persona[2] + ", Lugar de Trabajo: " + persona[3]);
  }
  
  //Ejercicio 6: Notas de Estudiantes
  String[] estudiantes =  {"Daniel", "Monica", "Juan", "Ana", "Luis"};
  int[] notas= {65, 89, 90, 76, 50};
  System.out.println("Notas de los Estudiantes: ");
  for (int i =0; i< estudiantes.length; i++){
   String estado = notas[i] >= 60 ? "Aprobado" : "Reprobado";
   System.out.println("Nombre: " + estudiantes[i] + ", Nota: " + notas[i] + ", Estado: " + estado);
  }
  
  //Ejercicio 7: Numeros pares del 2 al 100
   System.out.println("Numeros Pares del 2 al 100: ");
   for (int i=2; i<=100; i += 2){
       System.out.print(i + " ");
   }
  }
 }
