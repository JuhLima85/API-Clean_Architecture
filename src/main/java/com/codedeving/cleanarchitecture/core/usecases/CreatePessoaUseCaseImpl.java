package com.codedeving.cleanarchitecture.core.usecases;

import com.codedeving.cleanarchitecture.core.entities.Pessoa;
import com.codedeving.cleanarchitecture.core.exceptions.BusinessException;
import com.codedeving.cleanarchitecture.core.gateways.PessoaGateway;

public class CreatePessoaUseCaseImpl implements  CreatePessoaUseCase {

    private final PessoaGateway pessoaGateway;

    public CreatePessoaUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
        Pessoa pessoaExistente = pessoaGateway.findByCpfCnpj(pessoa.cpfCnpj());
        if(pessoaExistente != null) {
            throw new BusinessException("Já existe uma pessoa com CPF/CNPJ "+pessoa.cpfCnpj() + " cadastrado!");
        }
        return pessoaGateway.createPessoa(pessoa);
    }
}
