package sistema;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		String caminho = "c:\\temp\\nomes.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String nome = br.readLine();
			while (nome != null) {
				nomes.add(nome);
				nome = br.readLine();
			}
			Collections.sort(nomes);
			for (String string : nomes) {
				System.out.println(string);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
