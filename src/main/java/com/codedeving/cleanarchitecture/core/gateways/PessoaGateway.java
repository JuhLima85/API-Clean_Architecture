package com.codedeving.cleanarchitecture.core.gateways;

import com.codedeving.cleanarchitecture.core.entities.Pessoa;

import java.util.List;

public interface PessoaGateway {

    Pessoa createPessoa(Pessoa pessoa);

    Pessoa findByCpfCnpj(String cpfCnpj);
}
