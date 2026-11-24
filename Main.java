//EXERCÍCIO 1 – Sistema de Usuários

class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }
}

class Administrador extends Usuario {
    private int nivelAcesso;

    public Administrador(String nome, String email, int nivelAcesso) {
        super(nome, email);
        this.nivelAcesso = nivelAcesso;
    }

    public int getNivelAcesso() { return nivelAcesso; }
    public void setNivelAcesso(int nivelAcesso) { this.nivelAcesso = nivelAcesso; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Nível de Acesso: " + nivelAcesso);
    }
}


// EXERCÍCIO 2 – Sistema de Produtos


class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public void mostrarProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}

class Notebook extends Produto {
    private int memoriaRAM;

    public Notebook(String nome, double preco, int memoriaRAM) {
        super(nome, preco);
        this.memoriaRAM = memoriaRAM;
    }

    public int getMemoriaRAM() { return memoriaRAM; }
    public void setMemoriaRAM(int memoriaRAM) { this.memoriaRAM = memoriaRAM; }

    @Override
    public void mostrarProduto() {
        super.mostrarProduto();
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
    }
}


// EXERCÍCIO 3 – Funcionários da Empresa

class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public void mostrarFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
    }
}

class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, double salario, String linguagemPrincipal) {
        super(nome, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() { return linguagemPrincipal; }
    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public void mostrarFuncionario() {
        super.mostrarFuncionario();
        System.out.println("Linguagem Principal: " + linguagemPrincipal);
    }
}


// EXERCÍCIO 4 – Sistema Escolar

class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Curso: " + curso);
    }
}

// PROGRAMA PRINCIPAL – Executa os 4 exercícios em sequência

public class Main {
    public static void main(String[] args) {

        // ---------- Exercício 1 ----------
        System.out.println("===== EXERCÍCIO 1 – SISTEMA DE USUÁRIOS =====");
        Administrador admin = new Administrador("Carlos Silva", "carlos@empresa.com", 1);
        admin.setNivelAcesso(5); // altera o nível de acesso via setter
        admin.exibirDados();
        System.out.println();

        // ---------- Exercício 2 ----------
        System.out.println("===== EXERCÍCIO 2 – SISTEMA DE PRODUTOS =====");
        Notebook notebook = new Notebook("Dell Inspiron", 4599.90, 8);
        notebook.setMemoriaRAM(16); // altera a memória RAM via setter
        notebook.mostrarProduto();
        System.out.println();

        // ---------- Exercício 3 ----------
        System.out.println("===== EXERCÍCIO 3 – FUNCIONÁRIOS DA EMPRESA =====");
        Desenvolvedor dev = new Desenvolvedor("Ana Souza", 6500.00, "Java");
        dev.setSalario(7800.00); // altera o salário via setter
        dev.mostrarFuncionario();
        System.out.println();

        // ---------- Exercício 4 ----------
        System.out.println("===== EXERCÍCIO 4 – SISTEMA ESCOLAR =====");
        Aluno aluno = new Aluno("Mariana Lima", 20, "Engenharia de Software");
        aluno.setIdade(21); // altera a idade via setter
        aluno.apresentar();
    }
}