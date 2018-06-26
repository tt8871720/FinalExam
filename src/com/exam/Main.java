package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public Main() {
		List<Food> food = new ArrayList<>();
		int a = 1;
		int money = 0;
		while (a != 0) {
			System.out.println("請輸入餐點:");
			Scanner scanner = new Scanner(System.in);
			int meal = scanner.nextInt();
			if (meal == 0) {
				a = 0;
				for (int i = 0; i < food.size(); i++) {
					if (meal == i + 1) {
						Food f = food.get(i);
						String n = f.getName();
						System.out.println("請輸入數量:");
						int count = scanner.nextInt();
						System.out.println(n + "    " + count + "份");
						a = 0;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Oder oder = new Oder();
		try {
			String line;
			FileReader fr = new FileReader("menu.txt");
			BufferedReader bf = new BufferedReader(fr);
			while ((line = bf.readLine()) != null) {
				String[] token = line.split(",");
				int id = Integer.parseInt(token[0]);
				String name = token[1];
				int price = Integer.parseInt(token[2]);
				int kcal = Integer.parseInt(token[3]);
				oder.food.add(new Food(id, name, price, kcal));
				continue;
			}
			int b = 1;
			while (b != 0) {

				oder.show();
				System.out.println("0) 結算");
				System.out.println("q) 離開(結束程式)");
				new Main();
			//	oder.Buy();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
