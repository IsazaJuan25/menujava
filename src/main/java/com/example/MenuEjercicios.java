package com.example;

import java.util.Scanner;

public class MenuEjercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n----- MENÚ DE EJERCICIOS -----");
            System.out.println("1. Comparar dos números");
            System.out.println("2. Verificar si un número es par o impar");
            System.out.println("3. Determinar el estado del agua");
            System.out.println("4. Calcular descuento en compra");
            System.out.println("5. Verificar si un número es positivo/negativo/cero y par/impar");
            System.out.println("6. Convertir temperaturas");
            System.out.println("7. Calcular el IMC");
            System.out.println("8. Convertir minutos a horas y días");
            System.out.println("9. Convertir nota numérica a letra");
            System.out.println("10. Calculadora simple");
            System.out.println("11. Día de la semana");
            System.out.println("12. Clasificación por edad");
            System.out.println("13. Calculadora de préstamos");
            System.out.println("14. Verificador de año bisiesto");
            System.out.println("15. Descuento por antigüedad");
            System.out.println("16. Operador ternario");
            System.out.println("17. Operaciones con tres números");
            System.out.println("18. Verificador de múltiplos");
            System.out.println("19. Calculadora de notas finales");
            System.out.println("20. Clasificador de triángulos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 11:
                    ejercicio11();
                    break;
                case 12:
                    ejercicio12();
                    break;
                case 13:
                    ejercicio13();
                    break;
                case 14:
                    ejercicio14();
                    break;
                case 15:
                    ejercicio15();
                    break;
                case 16:
                    ejercicio16();
                    break;
                case 17:
                    ejercicio17();
                    break;
                case 18:
                    ejercicio18();
                    break;
                case 19:
                    ejercicio19();
                    break;
                case 20:
                    ejercicio20();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }

    // Ejercicio 1: Comparar dos números
    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println("El número " + num2 + " es mayor que " + num1);
        } else {
            System.out.println("Los números son iguales");
        }
    }

    // Ejercicio 2: Verificar si un número es par o impar
    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num1 = sc.nextInt();
        int num2 = num1 % 2;

        if (num2 == 0) {
            System.out.println("El número " + num1 + " es par y el residuo es " + num2);
        } else {
            System.out.println("El número " + num1 + " es impar y su residuo es " + num2);
        }
    }

    // Ejercicio 3: Determinar el estado del agua
    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura del agua:");
        String temp = sc.nextLine();
        double tempNum = Double.parseDouble(temp);

        if (tempNum <= 0) {
            System.out.println("Estado sólido");
        } else if (tempNum > 0 && tempNum < 100) {
            System.out.println("Estado líquido");
        } else {
            System.out.println("Estado gaseoso");
        }
    }

    // Ejercicio 4: Calcular descuento en compra
    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese precio del producto: ");
        double precio = sc.nextDouble();
        System.out.println("Ingrese cantidad de productos: ");
        int cantidad = sc.nextInt();
        double total = precio * cantidad;

        System.out.println("El total a pagar es: " + total);
        double descuento = 0;

        if (precio > 100){
            descuento = total * 0.10;
        } else if (precio > 50 && precio <= 100) {
            descuento = total * 0.05;
        } else if (precio > 0 && precio <= 50) {
            descuento = 0;
        }

        System.out.println("El descuento es: " + descuento);
        double totalPagar = total - descuento;
        System.out.println("El total a pagar con descuento es: " + totalPagar);
    }

    // Ejercicio 5: Verificar si un número es positivo/negativo/cero y par/impar
    public static void ejercicio5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        if (num1 > 0) {
            System.out.println("El número es positivo");
        } else if (num1 < 0) { 
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        if (num1 % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }

    // Ejercicio 6: Convertir temperaturas
    public static void ejercicio6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " °C equivale a " + fahrenheit + " °F.");

        System.out.print("Ingrese la temperatura en Fahrenheit: ");
        double fahrenheit2 = scanner.nextDouble();
        double celsius2 = (fahrenheit2 - 32) * 5 / 9;
        System.out.println(fahrenheit2 + " °F equivale a " + celsius2 + " °C.");
    }

    // Ejercicio 7: Calcular el IMC
    public static void ejercicio7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Su IMC es: " + imc);

        if (imc < 18.5) {
            System.out.println("Clasificación: Bajo peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Clasificación: Normal.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Clasificación: Sobrepeso.");
        } else {
            System.out.println("Clasificación: Obesidad.");
        }
    }

    // Ejercicio 8: Convertir minutos a horas y días
    public static void ejercicio8() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de minutos: ");
        int minutos = scanner.nextInt();

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        int dias = minutos / (24 * 60);
        int horasRestantes = (minutos % (24 * 60)) / 60;
        int minutosFinales = minutos % 60;

        System.out.println(minutos + " minutos equivalen a:");
        System.out.println(horas + " horas y " + minutosRestantes + " minutos.");
        System.out.println(dias + " días, " + horasRestantes + " horas y " + minutosFinales + " minutos.");
    }

    // Ejercicio 9: Convertir nota numérica a letra
    public static void ejercicio9() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la nota numérica (0-100): ");
        int nota = scanner.nextInt();

        if (nota >= 90 && nota <= 100) {
            System.out.println("La nota es: A");
        } else if (nota >= 80 && nota <= 89) {
            System.out.println("La nota es: B");
        } else if (nota >= 70 && nota <= 79) {
            System.out.println("La nota es: C");
        } else if (nota >= 60 && nota <= 69) {
            System.out.println("La nota es: D");
        } else if (nota >= 0 && nota <= 59) {
            System.out.println("La nota es: F");
        } else {
            System.out.println("Nota no válida. Ingrese un valor entre 0 y 100.");
        }
    }

    // Ejercicio 10: Calculadora simple
    public static void ejercicio10() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Operador no válido.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }

    // Ejercicio 11: Día de la semana
    public static void ejercicio11() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error: Número fuera de rango.");
                break;
        }
    }

    // Ejercicio 12: Clasificación por edad
    public static void ejercicio12() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        if (edad >= 0 && edad <= 2) {
            System.out.println("Bebé");
        } else if (edad >= 3 && edad <= 12) {
            System.out.println("Niño");
        } else if (edad >= 13 && edad <= 19) {
            System.out.println("Adolescente");
        } else if (edad >= 20 && edad <= 64) {
            System.out.println("Adulto");
        } else if (edad >= 65) {
            System.out.println("Adulto mayor");
        } else {
            System.out.println("Error: Edad no válida.");
        }
    }

    // Ejercicio 13: Calculadora de préstamos
    public static void ejercicio13() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del préstamo: ");
        double montoPrestamo = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
        double tasaAnual = scanner.nextDouble();

        System.out.print("Ingrese el número de años: ");
        int años = scanner.nextInt();

        double tasaMensual = (tasaAnual / 100) / 12;
        int numeroPagos = años * 12;

        double pagoMensual = (montoPrestamo * tasaMensual * Math.pow(1 + tasaMensual, numeroPagos)) 
                          / (Math.pow(1 + tasaMensual, numeroPagos) - 1);

        System.out.printf("El pago mensual es: %.2f%n", pagoMensual);
    }

    // Ejercicio 14: Verificador de año bisiesto
    public static void ejercicio14() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();

        boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

        if (esBisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }

    // Ejercicio 15: Descuento por antigüedad
    public static void ejercicio15() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        System.out.print("Ingrese los años de cliente: ");
        int añosCliente = scanner.nextInt();

        double descuento = 0;

        if (añosCliente >= 1 && añosCliente <= 2) {
            descuento = 0.05; // 5%
        } else if (añosCliente >= 3 && añosCliente <= 5) {
            descuento = 0.10; // 10%
        } else if (añosCliente > 5) {
            descuento = 0.15; // 15%
        }

        double montoConDescuento = montoCompra - (montoCompra * descuento);

        if (montoCompra > 500) {
            montoConDescuento -= montoCompra * 0.05; // Descuento adicional del 5%
        }

        System.out.printf("Monto final con descuento: %.2f%n", montoConDescuento);
    }

    // Ejercicio 16: Operador ternario
    public static void ejercicio16() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        String estado = edad >= 18 ? "mayor de edad" : "menor de edad";
        System.out.println("Estado: " + estado);

        String resultado = numero > 0 ? "positivo" : (numero < 0 ? "negativo" : "cero");
        System.out.println("Resultado: " + resultado);
    }

    // Ejercicio 17: Operaciones con tres números
    public static void ejercicio17() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        double suma = num1 + num2 + num3;
        double multiplicacion = num1 * num2 * num3;
        double promedio = suma / 3.0;

        System.out.println("Suma: " + suma);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("Promedio: " + promedio);

        if (promedio > suma) {
            System.out.println("El promedio es mayor que la suma.");
        } else {
            System.out.println("El promedio no es mayor que la suma.");
        }
    }

    // Ejercicio 18: Verificador de múltiplos
    public static void ejercicio18() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        boolean esMultiploDe2 = numero % 2 == 0;
        boolean esMultiploDe3 = numero % 3 == 0;
        boolean esMultiploDe5 = numero % 5 == 0;

        System.out.println("¿Es múltiplo de 2? " + esMultiploDe2);
        System.out.println("¿Es múltiplo de 3? " + esMultiploDe3);
        System.out.println("¿Es múltiplo de 5? " + esMultiploDe5);
    }

    // Ejercicio 19: Calculadora de notas finales
    public static void ejercicio19() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota de exámenes (40%): ");
        double examenes = scanner.nextDouble();

        System.out.print("Ingrese la nota de proyectos (30%): ");
        double proyectos = scanner.nextDouble();

        System.out.print("Ingrese la nota de tareas (20%): ");
        double tareas = scanner.nextDouble();

        System.out.print("Ingrese la nota de participación (10%): ");
        double participacion = scanner.nextDouble();

        double notaFinal = (examenes * 0.4) + (proyectos * 0.3) + (tareas * 0.2) + (participacion * 0.1);

        System.out.printf("La nota final del curso es: %.2f%n", notaFinal);
    }

    // Ejercicio 20: Clasificador de triángulos
    public static void ejercicio20() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del tercer lado: ");
        double lado3 = scanner.nextDouble();

        // Verifico si las longitudes pueden formar un triángulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Las longitudes pueden formar un triángulo.");

            // Clasifico el triángulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("Las longitudes no pueden formar un triángulo.");
        }
    }
}