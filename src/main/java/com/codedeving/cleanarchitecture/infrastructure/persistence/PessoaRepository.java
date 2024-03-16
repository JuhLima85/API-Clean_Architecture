package com.codedeving.cleanarchitecture.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
}
