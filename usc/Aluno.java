package usc;

public class Aluno {

		// Atributos

		private String nome;
		private String bairro;
		private Integer experiencia;
		private String nivel;
		private Integer vitorias, derrotas, empates;

		// Métodos Públicos
		
		public void apresentar() {
			System.out.println("-------------------------------------------");
			System.out.println("Vem aí " + this.getNome());
			System.out.println("Diretamente de " + this.getBairro());
			System.out.println("Com " + this.getVitorias() + " vitórias,");
			System.out.println(this.getEmpates() + " empates e");
			System.out.println(this.getDerrotas() + " derrotas.");

		}

		public void status() {
			System.out.println(this.getNome() + " é um Aluno nível " + this.getNivel());
			System.out.println("Ganhou " + this.getVitorias() + " vezes");
			System.out.println("Perdeu " + this.getDerrotas() + " vezes");
			System.out.println("Empatou " + this.getEmpates() + " vezes");
		}

		public void ganharDuelo() {
			this.setVitorias(this.getVitorias() + 1);
			this.setExperiencia(this.getExperiencia() + 3);
		}

		public void perderDuelo() {
			this.setDerrotas(this.getDerrotas() + 1);
			this.setExperiencia(this.getExperiencia() + 1);
		}

		public void empatarDuelo() {
			this.setEmpates(this.getEmpates() + 1);
			this.setExperiencia(this.getExperiencia() + 1);
		}

		// Métodos Especiais

		public Aluno(String nome, String bairro, int experiencia, int vitorias, int derrotas, int empates) {
			this.nome = nome;
			this.bairro = bairro;
			this.setExperiencia(experiencia);
			this.vitorias = vitorias;
			this.derrotas = derrotas;
			this.empates = empates;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public int getExperiencia() {
			return experiencia;
		}

		public void setExperiencia(int experiencia) {
			this.experiencia = experiencia;
			this.setNivel();
		}

		public String getNivel() {
			return nivel;
		}

		private void setNivel() {
			if (this.experiencia <= 50) {
				this.nivel = "Pequeno Aprendiz";
			} else if (this.experiencia >= 70) {
				this.nivel = "Fullstack Master";
			} else if (this.experiencia >= 90) {
				this.nivel = "Dev das Galáxias";
			}
		}

		public int getVitorias() {
			return vitorias;
		}

		public void setVitorias(int vitorias) {
			this.vitorias = vitorias;
		}

		public int getDerrotas() {
			return derrotas;
		}

		public void setDerrotas(int derrotas) {
			this.derrotas = derrotas;
		}

		public int getEmpates() {
			return empates;
		}

		public void setEmpates(int empates) {
			this.empates = empates;
		}


}
