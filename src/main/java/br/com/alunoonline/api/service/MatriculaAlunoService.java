package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.MatriculaAluno;
import br.com.alunoonline.api.repository.MatriculaAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MatriculaAlunoService {

    @Autowired
    MatriculaAlunoRepository repository;

    public void criarMatricula(MatriculaAluno matriculaAluno) {
        matriculaAluno.setStatus("MATRICULADO");
        repository.save(matriculaAluno);
    }

    public void atualizarNotas(Long matriculaId, MatriculaAluno notasRequest) {
        MatriculaAluno matricula = repository.findById(matriculaId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Matrícula não encontrada"));

        matricula.setNota1(notasRequest.getNota1());
        matricula.setNota2(notasRequest.getNota2());

        // Lógica de Aprovação do Guia (Média 7)
        if (matricula.getNota1() != null && matricula.getNota2() != null) {
            double media = (matricula.getNota1() + matricula.getNota2()) / 2;
            matricula.setStatus(media >= 7.0 ? "APROVADO" : "REPROVADO");
        }

        repository.save(matricula);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}