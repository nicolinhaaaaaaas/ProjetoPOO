package projeto;
import java.util.*;

public class Login {
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<String> clientes = new ArrayList<>();
	ArrayList<String> emails = new ArrayList<>();
	ArrayList<String> senhas = new ArrayList<>();

	private String nomeUsuario;
	private String email;
	private String senha;
	
	public void setUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getUsuario() {
		return nomeUsuario;
	}
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return senha;
	}
	
	public void escolhaLogin() {
		System.out.println("Escolha a opcao de login: (1)- Usuario ; (2)-Administrador");
		Integer opcao = scanner.nextInt();
		
		if(opcao.equals(1)) {
			loginCliente();
		}
		else if(opcao.equals(2)) {
			loginAdministrador();
		}
		else {
			System.out.println("Opcao invalida");
		}
	}
	
	public void loginCliente() {
		System.out.print("Voce escolheu a opcao de cliente. Digite seu nome de usuario: ");
		nomeUsuario = scanner.next();
		clientes.add(nomeUsuario);
		System.out.println("Seja bem vindo ao sistema de Hoteis Marinho, Sr(a): "+nomeUsuario);
		
	}
	
	public void loginAdministrador() {
		System.out.println("Voce escolheu a opcao de Administrador. O que deseja fazer?");
		System.out.println("(1) - Login em conta ja existente.");
		System.out.println("(2) - Criar uma nova conta");
		Integer opcao = scanner.nextInt();
		
		if(opcao.equals(1)) {
			
			while(true) {
				System.out.print("Digite seu email: ");
				email = scanner.next();
				System.out.print("Digite sua senha: ");
				senha = scanner.next();
				
				if(emails.contains(email)) {
					if(senhas.contains(senha)) {
						System.out.println("Login bem sucedido");
						break;
					}
					else {
						System.out.println("Senha incorreta, tente novamente");
					}
				}
				else {
					System.out.println("Email incorreto, tente novamente.");
				}
				
			}
		}
		else {
			criarConta();
		}
	}
	
	public void criarConta() {
		while(true) {
			System.out.print("Digite um novo endereco de E-Mail: ");
			email = scanner.next();
			System.out.print("Digite uma nova senha: ");
			senha = scanner.next();
			
			if(emails.contains(email)) {
				System.out.println("Este email ja esta no sistema.");
			}
			else {
				emails.add(email);
				senhas.add(senha);
				System.out.println("sua nova conta foi criada com sucesso.");
				break;
			}
		}
	}
}
