package br.com.yout.beans;

public class Video implements AcoesVideo{
	
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;

	
	//Constructor
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	
	//Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(int avaliacao) {
		int novaAva;
		novaAva = (this.avaliacao + avaliacao) / this.views;
		// Avaliação do vídeo e a média de avaliações que ele tem
		this.avaliacao = novaAva;
	}
	
	public int getViews() {
		return views;
	}
	
	public void setViews(int views) {
		this.views = views;
	}
	
	public int getCurtidas() {
		return curtidas;
	}
	
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	
	// Métodos da interface
	
	@Override
	public void play() {
		this.reproduzindo = true;
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
	}

	@Override
	public void like() {
		this.curtidas ++;
	}


	//Polimorfismo de sobreposição
	@Override
	public String toString() {
		return "Video{" + " titulo=" + titulo + ", avaliações=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo +" }";
	}
	
	
	

}
