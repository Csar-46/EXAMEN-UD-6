package org.example.pizzaexpress;

import java.util.ArrayList;

public class Pedido extends PizzaExpress {

    private Cliente cliente;
    private ArrayList<CartaPizzas> listaPizzas;
    private Estado estadoPedido;

    private static final double DESCUENTO = 0.2;

    public Pedido (Cliente cliente, Estado estadoPedido ){

        this.cliente = cliente;
        listaPizzas = new ArrayList<>();
        this.estadoPedido = estadoPedido;

    }

    public void aplicarDescuento(double cuenta){

        System.out.println("Descuento a aplicar: " + cliente.getDescuento() + "%. Total de importe a pagar: " + (cuenta-(cuenta * DESCUENTO)) + "€.");

    }

    @Override
    void obtenerDetalles() {



    }

    public Estado getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(Estado estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public ArrayList<CartaPizzas> getListaPizzas() {
        return listaPizzas;
    }

    public void setListaPizzas(ArrayList<CartaPizzas> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", listaPizzas=" + listaPizzas +
                ", estadoPedido=" + estadoPedido +
                '}';
    }
}
