package training.chap3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class _2_CreatorReference {

	public static Map<String, Function<Integer, Fruit>> map = new HashMap<>();

	static {
		map.put("apple", Apple::new);
		map.put("orange", Orange::new);
	}

	public static Fruit giveMeFruit(String fruit, Integer weight) {
		return map.get(fruit.toLowerCase())
				.apply(weight);
	}

	public static void main(String[] args) {
		Fruit f = giveMeFruit("apple", 10);
		System.out.println(f);
		System.out.println(map.get("apple"));
	}

	interface Fruit {
	}

	static class Apple implements Fruit {
		int weight;
		public Apple(){}
		public Apple(int i){ weight = i;}

		@Override
		public String toString() {
			return String.valueOf(weight);
		}
	}

	static class Orange implements Fruit {
		int weight;
		public Orange(){}
		public Orange(int i){weight = i;}

		@Override
		public String toString() {
			return String.valueOf(weight);
		}
	}
}
