package lab01.zad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PsikusImpl implements Psikus {

	public Integer cyfrokrad(Integer liczba) {
		Integer result = null;
		String strLiczba = Integer.toString(liczba);
		int strLength = strLiczba.length();
		if (strLength > 1) {
			int index = (int)(Math.random() * strLength);
			String strNowaLiczba = strLiczba.substring(0, index) + strLiczba.substring(index + 1);
			result = Integer.parseInt(strNowaLiczba);
		}
		return result;
	}

	public Integer hultajchochla(Integer liczba) throws NieudanyPsikusException {
		String strLiczba = Integer.toString(liczba);
		int strLength = strLiczba.length();
		char[] characters = strLiczba.toCharArray();
		if (strLength > 1) {
			int idx1 = 0;
			int idx2 = 1;
			if (strLength > 2) {
				idx1 = (int)(Math.random() * strLength);
				do {
					idx2 = (int)(Math.random() * strLength);
				} while (idx1 == idx2);
			}
			char temp = characters[idx1];
			characters[idx1] = characters[idx2];
			characters[idx2] = temp;
		} else {
			throw new NieudanyPsikusException();
		}
		return Integer.parseInt(new String(characters));
	}

	public Integer nieksztaltek(Integer liczba) {
		String strLiczba = Integer.toString(liczba);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(3, 8);
		map.put(7, 1);
		map.put(6, 9);
		List<Integer> valuesList = new ArrayList<Integer>(map.keySet());
		int index = new Random().nextInt(valuesList.size());
		Integer chosenIndex = valuesList.get(index);
		strLiczba = strLiczba.replace(Integer.toString(chosenIndex), Integer.toString(map.get(chosenIndex)));
		return Integer.parseInt(strLiczba);
	}

}
