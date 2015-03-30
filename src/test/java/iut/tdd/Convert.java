package iut.tdd;

import java.util.HashMap;
import java.util.Map;

public class Convert {
	
	static Map<String,String> liste = new HashMap<String,String> ();
	
	static {
		liste.put("0", "zéro");
		liste.put("1", "un");
		liste.put("2", "deux");
		liste.put("3", "trois");
		liste.put("4", "quatre");
		liste.put("5", "cinq");
		liste.put("6", "six");
		liste.put("7", "sept");
		liste.put("8", "huit");
		liste.put("9", "neuf");
		liste.put("10", "dix");
		liste.put("11", "onze");
		liste.put("12", "douze");
		liste.put("13", "treize");
		liste.put("14", "quatorze");
		liste.put("15", "quinze");
		liste.put("16", "seize");
		liste.put("17", "dix sept");
		liste.put("18", "dix huit");
		liste.put("19", "dix neuf");
		liste.put("20", "vingt");
		liste.put("30", "trente");
		liste.put("40", "quarante");
		liste.put("50", "cinquante");
		liste.put("60", "soixante");
		liste.put("70", "soixante dix");
		liste.put("80", "quatre vingt");
		liste.put("90", "quatre vingt dix");
	}
	
	public static String num2text(String input) {
		String ret;
		if (liste.get(input)!=null) {
			return liste.get(input);
			
		} else if(input.substring(0,1).equals("7") || input.substring(0,1).equals("9")){
			ret = Convert.dizaine(input) +" " +liste.get("1"+input.substring(1, 2));
			return ret;
		}
		else if (input.substring(1,2).equals("1")) {
			ret = Convert.dizaine(input) +" et un";
			return  ret;
		} else {
			ret = Convert.dizaine(input)+ " " + liste.get(input.substring(1,2));
			return  ret;
		}
	}
	
	public static String text2num(String input) {
		return null;
	}
	
	public static String dizaine(String m) {
		String n = m.substring(0, 1);
		if(m.equals("71")) {
			return "soixante et";
		} else 	if(n.equals("7")){
			return "soixante";
		} else if(n.equals("9")) {
			return "quatre vingt";
		} else {
			return liste.get(n+"0");
		}
	}
}