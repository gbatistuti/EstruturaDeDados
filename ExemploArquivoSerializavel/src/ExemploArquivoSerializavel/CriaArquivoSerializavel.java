package ExemploArquivoSerializavel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CriaArquivoSerializavel
{
   public static void main( String[] args )
   {
	   ObjectOutputStream output= null;   /* variavel referencia para o objeto de saida para o arquivo */
	   DisciplinaSerializavel disc;  /* variavel referencia para o objeto DisciplinaSerializable */
	   int idDisc;
	   String nome;
	   String curso;
	   int semestre;
	   int qtdAlunos;

	   Scanner input = new Scanner( System.in );
	   
	   // abre o arquivo disciplina.ser
	   try 
       {
          output = new ObjectOutputStream(new FileOutputStream( "disciplina.ser" ) );
       }
       catch ( IOException ioException )
       {
          System.err.println( "Erro ao abrir arquivo." );
          System.exit(1); /* termina o programa */
       }


       System.out.printf( "Para terminar o programa, digite <Ctrl> z \n");
       System.out.printf( "Digite id da disciplina, nome da disciplina, nome do curso, semestre " +
                          "e quantidade de alunos separados por espaço\n");
       
       while ( input.hasNext() ) // enquanto usuário não digitou <Ctrl> z
       {
          try 
          {
             idDisc = input.nextInt(); //lê o identificador da disciplina
        	 nome = input.next(); // lê o nome da disciplina
             curso = input.next(); // lê o nome do curso
             semestre = input.nextInt(); // lê o semestre
             qtdAlunos = input.nextInt(); // lê a quantidade de alunos

             /* cria um objeto da classe DisciplinaSerializable com os dados digitados */
             disc = new DisciplinaSerializavel (idDisc, nome, curso, semestre, qtdAlunos);
             
             /* grava o objeto no arquivo */
             output.writeObject( disc ); 
          }
          catch ( IOException ioException )
          {
             System.err.println( "Erro ao gravar no arquivo." );
             System.exit( 1 );
          }
          System.out.printf( "Digite id da disciplina, nome da disciplina, nome do curso, semestre " +
                             "e quantidade de alunos separados por espaço\n");

       }

       /* fecha o arquivo */ 
       try
       {
          if ( output != null )
             output.close();
       }
       catch ( IOException ioException )
       {
          System.err.println( "Erro ao fechar o arquivo." );
          System.exit( 1 );
       } 
  
   }
}
