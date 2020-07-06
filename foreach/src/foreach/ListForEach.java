package foreach;

import java.util.ArrayList;
import java.util.List;

public class ListForEach {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("pqr");
		list.add("xyz");

		list.forEach(System.out::println);

	}
}
