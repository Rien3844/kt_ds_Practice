package com.ktdsuniversity.edu.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class FileReadExam {
	/**
	 * NIO - Java version >= 1.8
	 */
	public static void readAndPrintFileDescriptionUseNIO(String parentPath, String file) {
		// 1. 읽으려는 파일을 특정한다.
		File target = new File(parentPath, file);

		// 2. 파일의 내용을 읽는다.
		// 3. 파일의 내용을 List에 할당한다.
		try {
//			Files.lines(target.toPath());
			List<String> lines = Files.readAllLines(target.toPath());

			// 4. 파일의 내용을 출력한다.
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 단점 : 메모리를 엄청 많이 잡아먹음.
		// 구 방식은 line단위로 chunking 하기에 line단위로 메모리를 먹음.(메모리 소모 적음)
		// but, 신 방식은 간편한 대신 chunking 하지 않으므로 전체의 메모리를 먹음(메모리 소모 많음)
		// Files.lines(target.toPath());를 사용해서 chunking을 통해 메모리 사용량을 줄일 수 있음.
		// (함수 사용, 현재 함수 배우지않은 상태로 사용하기에는 적합하지않음.)
	}

	/**
	 * IO - Java version < 1.8
	 */
	public static void readAndPrintFileDescriptionUseIO(String parentPath, String file) {
		// 1. 읽으려는 파일을 특정.
		File target = new File(parentPath, file);

		// 2. 파일이 존재하는지 확인.
		// 3. & 읽으려는 대상이 진짜 파일이 맞는지 확인.
		if (target.exists() && target.isFile()) {
			// 4. 파일의 내용을 읽기 시작.
			FileReader fileReader = null;
			BufferedReader bufferedReader = null;
			try {
				// 4-1. 파일의 byte를 Chunking해서 가져온다.
				fileReader = new FileReader(target);

				// 4-2. 파일의 내용을 String으로 변환한다.
				bufferedReader = new BufferedReader(fileReader);

				String line = null;
				while (true) {
					line = bufferedReader.readLine();// 한 줄을 읽어온다.
					// 언제 끝날지 모르는 파일을 끝(EOF, End Of File)까지 읽어야되기에 while문 사용.
					// EOF까지 갔는냐?
					if (line == null) {
						break;
					} else {// null이 아니다 => 데이터가 있다.
						System.out.println(line);
					}
				}

			} catch (IOException ioe) {// 내가 읽으려는 파일이 존재하지 않을 때 발생.
				ioe.printStackTrace();
				// FileReader의 throw FileNotFoundException의 부모와
				// readLine의 throw IOException이 같다.
				// => FileNotFoundException에서 IOException으로 변경.
			} finally {
				if (bufferedReader != null) {
					try {
						bufferedReader.close(); // pipe 해제.
					} catch (IOException e) {
					}
				}

				if (fileReader != null) {
					try {
						fileReader.close(); // pice 해제.
					} catch (IOException e) {
					}
				}

			}
			// 4-3. 내용을 출력한다.
		}

	}

	public static void main(String[] args) {
		Properties props = System.getProperties();
		System.out.println(props);
		String homePath = props.get("user.home").toString();
		System.out.println(homePath);
		System.out.println("------------------------------");

		// 운영체제의 정보를 취득
		Map<String, String> env = System.getenv();
		System.out.println(env);
		System.out.println(env.get("JAVA_HOME"));
		System.out.println("------------------------------");
		// C:/Java Exam 폴더의 정보를 추출.
		System.out.println(File.separator);
		File directory = new File(homePath + File.separator + "Java Exam");
		System.out.println("------------------------------");

		// 1. 폴더의 이름을 출력.
		String directoryName = directory.getName();
		System.out.println(directoryName + " : directoryName");
		System.out.println("------------------------------");

		// 2. 이 경로가 가리키는 것이 파일인지 폴더인지 구분.
		boolean isFile = directory.isFile();
		// isFile의 값이 true이면 파일이다, false면 아니다.(여기서는 폴더니까 false가 맞음.)
		System.out.println(isFile + " : isFile");
		System.out.println("------------------------------");

		boolean isDirectory = directory.isDirectory();
		// isDirectory의 값이 true이면 폴더이다, false면 아니다.
		System.out.println(isDirectory + " : isDirectory");
		System.out.println("------------------------------");

		// 3. 이 경로가 실제로 존재하는 것인지.
		boolean exists = directory.exists();
		// exists가 true이면 존재하는 폴더, false이면 존재하지 않는 폴더.
		System.out.println(exists + " : exists");
		System.out.println("------------------------------");

		// 4. 이 경로의 크기(폴더의 크기) 출력.
		long bytes = directory.length();
		// 폴더의 크기는 byte로 계산되기에 1mb = 1024*1024 ==> long으로 계산해야 계산가능.
		System.out.println(bytes + " : byte");
		System.out.println("------------------------------");

		// C:/Java Exam/Java Exam.txt 파일의 정보를 추출.
		File textFile = new File(homePath + File.separator + "Java Exam", "Java Exam.txt");
		// ,기준으로 앞에있는 것(폴더)에서 뒤에있는 것(파일)을 가져와라.
		// 1. 파일의 이름을 출력한다.
		String fileName = textFile.getName();
		System.out.println(fileName + " : fileName");
		System.out.println("------------------------------");

		// 2. 파일이 폴더인지 파일인지 구분해서 출력한다.
		boolean isRFile = textFile.isFile();
		System.out.println(isRFile + " : isRFile");
		System.out.println("------------------------------");

		// 3. 이 파일이 실제 존재하는 것인지 출력한다.
		boolean isExists = textFile.exists();
		System.out.println(isExists + " : isExists");
		System.out.println("------------------------------");
		// 4. 이 파일의 크기를 출력한다.
		long fileBytes = textFile.length();
		System.out.println(fileBytes + " : fileBytes");
		System.out.println("------------------------------");

		// 5. 이 파일이 있는 부모의 경로를 출력한다.
		// - 첫번째 방법
		String parentPath = textFile.getParent();
		System.out.println(parentPath + " : parentPath");
		// - 두번째 방법
		File parentFile = textFile.getParentFile();
		System.out.println(parentFile + " : parentFile");
		System.out.println("------------------------------");

		// 6. 이 파일의 경로를 출력한다.
		String textFilePath = textFile.getAbsolutePath();
		System.out.println(textFilePath + " : textFilePath");
		System.out.println("------------------------------");

		System.out.println("FIO");
		readAndPrintFileDescriptionUseIO(homePath + File.separator + "Java Exam", "Java Exam.txt");

		System.out.println("------------------------------");

		System.out.println("FNIO");
		readAndPrintFileDescriptionUseNIO(homePath + File.separator + "Java Exam", "Java Exam.txt");
	}

}
