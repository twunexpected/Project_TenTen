package com.kh.project_TenTen.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login_OXMain {

		public static void main(String args[]) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int inputNum = Integer.parseInt(br.readLine());
			if (inputNum > 0) {
				// OX �Է��� ������ �迭
				String[] inputStr = new String[inputNum];
				// ���� �ջ��� ������ �迭
				int[] resultArr = new int[inputNum];

				for (int i = 0; i < inputNum; i++) {
					inputStr[i] = br.readLine();

					// OX�� ������ �ٸ� ���� �Է� �� ���Է��ϵ���...
					if (!inputStr[i].matches("^[oOxX]*$")) {
						i--;
					} else {
						int score = 0;
						// �Է��� OX ������ŭ �ݺ��� ����
						for (int j = 0; j < inputStr[i].length(); j++) {
							if (inputStr[i].substring(j, j+1).equalsIgnoreCase("O")) {
								score++;
							} else {
								score = 0;
							}
							// ���� ������ �����Ѵ�.
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
