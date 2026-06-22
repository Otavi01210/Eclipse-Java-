package br.com.escola;
import java.util.Scanner;
import br.com.escola.model.Aluno;
import br.com.escola.model.Turma;
import br.com.escola.service.EscolaService;

@SuppressWarnings("java:S106")
public class Main{
	
}


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		EscolaService service = new EscolaService();
		
		int opcao;
		
		do {
			   System.out.println("\n==== SISTEMA ESCOLAR ====");
			    System.out.println("1 - Cadastrar Turma");
			    System.out.println("2 - Listar Turmas");
			    System.out.println("3 - Cadastrar Aluno em Turma");
			    System.out.println("4 - Listar Alunos de uma Turma");
			    System.out.println("5 - Sair");
			    System.out.println("Escolha: ");
			    
		 
		   switch (opcao) {
		   
		   case 1:
		      System.out.print("Nome da Turma: ");
		      String nomeTurma = scanner.nextLine();
		      service.adicionarTurma(new Turma(nomeTurma));
		      System.out.println("Turma cadastrada com sucesso!");
		      break;
		   	   
		   case 2:
		      ListarTurmas(service);
		      break;
		      
		   case 3:
		      cadastrarAluno(scanner,service);
		      break;
		   
		   case 4:
		      ListarAlunos(scanner,service);
		      break;
		      
		   case 5:
		      System.out.println("Encerrando o sistema até logo");
		      break;
		    
		   default:
		   
		       System.out.println("Opcao invalida! Digite um numero de 1 a 5,");
		    }
		  
		while (opcao != 5);{
		
		scanner.close();
		
		
		
	}
		private static void listarTurma(Scanner scanner, EscolaService service) {
			if(service.estaVazia()) {
			System.out.println("Nenhuma turma cadastrada ainda.");
			return;
		
			}
			ListarTurmas(service);
			
			System.out.print("Escolha o indice da Turma ");
			int indice = scanner.nextInt();
		    scanner.nextLine();
			Turma turma = service.buscarTurma(indice);
			
		System.out.println("\n--- Turmas cadastradas ---");
		
		for(int i = 0; i < service.listarTurmas().size(); i++) {
			System.out.println(i + " - " + service.listarTurmas().get(i));
		}
			
			if (turma == null) {
				System.out.println("Indice invalido. Nenhuma turma encontrada");
				return;
			}
			
			System.out.print("Nome do aluno: ");
			String nome = scanner.nextLine();
			
			System.out.print("Nota 1: ");
			double nota1 = scanner.nextDouble();
			
			System.out.print("Nota 2: ");
			double nota2 = scanner.nextDouble();
			scanner.nextLine();
		}
			private static void listarTurmas(Scanner scanner, EscolaService service) {
				
				if(service.estaVazia()) {
					System.out.println("Nenhuma turma cadastrada ainda.");
					return;
				
			}
					
				    ListarTurmas(service);
					
					System.out.print("Escolha o indice da Turma ");
					int indice = scanner.nextInt();
				    scanner.nextLine();
				    
				    Turma turma = service.buscarTurma(indice);
				    
				    if (turma == null) {
				    	System.out.println("Indice invalido. Nenhuma turma cadastrada.");
				    	return;
				    
				    }
				    if (turma.getAlunos().isEmpty()) {
				    	system.out.println("Nenhum aluno cadastrado nesta turma.");
				    	return;
				    }
				    
				    for (Aluno aluno : turma.getAlunos()) {
				    	System.out.println(aluno);
				    }
					
				    
			        
		}


		}