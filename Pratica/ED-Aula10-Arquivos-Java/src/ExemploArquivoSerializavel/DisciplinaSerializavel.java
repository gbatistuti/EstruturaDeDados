package ExemploArquivoSerializavel;

public class DisciplinaSerializavel {

	
	 private static final long serialVersionUID = 1L;  /* necessario para classe Serializable */
	   private int idDisc;		/* identificador da disciplina */
	   private String nome;		/* nome da disciplina */
	   private String curso;	/* nome do curso do qual a disciplina faz parte */
	   private int semestre;	/* semestre em que eh lecionada */
	   private int qtdAlunos;	/* quantidade de alunos matriculados na disciplina */
	   
	   // construtor
	   public DisciplinaSerializavel(int idDisc, String nome, String curso, int semestre, int qtdAlunos)
	   {
	      this.idDisc = idDisc;
		  this.nome = nome;
	      this.curso = curso;
	      this.semestre = semestre;
	      this.qtdAlunos= qtdAlunos;
	   }

	    public int getIdDisc() {
			return idDisc;
	    }

		public void setIdDisc(int idDisc) {
			this.idDisc = idDisc;
		}

		public String getNome() {
		    return nome;
	    }

	    public void setNome(String nome) {
		    this.nome = nome;
	    }

	    public String getCurso() {
		    return curso;
	    }

	    public void setCurso(String curso) {
		    this.curso = curso;
	    }

	    public int getSemestre() {
		    return semestre;
	    }

	    public void setSemestre(int semestre) {
		    this.semestre = semestre;
	    }

	    public int getQtdAlunos() {
		    return qtdAlunos;
	    }

	    public void setQtdAlunos(int qtdAlunos) {
		    this.qtdAlunos = qtdAlunos;
	    }
}
