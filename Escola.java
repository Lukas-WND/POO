public class Escola {

	public static void main(String[] args) {
		Aluno lukas = new Aluno();
		Aluno isadora = new Aluno();
		Aluno wallace = new Aluno();
		Aluno a;
		
		Curso tads = new Curso();
		Curso licenciaturaQuimica = new Curso();
		Curso processosQuimicos = new Curso();
		
		Departamento daic = new Departamento();
		Departamento dqa = new Departamento();
		Departamento dqi = new Departamento();
		Departamento dainfra = new Departamento();
		
		Campus cmc = new Campus();
		Campus cmdi = new Campus();
		Campus cmzl = new Campus();
		
		// Campus
		
		cmc.sigla = "CMC";
		cmc.nome = "Campus Manaus Centro";
		cmc.cidade = "Manaus";
		cmc.bairro = "Centro";
		
		cmdi.sigla = "CMDI";
		cmdi.nome = "Campus Manaus Distrito Industrial";
		cmdi.cidade = "Manaus";
		cmdi.bairro = "Distrito Industrial";
		
		cmzl.sigla = "CMZL";
		cmzl.nome = "Campus Manaus Zona Leste";
		cmzl.cidade = "Manaus";
		cmzl.bairro = "São José Operário";
		
		// Departamentos
		
		daic.sigla = "DAIC";
		daic.nome = "Departamento Acadêmico de Informação e Comunicação";
		daic.campus = cmc;
				
		dqa.sigla = "DQA";
		dqa.nome = "Departamento Acadêmico de Química e Alimentos";
		dqa.campus = cmc;
				
		dqi.sigla = "DQI";
		dqi.nome = "Departamento Acadêmico de Produção Industrial";
		dqi.campus = cmdi;
				
		dainfra.sigla = "DAINFRA";
		dainfra.nome = "Departamento Acadêmico de Infraestrutura";
		dainfra.campus = cmzl;
				
		
		// Cursos
		tads.sigla = "TADS";
		tads.nome = "Tecnologia em Análise e Desenvolvimento de Sistemas";
		tads.duracao = 6;
		tads.departamento = daic;
		
		licenciaturaQuimica.sigla = "LQ";
		licenciaturaQuimica.nome = "Licenciatura em Química";
		licenciaturaQuimica.duracao = 8;
		licenciaturaQuimica.departamento = dqa;
		
		processosQuimicos.sigla = "PQ";
		processosQuimicos.nome = "Processos Qúmicos";
		processosQuimicos.duracao = 8;
		processosQuimicos.departamento = dqa;
		
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
		System.out.println("Aluno: " + aluno.nome 
							+ ", matricula: " + aluno.matricula 
							+ ", curso: " + aluno.curso.nome 
							+ ", do departamento: " + aluno.curso.departamento.sigla
							+ ", do campus: " + aluno.curso.departamento.campus.sigla);
	}
	
}
