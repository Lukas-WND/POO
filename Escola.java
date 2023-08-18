
public class Escola {

	public static void main(String[] args) {
		Aluno lukas = new Aluno();
		Aluno isadora = new Aluno();
		Aluno wallace = new Aluno();
		Aluno a;
		
		Curso tads = new Curso();
		Curso licenciaturaQuimica = new Curso();
		Curso processosQuimicos = new Curso();
		
		Departamento dpt = new Departamento();
		// Cursos
		tads.sigla = "TADS";
		tads.nome = "Tecnologia em Análise e Desenvolvimento de Sistemas";
		tads.duracao = 6;
		
		licenciaturaQuimica.sigla = "LQ";
		licenciaturaQuimica.nome = "Licenciatura em Química";
		licenciaturaQuimica.duracao = 8;
		
		processosQuimicos.sigla = "PQ";
		processosQuimicos.nome = "Processos Qúmicos";
		processosQuimicos.duracao = 8;
		
		// Alunos
		
		lukas.nome = "Lukas";
		lukas.matricula = "2023002108";
		lukas.curso = tads;
		
		isadora.nome = "Isadora";
		isadora.matricula = "2022004056";
		isadora.curso = licenciaturaQuimica;
		
		wallace.nome = "Wallace";
		wallace.matricula = "2023005621";
		wallace.curso = processosQuimicos;
		
		a = isadora; // Não é uma cópia, 'a' recebe a própria instância de isadora;
		//a.curso = "Direito"; // Altera o valor do atributo de isadora
		
		mostrarAluno(lukas);
		mostrarAluno(isadora);
		mostrarAluno(wallace);
		mostrarAluno(a);
	}
	
	public static void mostrarAluno(Aluno aluno) {
		System.out.println("Aluno: " + aluno.nome + ", matricula: " + aluno.matricula + ", curso: " + aluno.curso.nome);
	}
	
}
