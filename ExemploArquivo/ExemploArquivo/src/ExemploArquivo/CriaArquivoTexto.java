package ExemploArquivo;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class CriaArquivoTexto
{
   public static void main( String[] args )
   {
	   Formatter output= null;   /* variável referência para o objeto de saida para o arquivo */
	   Disciplina disc;          /* variável referência para o objeto Disciplina */
	   int idDisc;
	   String nome;
	   String curso;
	   int semestre;
	   int qtdAlunos;

	   Scanner input = new Scanner( System.in );
	   
	   // abre o arquivo disciplina.txt
	   try
	   {
	       output = new Formatter( "disciplina.txt" ); // open the file
	   }
	   catch ( SecurityException securityException )
	   {
	       System.err.println("Voce nao tem permissão de escrita nesse arquivo.");
	       System.exit(1); // termina o programa
	   }
       catch ( FileNotFoundException fileNotFoundException )
	   {
	       System.err.println( "Erro ao abrir ou criar o arquivo." );
	       System.exit(1); // termina o programa
	   }
       
       System.out.printf( "Para terminar o programa, digite <Ctrl> z \n");
       System.out.printf( "Digite id da disciplina, nome da disciplina, nome do curso, semestre " +
                          "e quantidade de alunos separados por espaço\n");
       
       while ( input.hasNext() ) // enquanto usuário não digitou <Ctrl> z
    	   						 // se for Linux, ou Mac OS, <Enter><Ctrl> d
       {
          try 
          {
             idDisc = input.nextInt();  // lê o identificador da disciplina
        	 nome = input.next(); // lê o nome da disciplina
             curso = input.next(); // lê o nome do curso
             semestre = input.nextInt(); // lê o semestre
             qtdAlunos = input.nextInt(); // lê a quantidade de alunos

             /* cria um objeto da classe Disciplina com os dados digitados */
             disc = new Disciplina(idDisc, nome, curso, semestre, qtdAlunos);
             
             /* grava os dados no arquivo */
             output.format( "%d %s %s %d %d\n", disc.getIdDisc(), disc.getNome(), 
                     disc.getCurso(), disc.getSemestre(), disc.getQtdAlunos());
          }
          catch ( FormatterClosedException formatterClosedException )
          {
             System.err.println( "Erro ao gravar no arquivo." );
             System.exit( 1 );
          }
          System.out.printf( "Digite id da disciplina, nome da disciplina, nome do curso, semestre " +
                             "e quantidade de alunos separados por espaço\n");

       } 

       /* fecha o arquivo */ 
       if ( output != null )
             output.close();
 
   }
}
