 🎓 Projeto API - UNIESP (Back-end I)

## 📝 Explicação do Projeto
Este projeto consiste em uma **API REST** para o gerenciamento de uma instituição de ensino. O sistema permite realizar o cadastro, consulta, atualização e exclusão (CRUD) de **Alunos**, **Professores**, **Disciplinas** e **Matrículas de Alunos**, integrando o backend em Java com um banco de dados relacional PostgreSQL.

O objetivo principal é oferecer uma base sólida e escalável para o controle acadêmico, garantindo que as informações sejam persistidas de forma segura e organizada, relacionando os alunos com as disciplinas ofertadas.

---

## 💻 Detalhamento do Código e Tecnologias
O código foi desenvolvido utilizando as melhores práticas do ecossistema Java:

* **Java 17 (LTS):** Linguagem base pela sua robustez e estabilidade.
* **Spring Boot 3:** Framework que agiliza o desenvolvimento através da configuração automática.
* **Spring Data JPA / Hibernate:** Tecnologia que mapeia as classes Java para tabelas do banco de dados (ORM), facilitando a persistência sem SQL manual.
* **PostgreSQL:** Banco de dados relacional utilizado para armazenar os dados de forma definitiva.
* **Maven:** Gerenciador de dependências que organiza todas as bibliotecas do projeto (`pom.xml`).
* **Insomnia:** Ferramenta utilizada para validar e testar todos os endpoints da API.
* **DBeaver:** Interface gráfica para monitoramento e gestão do banco de dados.

---

## 🏗️ Descrição da Arquitetura Utilizada
O sistema utiliza o padrão **MVC (Model-View-Controller)**, dividindo as responsabilidades em camadas:

1. **Model:** Define as entidades `Aluno`, `Professor`, `Disciplina` e `MatriculaAluno` com suas anotações e relacionamentos JPA.
2. **Repository:** Interfaces que estendem `JpaRepository`, fornecendo métodos prontos para o banco.
3. **Service:** Camada de lógica de negócio, onde tratamos as regras de negócio, atualizações e exclusões.
4. **Controller:** Camada que expõe os endpoints e recebe as requisições HTTP (`@RequestBody`, `@PathVariable`).

---

## 🚀 Evidências de Funcionamento: Requisições (Insomnia)

### 🟢 Cadastro (POST)
> Realizando o cadastro de novos registros no sistema.

<div align="center">
  <img width="48%" alt="POST_Professor" src="https://github.com/user-attachments/assets/c186fd5c-3f1d-41a1-86d6-9ad38534beec" /> 
  <img width="48%" alt="POST_Aluno" src="https://github.com/user-attachments/assets/c8320270-8a7f-4643-b611-5d0c2d6ffb24" />
</div>

### 🔵 Listagem (GET)
> Consultando todos os dados cadastrados na base de dados.

<div align="center">
  <img width="48%" alt="GET_Aluno" src="https://github.com/user-attachments/assets/3fe25075-1cda-4a9d-a8a8-abc3d99fe117" />
  <img width="48%" alt="GET_Professor" src="COLE_AQUI_O_LINK_DA_FOTO_get_professor.png" />
</div>

### 🟠 Atualização (PUT)
> Alterando informações de registros existentes através do ID.

<div align="center">
  <img width="48%" alt="PUT_Professor" src="https://github.com/user-attachments/assets/6a549bda-4dae-43c2-a0e3-e7294735f084" /> 
  <img width="48%" alt="PUT_Aluno" src="https://github.com/user-attachments/assets/caecb9e9-2ce8-4a92-b861-ec0cb505934d" />
</div>

### 🔴 Exclusão (DELETE)
> Removendo registros do sistema com sucesso.

<div align="center">
  <img width="48%" alt="DELETE_Aluno" src="https://github.com/user-attachments/assets/4f3b467b-f560-4f52-a35a-ee4bbd53d338" />
  <img width="48%" alt="DEL_Professor" src="COLE_AQUI_O_LINK_DA_FOTO_Delete_professor.png" />
</div>

---

## 🗄️ Evidências de Persistência: Banco de Dados (DBeaver)
> Evidência das tabelas criadas e populadas no PostgreSQL, confirmando a persistência dos dados testados.

### Tabela de Alunos
<img width="100%" alt="DB_Aluno" src=" <img width="1919" height="1079" alt="tabela aluno" src="https://github.com/user-attachments/assets/7b4a1a3d-b62b-4021-97d6-f10438772949" />
   " />

### Tabela de Professores
<img width="100%" alt="DB_Professor" src=" <img width="1919" height="1079" alt="frofessor" src="https://github.com/user-attachments/assets/96518a17-fcbb-4f15-a57c-22b2c8aea436" />
  " />

### Tabela de Disciplinas
<img width="100%" alt="DB_Disciplina" src="<img width="1900" height="1079" alt="disciplina" src="https://github.com/user-attachments/assets/7bdf7de1-de42-43f3-b1d2-9ea628a48f29" />
  " />

### Tabela de Matrículas
<img width="100%" alt="DB_Matricula" src="  <img width="1919" height="1079" alt="matriculaaluno" src="https://github.com/user-attachments/assets/11822134-6840-4ce9-a31b-e7487a4f65cb" />
 " />

---

## 🏁 Conclusão
Este projeto foi desenvolvido como **1ª Avaliação** da disciplina de **Back-end I**, consolidando os conceitos de arquitetura REST, persistência em PostgreSQL e o fluxo de um CRUD completo em Java.

Agradeço ao **Professor Kelson** pelas orientações e pelo excelente material de apoio disponibilizado.

---
### 👤 Desenvolvido por:
**Alyere Targino** | Ciência da Computação (P3)
📍 Centro Universitário UNIESP
