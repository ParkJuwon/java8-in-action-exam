package training.chap5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class _1_WordStreamFlat {

	public static void main(String[] args) {
		String[] arrayOfWords = {"GoodBye", "World"};

		Arrays.stream(arrayOfWords).map(word -> word.split("")).collect(toList()).forEach(System.out::println);
		System.out.println(">>>>>>>>>>>>");
		Arrays.stream(arrayOfWords).map(w -> w.split("")).map(Arrays::stream).distinct().collect(toList()).forEach(x -> {
			x.forEach(System.out::println);
			System.out.println(">>>");
		});
		System.out.println(">>>>>>>>>>>>");

		Arrays.stream(arrayOfWords).map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(toList()).forEach(System.out::println);
		System.out.println(">>>>>>>>>>>>");
	}
}
