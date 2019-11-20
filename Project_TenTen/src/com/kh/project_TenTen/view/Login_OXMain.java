package com.kh.project_TenTen.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login_OXMain {

		public static void main(String args[]) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int inputNum = Integer.parseInt(br.readLine());
			if (inputNum > 0) {
				// OX 입력을 저장할 배열
				String[] inputStr = new String[inputNum];
				// 정답 합산을 저장할 배열
				int[] resultArr = new int[inputNum];

				for (int i = 0; i < inputNum; i++) {
					inputStr[i] = br.readLine();

					// OX를 제외한 다른 문자 입력 시 재입력하도록...
					if (!inputStr[i].matches("^[oOxX]*$")) {
						i--;
					} else {
						int score = 0;
						// 입력한 OX 개수만큼 반복문 수행
						for (int j = 0; j < inputStr[i].length(); j++) {
							if (inputStr[i].substring(j, j+1).equalsIgnoreCase("O")) {
								score++;
							} else {
								score = 0;
							}
							// 최종 점수를 저장한다.
							resultArr[i] += score;
						}
					}
				}
				for (int resultScore : resultArr) {
					System.out.println(resultScore);
				}
			}
		}
}
