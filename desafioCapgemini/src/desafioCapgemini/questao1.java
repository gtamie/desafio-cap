package desafioCapgemini;

public class questao1 {

	public static void main(String[] args) {
		
		int x, n = 6;
		String espaco = " ", estrela = "*";
		
		for (x=n; x>0; x--) {
			//repeticao1 far� a escada de espa�os
			String repeticao1 = new String(new char[x-1]).replace("\0", espaco);
			//repeticao2 far� a escada de asteriscos
			String repeticao2 = new String(new char[n-x+1]).replace("\0", estrela);
			
			System.out.println(repeticao1+repeticao2);
		}


	}
}
