package br.com.yout.main;

import br.com.yout.beans.Gafanhoto;
import br.com.yout.beans.Video;

public class Teste {

	public static void main(String[] args) {

		Video v[] = new Video[3];
		
		v[0] = new Video("Aula de programação");
		v[1] = new Video("Como fazer biscoitos");
		v[2] = new Video("Ferrari mais cara");
		
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] =  new Gafanhoto("Jubileu", 22, "M", "Juba");
		g[1] = new Gafanhoto("Creuza", 40, "F", "Creuzita");
		
		//Transformar v[0] em string
		System.out.println(v[0].toString());
		System.out.println(g[0].toString());

	}

}
