package training.chap1;

import java.io.File;
import java.io.FileFilter;

public class _1_MethodReference {
	public static void main(String[] args) {
		File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.isHidden();
			}
		});

		// 메서드 레퍼런스 사용
		File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);

	}
}
