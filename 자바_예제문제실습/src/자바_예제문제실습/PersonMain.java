package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonMain {
	public void fileSave(String 파일이름) {
		File file = new File(파일이름);
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			Person person = new Person("김영희",10);
			bw.write(person.toString());
			bw.close();
			System.out.println("파일을 저장했습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		PersonMain 사람파일 = new PersonMain();
		사람파일.fileSave("person.txt");
		
	}
	
}
