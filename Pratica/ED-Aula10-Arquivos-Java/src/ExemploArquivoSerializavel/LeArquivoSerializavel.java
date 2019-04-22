package ExemploArquivoSerializavel;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeArquivoSerializavel {

	public static void main( String[] args )
	   {
	       ObjectInputStream input= null;
	       DisciplinaSerializavel disc;
	       boolean fimArquivo= false;
	       
	       /* Abre o arquivo */
	       try
	       {
	          input = new ObjectInputStream(new FileInputStream( "disciplina.ser" ) );
	       }
	       catch ( IOException ioException )
	       {
	          System.err.println( "Erro ao abrir arquivo." );
	       }

	       /* Exibe os titulos das colunas */
	       System.out.printf( "%-14s%-14s%-12s%-12s%10s\n", "Identificador","Disciplina","Curso","Semestre","Nro Alunos" );
	       /* Tenta ler e exibir os dados do arquivo até encontrar o fim de arquivo */
	       try 
	       { 
	          while ( !fimArquivo )   /* Loop enquanto não é fim de arquivo */
	          {
	              /* lê um objeto do arquivo */
	        	  disc = (DisciplinaSerializavel) input.readObject();

	        	  /* exibe os dados do objeto lido */
	           	  System.out.printf( "%-14d%-14s%-12s%-12d%10d\n", disc.getIdDisc(),
	        		 disc.getNome(), disc.getCurso(), disc.getSemestre(), disc.getQtdAlunos() );
	          }
	       }
	       catch ( EOFException endOfFileException )
	       {
	          fimArquivo= true; // chegou ao final do arquivo
	       }
	       catch ( IOException ioException )
	       {
	          System.err.println( "Erro durante a leitura do arquivo." );
	       }
	       catch (ClassNotFoundException classNotFoundException)
	       {
	          System.err.println( "Nao foi possivel criar o objeto (readObject)." );
	       }
	       
	       /* Fecha o arquivo */
	       try
	       {
	          if ( input != null )
	             input.close();
	          System.exit( 0 );
	       }
	       catch ( IOException ioException )
	       {
	          System.err.println( "Erro ao fechar o arquivo." );
	          System.exit( 1 );
	       }
	      
	   }
	
}
