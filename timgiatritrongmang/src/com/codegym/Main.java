package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Array element = new Array();
	element.getData();
	element.getResult();
    }
}
class Array{
    private String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
    private String elem;
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ten muon kiem tra: ");
        elem = scanner.nextLine();
    }
    public void getResult(){
        for(int i = 0; i < students.length; i++){
           if(elem == students[i]){
                System.out.println(students[i]+" xuat hien vi tri thu: "+i);
            }
        }
    }
}