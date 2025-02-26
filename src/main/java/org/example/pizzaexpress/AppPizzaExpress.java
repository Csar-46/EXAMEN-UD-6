package org.example.pizzaexpress;

import java.util.Scanner;

public class AppPizzaExpress {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //crear 2 empleados e imprimir info obtenerDetalles()

        Empleado emp1 = new Empleado("Juan");
        Empleado emp2 = new Empleado("Maria");

        System.out.println("*** BIEVENIDO A PIZZAEXPRESS ***");
        emp1.obtenerDetalles();
        emp2.obtenerDetalles();
        System.out.println();

        //iniciar pedido preguntando nombre

        System.out.println("¿Para quien es el medido?");

        //responder un nombre

        String nombre = entrada.next();

        //crear new Cliente con dicho nombre

        Cliente deivid = new Cliente(nombre);

        //crear new Pedido para el Cliente creado y estado = CREANDO

        Pedido ped1 = new Pedido(deivid, Estado.CREANDO);

        //pedir() preguntar qué le apetece hoy al Cliente y mostrar carta
        //de pizzas

        double cuenta = deivid.pedir();

        //elegir pizza – si existe en la carta, añadir al ArrayList del
        //pedido. Si no, saltará como inválido por no estar incluida enum
                //decir precio acumulado del pedido y preguntar si se quieren
       // añadir más pizzas al pedido (S/N)
        //N
        //modificar estado del Pedido a RECIBIDO

        ped1.setEstadoPedido(Estado.RECIBIDO);

        //mostrar "Pedido RECIBIDO" (Estado). Total pedido: importe.

        System.out.println("Pedido " + ped1.getEstadoPedido() + ". Total del pedido: " + cuenta);

        //Descuento a aplicar: 20%. Total a pagar: importe-descuento

        ped1.aplicarDescuento(cuenta);

        //mostrar "Pasa por caja para pagar y recoger tu pedido cuando esté
        //LISTO. Muchas gracias nombre"

        System.out.println("Pasa por caja para pagar y recoger tu pedido cuando esté " + Estado.LISTO + ". Muchas gracias " + deivid.getNombre() + ".");

        //avanzar estado a MONTANDO_PIZZA e imprimir

        emp1.siguienteEstado(ped1);

        //pagar() Pedido

        deivid.pagar();

        //entregar() Pedido

        emp1.entregarPedido(ped1);

        //recoger()

        deivid.recoger();


    }

}
