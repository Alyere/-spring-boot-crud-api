package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository repository;

    public void criarAluno(Aluno aluno) {
        repository.save(aluno);
    }

    public List<Aluno> listarTodosAlunos() {
        return repository.findAll();
    }

    public Optional<Aluno> buscarAlunoPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarAlunoPorId(Long id) {
        repository.deleteById(id);
    }

    public void atualizarAluno(Long id, Aluno alunoAlterado) {
        Optional<Aluno> alunoBanco = repository.findById(id);
        if (alunoBanco.isPresent()) {
            Aluno alunoParaAtualizar = alunoBanco.get();
            alunoParaAtualizar.setNomeCompleto(alunoAlterado.getNomeCompleto());
            alunoParaAtualizar.setEmail(alunoAlterado.getEmail());
            alunoParaAtualizar.setCpf(alunoAlterado.getCpf());
            repository.save(alunoParaAtualizar);
        }
    }
}