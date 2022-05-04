package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Friend> fList = new ArrayList<Friend>();

		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i < 3; i++) {

			String str = sc.nextLine();

			if (str == null) {
				break;
			}
			String[] info = str.split(" ");
			Friend f = new Friend(info[0], info[1], info[2]);

			fList.add(f);

		}

		for (Friend i : fList) {
			i.showInfo();
		}

		sc.close();
	}

}
