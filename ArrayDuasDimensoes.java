public class ArrayDuasDimensoes {
	public static void main (String [] args) {
		String[][] duasdim = {{"Carlos", "M", "SP"}, {"Lidiana", "F", "SP"}};
		
		System.out.println(duasdim [0][0]);
		/**
		Os valores presentes nos colchetes são lidos da seguinte maneira: 0 correspondente à primeira casa do array e 1 corresponde à segunda casa do array. Desse modo, no exemplo, serão exibidas as informações: "Carlos" e "Lidiana", pois nos dois arrays o valor 0 corresponde às casas aos quais pertencem. Caso os valores dos colchetes fossem [1] [1], teríamos como resultado a exibição dos valores “M” e “F”
		**/
	}
}