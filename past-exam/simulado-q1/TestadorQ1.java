import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

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
		UserBase ub = new UserBase();
		User u1 = ub.createUser("123");
		VerifiedUser u2 = ub.creatVerifiedUser("456", new Date());

		Tweet t1 = u1.criaTweet("Olá mundo!");
		Tweet t2 = u2.criaTweet("Hello World!");

		NumberFormat nfPorcentagem =  NumberFormat.getPercentInstance(Locale.forLanguageTag("pt-BR"));
		NumberFormat nf = NumberFormat.getInstance(Locale.forLanguageTag("pt-BR"));

		double porcentagemUsuariosVerificados = ub.calculaPorcentagemUsuariosVerificados();
		double tamanhoMedioTweets = ub.calculaTamanhoMedioTweets();

		System.out.println("Porcentagem de Usuários Verificados: " + nfPorcentagem.format(porcentagemUsuariosVerificados));
		System.out.println("Tamanho Médio de Tweets: " + nf.format(tamanhoMedioTweets));
	}
}
