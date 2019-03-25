package sistema;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Funcionario;

public class Programa {

	public static void main(String[] args) {

		List<Funcionario> nomes = new ArrayList<>();
		String caminho = "c:\\temp\\nomes.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				Funcionario f = new Funcionario(campos[0], Double.valueOf(campos[1]));
				nomes.add(f);
				linha = br.readLine();
			}
			Collections.sort(nomes);
			for (Funcionario func : nomes) {
				System.out.println(func.getNome() + func.getSalario());
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
