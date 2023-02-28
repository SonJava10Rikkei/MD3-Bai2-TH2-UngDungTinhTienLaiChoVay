package rikkei.academy;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;             //Tien gui
        int month = 1;                  //Thang gui
        double interestRate = 1.0;      // Ty le lai suat
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so tien dau tu");
        money = input.nextDouble();
        System.out.println("Nhap so thang dau tu");
        month = input.nextInt();
        System.out.println("Nhập lãi suất hàng năm theo tỷ lệ phần trăm");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Tien Lai Cho vay la " + totalInterest);
    }
}
