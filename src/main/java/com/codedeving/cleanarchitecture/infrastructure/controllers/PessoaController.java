package com.codedeving.cleanarchitecture.infrastructure.controllers;

import com.codedeving.cleanarchitecture.core.entities.Pessoa;
import com.codedeving.cleanarchitecture.core.usecases.GetAllPessoasUseCase;
import com.codedeving.cleanarchitecture.infrastructure.dtos.PessoaDto;
import com.codedeving.cleanarchitecture.core.usecases.CreatePessoaUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("api/pessoas")
@AllArgsConstructor
public class PessoaController {

    private final CreatePessoaUseCase createPessoaUseCase;
    private final PessoaDtoMapper pessoaDtoMapper;
    private final GetAllPessoasUseCase getAllPessoasUseCase;

    @PostMapping
    public PessoaDto createPessoa(@RequestBody PessoaDto pessoaDto) {
        Pessoa novoPessoa = createPessoaUseCase.execute(pessoaDtoMapper.toDomain(pessoaDto));
        return pessoaDtoMapper.toDto(novoPessoa);
    }

    @GetMapping
    public List<PessoaDto> obtainAll() {
        return getAllPessoasUseCase.execute()
                .stream().map(pessoaDtoMapper::toDto)
                .collect(Collectors.toList());
    }

}
