package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leerTeclado=new Scanner(System.in);

        String nombreCliente;
        String correoCliente;
        int precioHeladoSimple=5;
        int precioHeladoDoble=12;
        int precioHeladoEspecial=20;
        int cantidadHeladoSimple;
        int cantidadHeladoDoble;
        int cantidadHeladoEspecial;

        System.out.print("Cual es tu nombre: ");
        nombreCliente=leerTeclado.nextLine();

        System.out.print("Cual es tu correo: ");
        correoCliente=leerTeclado.nextLine();

        System.out.print("Ingrese la cantidad de helados simples que desea, cada uno cuesta 5 DOLARES: ");
        cantidadHeladoSimple = leerTeclado.nextInt();

        System.out.print("Ingrese la cantidad de helados dobles que desea, cada uno cuetsa 12 DOLARES: ");
        cantidadHeladoDoble = leerTeclado.nextInt();

        System.out.print("Ingrese la cantidad de helados especiales que desea, cada uno cuesta 20 DOLARES: ");
        cantidadHeladoEspecial = leerTeclado.nextInt();

        int totalVentasSimples = cantidadHeladoSimple*precioHeladoSimple;
        int totalVentasDobles = cantidadHeladoDoble*precioHeladoDoble;
        int totalVentasEspeciales = cantidadHeladoEspecial*precioHeladoEspecial;


        int totalVentasDia = totalVentasSimples+totalVentasDobles+totalVentasEspeciales;

        System.out.println("Gracias or tu compra "+nombreCliente+ " te enviaremos la factura a este correo electronico: "+correoCliente);

        System.out.println("El total de ventas simples fueron de: "+totalVentasSimples+ " dolares");
        System.out.println("El total de ventas dobles fueron de: "+totalVentasDobles+ " dolares");
        System.out.println("El total de ventas especiales fueron de: "+totalVentasDobles+ " dolares");
        System.out.println("Las ventas totales fueron de: "+totalVentasDia+ " dolares");



















    }
}