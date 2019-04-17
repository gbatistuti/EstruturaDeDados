package ExemploArquivo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeArquivoTexto
{
   public static void main( String[] args )
   {
       Scanner input= null;
        
       /* Abre o arquivo */
       try
       {
          input = new Scanner( new FileReader( "disciplina.txt" ) );
       }
       catch ( FileNotFoundException fileNotFoundException )
       {
          System.err.println( "Erro ao abrir arquivo." );
          System.exit( 1 );
       }

       Disciplina disc= new Disciplina(0, null, null, 0,0);
       
       /* Exibe os titulos das colunas */
       System.out.printf( "%-14s%-14s%-12s%-12s%10s\n", "Identificador","Disciplina","Curso","Semestre","Nro Alunos" );
      
       /* Tenta ler e exibir os dados do arquivo at� encontrar o fim de arquivo */
       
       try // le dados do arquivo usando o Scanner
       {
          while ( input.hasNext() )
          {
              disc.setIdDisc( input.nextInt() ); // l� o identificador da disciplina
        	  disc.setNome( input.next() ); // l� o nome da disciplina
              disc.setCurso( input.next() ); // l� o nome do curso
              disc.setSemestre( input.nextInt() ); // l� o semestre
              disc.setQtdAlunos( input.nextInt() ); // l� a quantidade de alunos

              // exibe os dados
        	  System.out.printf( "%-14d%-14s%-12s%-12d%10d\n", disc.getIdDisc(),
             		 disc.getNome(), disc.getCurso(), disc.getSemestre(), disc.getQtdAlunos() );
          }
       }
       catch ( NoSuchElementException elementException )
       {
           System.err.println( "Arquivo com problemas." );
           input.close();
           System.exit( 1 );
       }
       catch ( IllegalStateException stateException )
       {
           System.err.println( "Erro na leitura do arquivo." );
           System.exit( 1 );
       }
 
       /* Fecha o arquivo */
       if ( input != null )
           input.close();
   
   }
}

