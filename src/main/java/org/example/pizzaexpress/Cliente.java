package org.example.pizzaexpress;

import java.util.Arrays;
import java.util.Scanner;

public class Cliente extends PizzaExpress implements AccionesPedido{

    Scanner entrada = new Scanner(System.in);

    private String nombre;
    private int descuento;

    public Cliente (String nombre){

        this.nombre = nombre;
        this.descuento = 20;

    }

    public double pedir(){

        double cuenta = 0;

        System.out.println("¿Qué pizza te apetece tomar? " + this.nombre);

        System.out.println("========CARTA========");

        for(CartaPizzas c : CartaPizzas.values()) {
            System.out.println((c.name() + ": " + c.getPrecio() + "€."));
        }

        String pizza = entrada.next();

        for(CartaPizzas c : CartaPizzas.values()) {

            if(c.name().equals(pizza.toUpperCase())){

                System.out.println("El precio actual de la cuenta es de " + c.getPrecio() + "€.");
                cuenta = c.getPrecio();

            }
        }

        return cuenta;
    }

    public void pagar(){

        System.out.println(getNombre() + " realizando pago en caja...");

    }

    public void recoger(){

        System.out.println("Pedido recogido por " + getNombre() + ".");

    }

    @Override
    void obtenerDetalles() {

    }

    @Override
    public void cancelar(Pedido pedido) {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", descuento=" + descuento +
                '}';
    }

}
