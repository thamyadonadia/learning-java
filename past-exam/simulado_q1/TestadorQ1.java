/**
 * Questão 1.
 * 
 * Crie classes para representar dados sobre uma base de usuários (UserBase) do Twitter, seguindo o diagrama UML fornecido.
 * 
 * Implemente funcionalidade nas suas classes para calcular a porcentagem média de usuários "verificados" (VerifiedUser) 
 * em uma UserBase assim como o tamanho médio de cada mensagem (ou seja o tamanho médio do atributo text de 
 * todos os tweets de todos os usuários).
 * 
 * Crie um testador para suas classes. 
 * 
 * 
 */


public class TestadorQ1 {

	public static void main(String[] args) {
		String text1 = "Olá mundo!";
		String text2 = "Testando 1 2 3";
		String text3 = "Bem vindo ao Twitter";
		String text4 = "Prova de Programação";

		Tweet t1 = new Tweet(text1);
		Tweet t2 = new Tweet(text2);
		Tweet t3 = new Tweet(text3);
		Tweet t4 = new Tweet(text4);
		
		User u1 = new User("01"); u1.addTweets(t1);
		User u2 = new User("02"); u2.addTweets(t2);

		VerifiedUser v1 = new VerifiedUser("03", "2022-12-04"); v1.addTweets(t3);
		VerifiedUser v2 = new VerifiedUser("04", "2021-11-04"); v1.addTweets(t4);

		UserBase ub = new UserBase();
		ub.addUser(u1);
		ub.addUser(u2);
		ub.addUser(v1);
		ub.addUser(v2);	
		
		System.out.println("Número médio de usuários verificados: " + ub.getPorcentagemMediaVerifiedUser());
		System.out.println("Tamanho médio dos tweets : " + ub.getTamanhoMedioTweets());
	}
}
