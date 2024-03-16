package com.codedeving.cleanarchitecture.core.usecases;

import com.codedeving.cleanarchitecture.core.entities.Pessoa;

public interface CreatePessoaUseCase {
    public Pessoa execute(Pessoa pessoa);
}
