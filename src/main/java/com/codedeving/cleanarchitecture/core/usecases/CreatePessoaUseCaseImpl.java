package com.codedeving.cleanarchitecture.core.usecases;

import com.codedeving.cleanarchitecture.core.entities.Pessoa;
import com.codedeving.cleanarchitecture.core.gateways.PessoaGateway;

public class CreatePessoaUseCaseImpl implements  CreatePessoaUseCase {

    private final PessoaGateway pessoaGateway;

    public CreatePessoaUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
        return pessoaGateway.createPessoa(pessoa);
    }
}
