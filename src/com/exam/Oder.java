package com.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oder {
	Scanner scanner = new Scanner(System.in);
List<Food> food  = new ArrayList<>();
List<Food> list = new ArrayList<>();
public void show(){
for (int i = 0; i < food.size(); i++) {
	Food f = food.get(i);
	System.out.println(f.getId()+ "." + f.getName());
}
	
}
/*public void Buy(){
	int a = 1;
	int money = 0;
	while(a != 0){
		System.out.println("請輸入餐點:");
		Scanner scanner = new Scanner(System.in);
		int meal = scanner.nextInt();
		if(meal == 0){
			a = 0;
		for (int i = 0; i < food.size(); i++) {
		if(meal == i+1){
			Food f = food.get(i);
			String n = f.getName();
		System.out.println("請輸入數量:");
		int count = scanner.nextInt();
			System.out.println(n +  "    " + count + "份");
	a = 0;
		}}}}
	}*/
public static void main(String[] args) {
	
	}

}
