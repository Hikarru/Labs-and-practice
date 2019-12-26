package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
	    Person prs = new Person("Ivanov");
	    System.out.println(prs);
	    Person prs2 = new Person("Petrov", "Petr", "Vasilievich");
	    System.out.println(prs2);

	    Address address = new Address("Russia;Moscow;Moscow;Kievskaya;14;1-50");
	    System.out.println(address);

	    String[] shirts = new String[11]; //массив строк для информации о футболках
		shirts[0] = "S001,Black Polo Shirt,Black,XL";
		shirts[1] = "S002,Black Polo Shirt,Black,L";
		shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
		shirts[3] = "S004,Blue Polo Shirt,Blue,M";
		shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
		shirts[5] = "S006,Black T-Shirt,Black,XL";
		shirts[6] = "S007,White T-Shirt,White,XL";
		shirts[7] = "S008,White T-Shirt,White,L";
		shirts[8] = "S009,Green T-Shirt,Green,S";
		shirts[9] = "S010,Orange T-Shirt,Orange,S";
		shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
		Shirt[] shirt = new Shirt[]{new Shirt(shirts[0]),
									new Shirt(shirts[1]),
									new Shirt(shirts[2]),
									new Shirt(shirts[3]),
									new Shirt(shirts[4]),
									new Shirt(shirts[5]),
									new Shirt(shirts[6]),
									new Shirt(shirts[7]),
									new Shirt(shirts[8]),
									new Shirt(shirts[9]),
									new Shirt(shirts[10]),};
		for (int i = 0; i < shirt.length; i++)
			System.out.println("Shirt " + i + "\n" + shirt[i]);

		PhoneNumber phoneNumber = new PhoneNumber("89253744243");
		System.out.println(phoneNumber);
		PhoneNumber phoneNumber1 = new PhoneNumber("+19163584393");
		System.out.println(phoneNumber1);

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
		String fileName = "C:\\Users\\Hikaru\\Desktop\\text.txt";
		Stream<String> lines = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8);
		String data = lines.collect(Collectors.joining(" "));

		String[] s = data.split(" ");
		//System.out.println(data.toString());

		StringBuilder result = getLine(s);
		System.out.println(result.toString());
    }

	public static StringBuilder getLine(String... words) {
		StringBuilder sb = new StringBuilder();
		String[] w;
		if(words==null||words.length==0)return sb;
		else w = words;
		sb.append(w[0]);
		for (int j = 0; j < w.length; j++) {

			for (int i = 1; i < w.length; i++) {
				if(w[i].length()==0)continue;
				if(sb.toString().toLowerCase().charAt(0) == w[i].toLowerCase().charAt(w[i].length()-1)){
					sb.insert(0, w[i] + " ");
					w[i] = "";
				}
				else if(sb.toString().toLowerCase().charAt(sb.length()-1) == w[i].toLowerCase().charAt(0)){
					sb.append(" " + w[i]);
					w[i] = "";
				}
			}

		}
		return sb;
	}
}
