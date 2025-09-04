package com.ranieriiuri.gerenciadorDeTarefasAPI.repository;

import com.ranieriiuri.gerenciadorDeTarefasAPI.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
