package org.example.pizzaexpress;

public enum CartaPizzas {

    BBQ(9),CARBONARA(8),JAMON_YORK(6),ATUN(7.5),HWAIANA(7),VEGGIE(10);

    private double precio;

    CartaPizzas(double precio) {

        this.precio = precio;

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



}
