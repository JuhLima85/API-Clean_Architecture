package com.codedeving.cleanarchitecture.core.usecases;

import com.codedeving.cleanarchitecture.core.entities.Pessoa;

import java.util.List;

public interface GetAllPessoasUseCase {
    public List<Pessoa> execute();
}
