package com.digitalinnovation.labpadroesprojetospring.service.impl;

import java.util.Optional;
import com.digitalinnovation.labpadroesprojetospring.model.Cliente;
import com.digitalinnovation.labpadroesprojetospring.model.ClienteRepository;
import com.digitalinnovation.labpadroesprojetospring.model.Endereco;
import com.digitalinnovation.labpadroesprojetospring.model.EnderecoRepository;
import com.digitalinnovation.labpadroesprojetospring.service.ClienteService;
import com.digitalinnovation.labpadroesprojetospring.service.ViaCepService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceimpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos()
    {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) 
    {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente)
    {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente)
    {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent())
        {
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id)
    {
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
       
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        
        clienteRepository.save(cliente);
    }
    
}
