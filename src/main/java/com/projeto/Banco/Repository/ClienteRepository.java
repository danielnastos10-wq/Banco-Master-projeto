package com.projeto.Banco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.Banco.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    

    
}
