package com.codedeving.cleanarchitecture.infrastructure.dtos;

import com.codedeving.cleanarchitecture.core.enums.EnumTipoPessoa;

public record PessoaDto(
        String nome,
        String email,
        String cpfCnpj,
        EnumTipoPessoa tipoPessoa
) {
}
