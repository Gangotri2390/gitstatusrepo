package com.practice;

public class Gangotri {

	public static void main(String []args) {
		int s=4;
		for(int i=1;i<=s;i++) {
			for (int j=s;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		for(int i=1;i<=s-1;i++) {
			for (int m=1;m<=i;m++) {
				System.out.print(" ");
			}
			for(int n=3;n>=i;n--) {
				System.out.print(" *");
			}
			System.out.println("");
	}
}
}