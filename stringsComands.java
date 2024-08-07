
public class stringsComands {

	public static void main(String[] args) {
		
		// COMANDOS DE STRINGS
		String original = "abcde FGHIJ ABC abc DEFG ";  //PADRAO
		String s01 = original.toLowerCase(); // DEIXA MINUSCULO
		String s02 = original.toUpperCase(); // DEIXA MAIUSCULO
		String s03 = original.trim(); // TIRA ESPAÇOS DAS PONTAS
		String s04 = original.substring(2); //COMEÇA DA SEGUNDA POSIÇÃO
		String s05 = original.substring(2, 9); // *      * E TERMINA NA NONA
		String s06 = original.replace('a', 'x'); // TROCA QUALQUER a POR x
		String s07 = original.replace("abc", "xy"); // TROCA QUALQUER abc POR xy
		int i = original.indexOf("bc"); // MOSTRA A PRIMEIRA POSIÇAÕ DE UM bc
		int j = original.lastIndexOf("bc"); // MOSTRA A ULTIMA POSIÇÃO DE UM bc
		
		
		
		// SAIDAS
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

	}

}
