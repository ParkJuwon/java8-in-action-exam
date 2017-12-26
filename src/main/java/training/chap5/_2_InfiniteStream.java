package training.chap5;

import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _2_InfiniteStream {

	public static void main(String[] args) {
		Stream.iterate(0, n -> n+2).limit(10).forEach(System.out::println);

		String result = Stream.iterate(new int[]{0,1}, n ->  new int[]{n[1], n[0] + n[1]})
		.limit(20)
		.map(t -> "(" + t[0]+","+t[1] +")").collect(Collectors.joining(","));
		System.out.println(result);

		Stream.generate(Math::random).limit(5).forEach(System.out::println);

		IntSupplier fib = new IntSupplier() {
			private int previous = 0;
			private int current = 1;
			@Override
			public int getAsInt() {
				int oldPrevious = this.previous;
				int nextValue = this.previous + this.current;
				this.previous = this.current;
				this.current = nextValue;
				return oldPrevious;
			}
		};

		IntStream.generate(fib).limit(10).forEach(System.out::println);
	}
}
