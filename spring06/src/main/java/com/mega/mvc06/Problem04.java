package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

public class Problem04 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요?");
		try {
//			System.out.println("2. 문제 발생 줄..~~~" + 10/0);
			FileWriter file = new FileWriter("d:\test.txt");
			file.write("내가 첫 줄\n");
			file.write("내가 둘째 줄\n");
			file.close();
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
		} catch (IOException e2) { //InputOutput
			System.out.println("파일에 쓰는 중 에러 발생...@@@");
		} catch (Exception e) { //exception e가 제일 포괄적인 것이므로 제일 아래에 써야한다.
			System.out.println("모든 에러를 처리함...");
		} finally {
			//에러가 발생 유무와는 상관없이 반드시 꼭!! 실행해줘야하는 부분은 여기에 넣음.
			//.close()같은 것들.
			System.out.println("휴~~~~~~예외처리 다 했음...");
		}
		System.out.println("3. 나도 프린트 될까요?");
	}

}
