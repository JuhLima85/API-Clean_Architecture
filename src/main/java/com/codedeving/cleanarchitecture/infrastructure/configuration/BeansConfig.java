package com.codedeving.cleanarchitecture.infrastructure.configuration;

import com.codedeving.cleanarchitecture.core.gateways.PessoaGateway;
import com.codedeving.cleanarchitecture.core.usecases.CreatePessoaUseCase;
import com.codedeving.cleanarchitecture.core.usecases.CreatePessoaUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BeansConfig {

    @Bean
    public CreatePessoaUseCase createPessoaUseCase(PessoaGateway pessoaGateway) {
        return new CreatePessoaUseCaseImpl(pessoaGateway);
    }
}
