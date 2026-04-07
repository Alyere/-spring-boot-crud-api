package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Professor;
import br.com.alunoonline.api.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository repository;

    public void criarProfessor(Professor professor) {
        repository.save(professor);
    }

    public List<Professor> listarTodosProfessores() {
        return repository.findAll();
    }

    public Optional<Professor> buscarProfessorPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarProfessorPorId(Long id) {
        repository.deleteById(id);
    }

    public void atualizarProfessor(Long id, Professor professorAlterado) {
        Optional<Professor> professorBanco = repository.findById(id);
        if (professorBanco.isPresent()) {
            Professor professorParaAtualizar = professorBanco.get();
            professorParaAtualizar.setNomeCompleto(professorAlterado.getNomeCompleto());
            professorParaAtualizar.setEmail(professorAlterado.getEmail());
            professorParaAtualizar.setCpf(professorAlterado.getCpf());
            repository.save(professorParaAtualizar);
        }
    }
}