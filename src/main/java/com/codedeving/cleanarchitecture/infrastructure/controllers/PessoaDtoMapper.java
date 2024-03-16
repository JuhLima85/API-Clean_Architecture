package com.codedeving.cleanarchitecture.infrastructure.controllers;

import com.codedeving.cleanarchitecture.core.entities.Pessoa;
import com.codedeving.cleanarchitecture.infrastructure.dtos.PessoaDto;
import org.springframework.stereotype.Component;

@Component
public class PessoaDtoMapper {

    public PessoaDto toDto(Pessoa pessoa) {
        return new PessoaDto(pessoa.nome(), pessoa.email(), pessoa.cpfCnpj(), pessoa.tipo());
    }

    public Pessoa toDomain(PessoaDto pessoaDto) {
        return  new Pessoa(null, pessoaDto.nome(), pessoaDto.email(), pessoaDto.cpfCnpj(), pessoaDto.tipoPessoa());
    }
}
