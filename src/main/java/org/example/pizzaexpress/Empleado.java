package org.example.pizzaexpress;

public class Empleado extends PizzaExpress implements AccionesPedido{

    private String nombre;
    private String idEmpleado;
    private static int contador = 0;

    private static final String ID = "EMP";

    public Empleado(String nombre){

        contador++;

        this.nombre = nombre;
        this.idEmpleado = generarID();

    }

    public void siguienteEstado(Pedido pedido){

        for(Estado e : Estado.values()) {

            if(e.ordinal() == 1){
                continue;
            }

            if (e.ordinal() == 6){
                System.out.println(e.name() + "!!");
                break;
            }

            System.out.println(e.name() + "...");
            pedido.setEstadoPedido(Estado.valueOf(e.name()));
        }

    }

    public void entregarPedido(Pedido pedido){

        if(pedido.getEstadoPedido() != Estado.valueOf(pedido.getEstadoPedido().name())){

            throw new NoEntregar();

        }

        System.out.println("Entregando el pedido a " + pedido.getCliente().getNombre());

    }

    private String generarID() {
        return ID + String.format("%03d", contador);
    }

    @Override
    public void cancelar(Pedido pedido) {

    }

    @Override
    void obtenerDetalles() {

        System.out.println("El empleado " + getNombre() + " tiene ID = " + getIdEmpleado() + ".");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", idEmpleado='" + idEmpleado + '\'' +
                '}';
    }
}
