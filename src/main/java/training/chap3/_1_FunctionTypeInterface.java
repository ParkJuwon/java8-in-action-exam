package training.chap3;

public class _1_FunctionTypeInterface {


	public static void main(String[] ars) {
		Runnable r1 = () -> System.out.println("Hello World 1"); // 람다 사용
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World 2");
			}
		}; // 익명 클래스 사용

		process(r1);
		process(r2);
		process(() -> System.out.println("Hello World 3"));
	}


	public static void process(Runnable r) {
		r.run();
	}


}
