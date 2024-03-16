package com.codedeving.cleanarchitecture.infrastructure.persistence;

import com.codedeving.cleanarchitecture.core.enums.EnumTipoPessoa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TB_PESSOA")
public class PessoaEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String cpfCnpj;
    @Enumerated(EnumType.STRING)
    private EnumTipoPessoa tipo;
}

