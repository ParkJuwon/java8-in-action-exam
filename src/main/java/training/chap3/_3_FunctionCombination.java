package training.chap3;

import java.util.function.Function;

public class _3_FunctionCombination {
	Function<String, String> addHeader = Letter::addHeader;
	Function<String, String> transformationPipeline = addHeader.andThen(Letter::checkSpelling).andThen(Letter::addFooter);

}

class Letter {
	public static String addHeader(String text) {
		return "From Raoul, Mario and Alan : " + text;
	}

	public static String addFooter(String text) {
		return text + " Kind regards";
	}

	public static String checkSpelling(String text) {
		return text.replaceAll("labda", "lambda");
	}
}
