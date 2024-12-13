package model;

import java.util.List;

public class Pedido {
    private Cliente cliente;
    private Garcom garcom;
    private List<Prato> pratos;
    private String status;  

    public Pedido(Cliente cliente, Garcom garcom, List<Prato> pratos, String status) {
        this.cliente = cliente;
        this.garcom = garcom;
        this.pratos = pratos;
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente.getNome() + ", garcom=" + garcom.getNome() + ", pratos=" + pratos + ", status=" + status + "]";
    }
}
