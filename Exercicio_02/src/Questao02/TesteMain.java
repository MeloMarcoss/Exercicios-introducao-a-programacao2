package Questao02;

import java.time.LocalDate;

public class TesteMain {

    public static void main(String[] args) {

        // Instancia do repositorioPessoas
        RepositorioPessoas repositorioPessoas = new RepositorioPessoas();

        // Instanciação dos Clientes
        Cliente cliente01 = new Cliente
                ("Fulano", LocalDate.of(1990, 1, 1), 345234375456L);

        Cliente cliente02 = new Cliente
                ("Leo da Silva", LocalDate.of(1980, 6, 23), 345222345456L);

        Cliente cliente03 = new Cliente
                ("Durval Araujo", LocalDate.of(1986, 9, 22), 345634345856L);

        Cliente cliente04 = new Cliente
                ("Melo Aguiar", LocalDate.of(1988, 3, 30), 345234345886L);

        Cliente cliente05 = new Cliente
                ("Junior Brito", LocalDate.of(1994, 2, 14), 34523434999L);

        Cliente clienteRepetido = new Cliente
                ("Junior Brito", LocalDate.of(1994, 2, 14), 34523434999L);

        // Cadastramentos dos clientes
        repositorioPessoas.cadastrarPesssoa(cliente01);
        repositorioPessoas.cadastrarPesssoa(cliente02);
        repositorioPessoas.cadastrarPesssoa(cliente03);
        repositorioPessoas.cadastrarPesssoa(cliente04);
        repositorioPessoas.cadastrarPesssoa(cliente05);
        repositorioPessoas.cadastrarPesssoa(clienteRepetido);


        // Instanciacao dos funcionários
        Funcionario funcionario01 = new Funcionario
                ("Maciel melo", LocalDate.of(1991, 1, 1), 1200);

        Funcionario funcionario02 = new Funcionario
                ("Auditore", LocalDate.of(1964, 8, 24), 1197.3);

        Funcionario funcionario03 = new Funcionario
                ("Thiago da Silva", LocalDate.of(1987, 9, 13), 1400);

        Funcionario funcionario04 = new Funcionario
                ("Dexter", LocalDate.of(1989, 6, 17), 2500);

        Funcionario funcionario05 = new Funcionario
                ("Tite Kubo", LocalDate.of(1996, 8, 29), 1560);

        Funcionario funcionarioRepetido = new Funcionario
                ("Tite Kubo", LocalDate.of(1996, 8, 29), 1560);

        // Cadastramentos dos funcionarios
        repositorioPessoas.cadastrarPesssoa(funcionario01);
        repositorioPessoas.cadastrarPesssoa(funcionario02);
        repositorioPessoas.cadastrarPesssoa(funcionario03);
        repositorioPessoas.cadastrarPesssoa(funcionario04);
        repositorioPessoas.cadastrarPesssoa(funcionario05);
        repositorioPessoas.cadastrarPesssoa(funcionarioRepetido);


        // Instanciacao dos gerentes
        Gerente gerente01 = new Gerente
                ("LeBron James", LocalDate.of(1991, 6, 23), 1100, "vendas");

        Gerente gerente02 = new Gerente
                ("Neymar Jr", LocalDate.of(1992, 5, 10), 1220.3, "rh");

        Gerente gerente03 = new Gerente
                ("Steve Rogers", LocalDate.of(1977, 9, 13), 1500, "vendas");

        Gerente gerente04 = new Gerente
                ("Kratos", LocalDate.of(1969, 9, 2), 2000, "rh");

        Gerente gerente05 = new Gerente
                ("Gustavo", LocalDate.of(1998, 10, 17), 1300, "vendas");

        Gerente gerenteRepetido = new Gerente
                ("Gustavo", LocalDate.of(1998, 10, 17), 1300, "vendas");


        // Cadastramentos dos gerentes
        repositorioPessoas.cadastrarPesssoa(gerente01);
        repositorioPessoas.cadastrarPesssoa(gerente02);
        repositorioPessoas.cadastrarPesssoa(gerente03);
        repositorioPessoas.cadastrarPesssoa(gerente04);
        repositorioPessoas.cadastrarPesssoa(gerente05);
        repositorioPessoas.cadastrarPesssoa(gerenteRepetido);



        // Todas as listagens solicitadas

        System.out.println("\n\nPessoas maiores de idade:\n" + repositorioPessoas.listarPessoasMaioresIdade());

        System.out.println("\n\nClientes maiores de idade:\n" + repositorioPessoas.listarClientesMaioresIdade());

        System.out.println("\n\nFuncionários com salário maior que 1250:\n"
                + repositorioPessoas.listarFuncionariosComSalarioMaiorQue(1250));

        System.out.println("\n\nGerentes de vendas:\n" + repositorioPessoas.listarGerentesDaArea("vendas"));
    }

}