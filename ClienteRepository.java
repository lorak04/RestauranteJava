package repository;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public void editarCliente(String cpf, String novoNome) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                cliente.setNome(novoNome);
            }
        }
    }

    public void excluirCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public boolean verificarCpfDuplicado(String cpf) {
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }
}
