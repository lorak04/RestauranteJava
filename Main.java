package main;

import model.Cliente;
import model.Garcom;
import model.Prato;
import model.Pedido;
import repository.ClienteRepository;
import repository.GarcomRepository;
import repository.PratoRepository;
import repository.PedidoRepository;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       
        ClienteRepository clienteRepo = new ClienteRepository();
        GarcomRepository garcomRepo = new GarcomRepository();
        PratoRepository pratoRepo = new PratoRepository();
        PedidoRepository pedidoRepo = new PedidoRepository();

        
        Cliente cliente1 = new Cliente("João Silva", "12345678901", "(11) 98765-4321", "joao@email.com", "Rua A");
        Cliente cliente2 = new Cliente("Maria Oliveira", "23456789012", "(11) 91234-5678", "maria@email.com", "Rua B");

       
        clienteRepo.adicionarCliente(cliente1);
        clienteRepo.adicionarCliente(cliente2);

      
        Garcom garcom1 = new Garcom("Carlos", "001", "(11) 99888-7766", "carlos@email.com");
        Garcom garcom2 = new Garcom("Ana", "002", "(11) 97777-6655", "ana@email.com");

        
        garcomRepo.adicionarGarcom(garcom1);
        garcomRepo.adicionarGarcom(garcom2);

        
        Prato prato1 = new Prato("Feijoada", "Feijão preto com carne de porco", 30.0);
        Prato prato2 = new Prato("Pizza", "Pizza de queijo", 25.0);

        
        pratoRepo.adicionarPrato(prato1);
        pratoRepo.adicionarPrato(prato2);

       
        Pedido pedido1 = new Pedido(cliente1, garcom1, Arrays.asList(prato1, prato2), "Em preparo");

       
        pedidoRepo.adicionarPedido(pedido1);

        
        for (Pedido pedido : pedidoRepo.listarPedidos()) {
            System.out.println(pedido);
        }
    }
}
