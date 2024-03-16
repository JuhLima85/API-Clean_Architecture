package com.codedeving.cleanarchitecture.core.entities;

import com.codedeving.cleanarchitecture.core.enums.EnumTipoPessoa;
public record Pessoa(Long id,
                     String nome,
                     String email,
                     String cpfCnpj,
                     EnumTipoPessoa tipo) {}
