import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeContatoCsv {

	public static void main(String[] args) {

		Scanner sc = null;

		try {
			sc = new Scanner(new FileReader("contatos.csv")).useDelimiter(",|\\r\\n");
		} catch (FileNotFoundException fnfe) {
			System.err.println("Erro ao abrir o arquivo.");
			System.exit(1);
		}

		Contato contato = new Contato(0, null, null, null, 0, 0);

		System.out.printf("%-4s%-13s%-10s%-15s%-16s%16s\n", "id", "Nome", "Telefone", "E-mail", "Dia Aniversário",
				"Mês Aniversário");

		try {
			while (sc.hasNext()) {
				contato.setIdContato(sc.nextInt());
				contato.setNome(sc.next());
				contato.setTelefone(sc.next());
				contato.setEmail(sc.next());
				contato.setDiaAniv(sc.nextInt());
				contato.setMesAniv(sc.nextInt());

				System.out.printf("%-4d%-13s%-10s%-15s%-16d%16d\n", contato.getIdContato(), contato.getNome(),
						contato.getTelefone(), contato.getEmail(), contato.getDiaAniv(), contato.getMesAniv());

			}
		} catch (NoSuchElementException elementException) {
			System.err.println("Arquivo com problemas :(");
			sc.close();
			System.exit(1);
		} catch (IllegalStateException stateException) {
			System.err.println("Erro na leitura do arquivo.");
			System.exit(1);
		}
		
		if(sc != null) {
			sc.close();
		}

	}

}
