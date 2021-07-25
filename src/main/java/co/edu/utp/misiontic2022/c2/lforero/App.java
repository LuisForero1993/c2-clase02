package co.edu.utp.misiontic2022.c2.lforero;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        /*
        System.out.println("Hello World!");
        var nombre = "Luis Forero";
        System.out.println(saludo(nombre));
        */
        /////////////////////////////////////////////////////////////////////////////////
        /*
        var sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        var numero = sc.nextInt();
        var digitos = numeroDigitos(numero);
        System.out.println("El número tiene " + digitos + " cifras ");
        sc.close();
        */
        /////////////////////////////////////////////////////////////////////////////////
        /*
        var entrada = JOptionPane.showInputDialog(null, "Por favor ingrese el número ");
        var numero = Integer.parseInt(entrada);
        JOptionPane.showMessageDialog(null, String.format("El número tiene %d cifras\n", numeroDigitos(numero)));
        */
        System.out.println(numeroSuerte("12/07/1980"));
        System.out.println(numeroSuerte("29/05/1980"));
        System.out.println(numeroSuerte("29/11/1993"));


    }

    public static String saludo(String nombre) {
        return "Hola " + nombre + "!";
    }

    public static int numeroDigitos(int numero){
        var cifras = 0;
         while (numero != 0){
             numero /= 10;
             cifras++;
         }
        return cifras;    
    }

    public static int numeroSuerte(String fechaNacimiento){ // dd/mm/aaaa -> 12/07/1998
        var indiceSeparador = fechaNacimiento.indexOf("/");
        var dia = Integer.parseInt(fechaNacimiento.substring(0, indiceSeparador));
        var indiceSeparadorMes = fechaNacimiento.indexOf("/", ++indiceSeparador);
        var mes = Integer.parseInt(fechaNacimiento.substring(indiceSeparador, indiceSeparadorMes++));
        var ano = Integer.parseInt(fechaNacimiento.substring(indiceSeparadorMes));
        /*
        var datos = fechaNacimiento.split("/");

        dia = datos[0];
        mes = datos[1];
        ano = datos[2];
        */
        var suma = ano + mes + dia;
        var resultado = 0;
        while (suma != 0){
            resultado += suma%10;
            suma /= 10;
        }



        return resultado;
    }

}
