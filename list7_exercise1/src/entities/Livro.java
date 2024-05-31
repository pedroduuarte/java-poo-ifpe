package entities;

public class Livro {

	private String autor;
	private String editora;
	private String ibsn;
	private String titulo;
	private Integer ano;
	
	public Livro() {	
	}
	
	public Livro(String autor, String editora, String ibsn,
			String titulo, Integer ano) {
		this.autor= autor;
		this.editora = editora;
		this.ibsn = ibsn;
		this.titulo = titulo;
		this.ano = ano;
		}
	
	public String getAutor() {
		return autor;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getIbsn() {
		return ibsn;
	}
	
	public void setIbsn(String ibsn) {
		this.ibsn = ibsn;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Autor: " + autor + "\n");
		sb.append("Editora: " + editora + "\n");
		sb.append("IBSN: " + ibsn + "\n");
		sb.append("Título: " + titulo + "\n");
		sb.append("Ano de edição: " + ano + "\n");
		
		return sb.toString();
	}
}
