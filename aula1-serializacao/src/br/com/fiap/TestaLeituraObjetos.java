package br.com.fiap;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class TestaLeituraObjetos {
	public static void main(String[] args) throws Exception{
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("medicamentos.txt"));
		List<Item> medicamentos= (List<Item>) ois.readObject();
		for (Item med : medicamentos){
			System.out.println(med);
			System.out.println(med.getNome());
			System.out.println(med.getPreco());
			System.out.println("---------------------");
		}
	}
}
