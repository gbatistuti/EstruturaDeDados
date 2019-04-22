package agendaTexto;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class GravaContato {

	public static void main(String[] args) {

		Formatter output = null;
		Agenda ag;
		int idContato;
		String nome;
		String sobrenome;
		String telefone;
		String email;
		int diaAniv;
		int mesAniv;
		
		Scanner input = new Scanner(System.in);
		
		try {
			output = new Formatter("agenda.txt");
		} catch (SecurityException securityException) {
			System.err.println("Você não tem permissão de escrita nesse arquivo");
			System.exit(1);
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Erro ao abrir ou criar o arquivo");
			System.exit(1);
		}
		
	
		while(input.hasNext()) {
			
			System.out.println("Para terminar o programa, digite <Ctrl> z \n");
			System.out.println("Digite id do Contato, nome, sobrenome, telefone, " +
	                "email, dia e mês do aniversário, separados por espaço\n");
			
			try {
				idContato = input.nextInt();
				nome = input.next();
				sobrenome = input.next();
				telefone = input.next();
				email = input.next();
				diaAniv = input.nextInt();
				mesAniv = input.nextInt();
				
				ag = new Agenda(idContato, nome, sobrenome, telefone, email, diaAniv, mesAniv);
				
				output.format("%d %s %s %s %s %d %d", ag.getIdContato(), ag.getNome(), ag.getSobrenome(), ag.getTelefone(), ag.getEmail(), ag.getDiaAniv(), ag.getMesAniv());
			}
			catch(FormatterClosedException formatterClosedException) {
				System.err.println("Erro ao gravar no arquivo");
				System.exit(1);
			}
			
			if (output != null) {
				output.close();
			}
		}
	}

}
