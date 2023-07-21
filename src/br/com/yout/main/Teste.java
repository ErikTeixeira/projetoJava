package br.com.yout.main;

import br.com.yout.beans.Gafanhoto;
import br.com.yout.beans.Video;
import br.com.yout.beans.Vizualizacao;

public class Teste {

	public static void main(String[] args) {

		Video v[] = new Video[3];
		
		v[0] = new Video("Aula de programação");
		v[1] = new Video("Como fazer biscoitos");
		v[2] = new Video("Ferrari mais cara");
		
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] =  new Gafanhoto("Jubileu", 22, "M", "Juba");
		g[1] = new Gafanhoto("Creuza", 40, "F", "Creuzita");
		
		
		Vizualizacao vis[] = new Vizualizacao[5];
		vis[0] = new Vizualizacao(g[0], v[2]);    // Jubileu assiste Ferrari
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Vizualizacao(g[0], v[2]);  // Jubileu assiste Aula
		vis[1].avaliar(8);
		System.out.println(vis[1].toString());
		
		
		//Transformar v[0] em string
		/*System.out.println("Vídeos\n-----------------------");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		
		System.out.println("\nGafanhotos\n-----------------------");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString()); */
		
		
		
	}

}
