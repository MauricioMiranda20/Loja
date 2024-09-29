package loja;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Service.CalcularService;
import entities.Product;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\PC\\Documents\\price.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String te = br.readLine();
			
			while(te != null) {
				String[] s = te.split(",");
				list.add(new Product(s[0],Double.parseDouble(s[1])));
				//System.out.println(te); 
				te = br.readLine();
			}
			Product x = CalcularService.max(list);
			System.out.println(x);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
