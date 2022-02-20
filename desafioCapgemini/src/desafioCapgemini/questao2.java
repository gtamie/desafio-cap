package desafioCapgemini;

public class questao2 {
	
	public static void main(String[] args) {
		
		String senha="Ya3";
		
		if(senha.length()<6) {
			System.out.printf("Faltam %d caracteres para a senha ser considerada segura",(6-senha.length()));
		}else {
			System.out.println("A senha possui quantidade de caracteres adequada.");
		}
	}
}
