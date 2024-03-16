package com.codedeving.cleanarchitecture.infrastructure.controllers;

import com.codedeving.cleanarchitecture.core.entities.Pessoa;
import com.codedeving.cleanarchitecture.infrastructure.dtos.PessoaDto;
import com.codedeving.cleanarchitecture.core.usecases.CreatePessoaUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pessoas")
@AllArgsConstructor
public class PessoaController {

    private final CreatePessoaUseCase createPessoaUseCase;
    private final PessoaDtoMapper pessoaDtoMapper;

    @PostMapping
    public PessoaDto createPessoa(@RequestBody PessoaDto pessoaDto) {
        Pessoa novoPessoa = createPessoaUseCase.execute(pessoaDtoMapper.toDomain(pessoaDto));
        return pessoaDtoMapper.toDto(novoPessoa);
    }
}
