package Service;

import java.util.List;

public class CalcularService {

		public static <T extends Comparable<T>> T max(List<T> list){
			if(list.isEmpty()) {
				 throw new IllegalStateException("Not found");
			}
			T max = list.get(0);
			for(T lista : list) {
				if(lista.compareTo(max) > 0) {
					lista = max;
				}
			}
			return max;
		}
}
