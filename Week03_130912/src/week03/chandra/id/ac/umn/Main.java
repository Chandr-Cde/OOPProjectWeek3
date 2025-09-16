package week03.chandra.id.ac.umn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Silakan masukkan nama lengkap Anda: ");
        String namaLengkap = scanner.nextLine();
        System.out.println("-------------------------------------------");

        while (true) {
            System.out.println("\nString anda: \"" + namaLengkap + "\"");
            System.out.println("1.  charAt");
            System.out.println("2.  length");
            System.out.println("3.  substring(n)");
            System.out.println("4.  substring(m,n)");
            System.out.println("5.  contains");
            System.out.println("6.  concat");
            System.out.println("7.  replace");
            System.out.println("8.  split");
            System.out.println("9.  lowercase");
            System.out.println("10. uppercase");
            System.out.print("Pilih menu: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    charAt(namaLengkap, scanner);
                    break;
                case 2:
                    length(namaLengkap);
                    break;
                case 3:
                    substring_n(namaLengkap, scanner);
                    break;
                case 4:
                    substring_mn(namaLengkap, scanner);
                    break;
                case 5:
                    contains(namaLengkap, scanner);
                    break;
                case 6:
                    concat(namaLengkap, scanner);
                    break;
                case 7:
                    replace(namaLengkap, scanner);
                    break;
                case 8:
                    split(namaLengkap, scanner);
                    break;
                case 9:
                    lowercase(namaLengkap);
                    break;
                case 10:
                    uppercase(namaLengkap);
                    break;
                default:
                    System.out.println("Pilih 1-10!");
                    break;
            }
            System.out.println("-------------------------------------------");
        }
    }

    public static void charAt(String nama, Scanner scanner) {
        System.out.print("----- charAt -----");
        System.out.println("\nNama: " + nama);
        System.out.print("Input: ");
        int indeks = scanner.nextInt();
        scanner.nextLine();
        if (indeks >= 0 && indeks < nama.length()) {
            System.out.println("Hasil: " + nama.charAt(indeks));
        } else {
            System.out.println("Error!");
        }
    }

    public static void length(String nama) {
        System.out.print("----- length -----");
        System.out.println("\nNama: " + nama);
        System.out.println("Hasil: " + nama.length());
    }

    public static void substring_n(String nama, Scanner scanner) {
        System.out.print("----- substring(n) -----");
        System.out.println("\nNama: " + nama);
        System.out.print("Input: ");
        int awal = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hasil: \"" + nama.substring(awal) + "\"");
    }

    public static void substring_mn(String nama, Scanner scanner) {
        System.out.print("----- substring(m,n) -----");
        System.out.println("\nNama: " + nama);
        System.out.print("Input mulai: ");
        int awalPotong = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input akhir: ");
        int akhirPotong = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hasil: \"" + nama.substring(awalPotong, akhirPotong) + "\"");
    }

    public static void contains(String nama, Scanner scanner) {
        System.out.print("----- contains -----");
        System.out.println("\nNama: " + nama);
        System.out.print("Input: ");
        String kataCari = scanner.nextLine();
        boolean ada = nama.contains(kataCari);
        System.out.println("Hasil: " + ada);
    }

    public static void concat(String nama, Scanner scanner) {
        System.out.print("----- concat -----");
        System.out.println("\nNama: " + nama);
        System.out.print("Input: ");
        String tambahan = scanner.nextLine();
        String hasilConcat = nama.concat(" ").concat(tambahan);
        System.out.println("Hasil: " + hasilConcat);
    }

    public static void replace(String nama, Scanner scanner) {
        System.out.print("----- replace -----");
        System.out.println("\nNama: " + nama);
        System.out.print("Input kata yang diganti: ");
        String target = scanner.nextLine();
        System.out.print("Input kata pengganti: ");
        String pengganti = scanner.nextLine();
        String hasilReplace = nama.replace(target, pengganti);
        System.out.println("Hasil: " + hasilReplace);
    }

    public static void split(String nama, Scanner scanner) {
        System.out.print("----- split -----");
        System.out.println("\nNama: " + nama);
        System.out.print("Input karakter pemisah: ");
        String pemisah = scanner.nextLine();
        String[] potongan = nama.split(pemisah);
        
        for (String bagian : potongan) {
            System.out.println("Hasil: " + bagian);
        }
    }
    
    public static void lowercase(String nama) {
        System.out.print("----- lowercase -----");
        System.out.println("\nNama: " + nama);
        String hasilLower = nama.toLowerCase();
        System.out.println("Hasil: " + hasilLower);
    }

    public static void uppercase(String nama) {
        System.out.print("----- uppercase -----");
        System.out.println("\nNama: \"" + nama + "\"");
        String hasilUpper = nama.toUpperCase();
        System.out.println("Hasil: " + hasilUpper);
    }
}