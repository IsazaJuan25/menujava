package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Semana9Ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n=== MENÚ DE EJERCICIOS ===");
            System.out.println("1. Control de precios en tienda");
            System.out.println("2. Registro de horas trabajadores");
            System.out.println("3. Análisis de notas escolares");
            System.out.println("4. Simulación de retiro en cajero");
            System.out.println("5. Revisión de ventas diarias");
            System.out.println("6. Priorización de pacientes");
            System.out.println("7. Evaluación de productos");
            System.out.println("8. Horarios de transporte público");
            System.out.println("9. Clasificación de compras");
            System.out.println("10. Monitoreo de temperatura");
            System.out.println("0. Salir");
            System.out.print("Seleccione un ejercicio: ");
            opcion = sc.nextInt();
            
            switch(opcion) {
                case 1:
                    controlPrecios();
                    break;
                case 2:
                    registroHoras();
                    break;
                case 3:
                    analisisNotas();
                    break;
                case 4:
                    cajeroAutomatico();
                    break;
                case 5:
                    revisionVentas();
                    break;
                case 6:
                    priorizacionPacientes();
                    break;
                case 7:
                    evaluacionProductos();
                    break;
                case 8:
                    horariosTransporte();
                    break;
                case 9:
                    clasificacionCompras();
                    break;
                case 10:
                    monitoreoTemperatura();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion != 0);
        sc.close();
    }
    
    public static void controlPrecios() {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];
        double[] precios = new double[5];
        
        System.out.println("\n=== CONTROL DE PRECIOS ===");
        for(int i = 0; i < 5; i++) {
            System.out.print("Ingrese nombre producto " + (i+1) + ": ");
            nombres[i] = sc.next();
            System.out.print("Ingrese precio producto " + (i+1) + ": ");
            precios[i] = sc.nextDouble();
        }
        
        System.out.println("\nProductos > $50,000 COP:");
        for(int i = 0; i < 5; i++) {
            if(precios[i] > 50000) {
                System.out.println(nombres[i] + ": $" + precios[i]);
            }
        }
    }
    
    public static void registroHoras() {
        Scanner sc = new Scanner(System.in);
        double[][] horas = new double[3][5];
        
        System.out.println("\n=== REGISTRO DE HORAS ===");
        for(int i = 0; i < 3; i++) {
            System.out.println("\nTrabajador " + (i+1) + ":");
            for(int j = 0; j < 5; j++) {
                System.out.print("Horas día " + (j+1) + ": ");
                horas[i][j] = sc.nextDouble();
            }
        }
        
        System.out.println("\nTotal horas por trabajador:");
        for(int i = 0; i < 3; i++) {
            double total = 0;
            for(int j = 0; j < 5; j++) {
                total += horas[i][j];
            }
            System.out.println("Trabajador " + (i+1) + ": " + total + " horas");
        }
    }
    
    public static void analisisNotas() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        
        System.out.println("\n=== ANÁLISIS DE NOTAS ===");
        for(int i = 0; i < 10; i++) {
            System.out.print("Ingrese nota estudiante " + (i+1) + " (0-5): ");
            notas.add(sc.nextDouble());
        }
        
        double suma = 0;
        int aprobados = 0;
        for(double nota : notas) {
            suma += nota;
            if(nota >= 3.5) aprobados++;
        }
        
        System.out.println("\nPromedio: " + (suma/10));
        System.out.println("Estudiantes aprobados: " + aprobados);
    }
    
    public static void cajeroAutomatico() {
        Scanner sc = new Scanner(System.in);
        int[] billetes = {100000, 50000, 20000, 10000};
        
        System.out.println("\n=== CAJERO AUTOMÁTICO ===");
        System.out.print("Ingrese monto a retirar: ");
        int monto = sc.nextInt();
        
        System.out.println("\nBilletes a entregar:");
        for(int billete : billetes) {
            int cantidad = monto / billete;
            if(cantidad > 0) {
                System.out.println("$" + billete + ": " + cantidad);
                monto %= billete;
            }
        }
    }
    
    public static void revisionVentas() {
        Scanner sc = new Scanner(System.in);
        double[] ventas = new double[7];
        
        System.out.println("\n=== REVISIÓN DE VENTAS ===");
        for(int i = 0; i < 7; i++) {
            System.out.print("Ingrese ventas día " + (i+1) + ": $");
            ventas[i] = sc.nextDouble();
        }
        
        int diaMayor = 0, diaMenor = 0;
        for(int i = 1; i < 7; i++) {
            if(ventas[i] > ventas[diaMayor]) diaMayor = i;
            if(ventas[i] < ventas[diaMenor]) diaMenor = i;
        }
        
        System.out.println("\nMayor venta: Día " + (diaMayor+1) + " ($" + ventas[diaMayor] + ")");
        System.out.println("Menor venta: Día " + (diaMenor+1) + " ($" + ventas[diaMenor] + ")");
    }
    
    public static void priorizacionPacientes() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> prioridades = new ArrayList<>();
        
        System.out.println("\n=== PRIORIZACIÓN PACIENTES ===");
        for(int i = 0; i < 5; i++) {
            System.out.print("\nNombre paciente " + (i+1) + ": ");
            nombres.add(sc.next());
            System.out.print("Prioridad (1=alta, 2=media, 3=baja): ");
            prioridades.add(sc.nextInt());
        }
        
        System.out.println("\nPacientes por prioridad:");
        for(int p = 1; p <= 3; p++) {
            System.out.println("\nPrioridad " + p + ":");
            for(int i = 0; i < 5; i++) {
                if(prioridades.get(i) == p) {
                    System.out.println("- " + nombres.get(i));
                }
            }
        }
    }
    
    public static void evaluacionProductos() {
        Scanner sc = new Scanner(System.in);
        int[] productos = new int[50];
        
        System.out.println("\n=== EVALUACIÓN DE PRODUCTOS ===");
        for(int i = 0; i < 50; i++) {
            System.out.print("Producto " + (i+1) + " (1=bueno, 0=defectuoso): ");
            productos[i] = sc.nextInt();
        }
        
        int buenos = 0, defectuosos = 0;
        for(int estado : productos) {
            if(estado == 1) buenos++;
            else defectuosos++;
        }
        
        System.out.println("\nProductos buenos: " + buenos);
        System.out.println("Productos defectuosos: " + defectuosos);
        System.out.println("Porcentaje defectos: " + (defectuosos*100/50) + "%");
    }
    
    public static void horariosTransporte() {
        Scanner sc = new Scanner(System.in);
        double[] horarios = {7.00, 9.30, 12.00, 14.30, 17.00, 19.30};
        
        System.out.println("\n=== HORARIOS DE TRANSPORTE ===");
        System.out.print("Ingrese hora actual (ej. 8.30): ");
        double hora = sc.nextDouble();
        
        int proximo = -1;
        for(int i = 0; i < 6; i++) {
            if(horarios[i] > hora) {
                proximo = i;
                break;
            }
        }
        
        if(proximo != -1) {
            System.out.println("Próximo bus: " + horarios[proximo]);
        } else {
            System.out.println("No hay más buses hoy");
        }
    }
    
    public static void clasificacionCompras() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> compras = new ArrayList<>();
        
        System.out.println("\n=== CLASIFICACIÓN DE COMPRAS ===");
        for(int i = 0; i < 8; i++) {
            System.out.print("Monto compra cliente " + (i+1) + ": $");
            compras.add(sc.nextDouble());
        }
        
        int pequenos = 0, medianos = 0, grandes = 0;
        for(double monto : compras) {
            if(monto < 50000) pequenos++;
            else if(monto <= 100000) medianos++;
            else grandes++;
        }
        
        System.out.println("\nClientes pequeños: " + pequenos);
        System.out.println("Clientes medianos: " + medianos);
        System.out.println("Clientes grandes: " + grandes);
    }
    
    public static void monitoreoTemperatura() {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[12];
        
        System.out.println("\n=== MONITOREO DE TEMPERATURA ===");
        for(int i = 0; i < 12; i++) {
            System.out.print("Temperatura hora " + (i+1) + ": ");
            temperaturas[i] = sc.nextDouble();
        }
        
        int sobre35 = 0, bajo20 = 0;
        for(double temp : temperaturas) {
            if(temp > 35) sobre35++;
            else if(temp < 20) bajo20++;
        }
        
        System.out.println("\nTemperaturas >35°C: " + sobre35);
        System.out.println("Temperaturas <20°C: " + bajo20);
    }
}
