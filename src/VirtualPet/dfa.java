package VirtualPet;

import java.util.Scanner;

public class dfa {
    static int pilihan;
    static String kondisi;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        /* Definisi Formal :
        P1 = ({Lapar, Kenyang, Senang, Sedih, Kotor, Bersih}, { Makan, Tidur, Bermain, Mandi}, δ, Lapar, {Kenyang, Senang, Bersih})
        Q = {Lapar, Kenyang, Senang, Sedih, Kotor, Bersih}
        Σ = {Makan, Tidur, Bermain, Mandi}
        S = Lapar
        F = {Kenyang, Senang, Bersih}
        */

        Lapar(); // <- State Awal (S)
    }

    public static void aksi() {
        println("Apa yang akan Laura lakukan?\n1. Memberinya kuaci\n2. Menyuruhnya tidur\n3. Membiarkannya bermain Running Wheel\n4. Menyuruhnya untuk membersihkan diri");
        print("Masukkan pilihan : "); pilihan = input.nextInt();
        print("Apakah ingin melanjutkan? (y/N) : "); kondisi = input.next();
        println("------------------------------------------------------------------------------------------------");
    }

    public static void Lapar() {
        println("Hamtaro menggerogoti kandangnya, tandanya Ia sedang atau masih kelaparan. Ia sangat ingin kuaci!");
        aksi();
        if(kondisi.equals("y")) {
            if(pilihan == 1) {
                makanDelayedText();
                Kenyang();
            } else if(pilihan == 2) {
                tidurDelayedText();
                Lapar();
            } else if(pilihan == 3) {
                bermainDelayedText();
                Lapar();
            } else if(pilihan == 4) {
                mandiDelayedText();
                Lapar();
            }
        } else if(kondisi.equals("N")) {
            println("Hamtaro akan terus kelaparan :(");
            println("Status : REJECTED");
        }
    }

    public static void Kenyang() {
        println("Hamtaro merasa kenyang, Ia sudah memakan banyak kuaci. Yummy~~~");
        aksi();
        if(kondisi.equals("y")) {
            if(pilihan == 1) {
                makanDelayedText();
                Kenyang();
            } else if(pilihan == 2) {
                tidurDelayedText();
                Lapar();
            } else if(pilihan == 3) {
                bermainDelayedText();
                Senang();
            } else if(pilihan == 4) {
                mandiDelayedText();
                Bersih();
            }
        } else if(kondisi.equals("N")) {
            println("Terima kasih Laura! Hamtaro merasa kenyang ...");
            println("Status : ACCEPTED"); // <- State Akhir (FINAL)
        }
    }

    public static void Senang() {
        println("Hamtaro merasa sangat senang!");
        aksi();
        if(kondisi.equals("y")) {
            if(pilihan == 1) {
                makanDelayedText();
                Kenyang();
            } else if(pilihan == 2) {
                tidurDelayedText();
                Lapar();
            } else if(pilihan == 3) {
                bermainDelayedText();
                Senang();
            } else if(pilihan == 4) {
                mandiDelayedText();
                Senang();
            }
        } else if(kondisi.equals("N")) {
            println("Terima kasih Laura! Hamtaro merasa sangat senang");
            println("Status : ACCEPTED"); // <- State Akhir (FINAL)
        }
    }

    public static void Sedih() {
        println("Hamtaro merasa dirinya sangat sedih, Ia membutuhkan Laura");
        aksi();
        if(kondisi.equals("y")) {
            if(pilihan == 1) {
                makanDelayedText();
                Sedih();
            } else if(pilihan == 2) {
                tidurDelayedText();
                Sedih();
            } else if(pilihan == 3) {
                bermainDelayedText();
                Senang();
            } else if(pilihan == 4) {
                mandiDelayedText();
                Bersih();
            }
        } else if(kondisi.equals("N")) {
            println("Huhu... Hamtaro merasa sedih :(");
            println("Status : REJECTED");
        }
    }

    public static void Kotor() {
        println("Duh! Hamtaro sangat kotor sekali");
        aksi();
        if(kondisi.equals("y")) {
            if(pilihan == 1) {
                makanDelayedText();
                Kotor();
            } else if(pilihan == 2) {
                tidurDelayedText();
                Kotor();
            } else if(pilihan == 3) {
                bermainDelayedText();
                Kotor();
            } else if(pilihan == 4) {
                mandiDelayedText();
                Bersih();
            }
        } else if(kondisi.equals("N")) {
            println("Duh.. Hamtaro merasa badannya kotor!");
            println("Status : REJECTED");
        }
    }

    public static void Bersih() {
        println("Wow! badan Hamtaro bersih sekali");
        aksi();
        if(kondisi.equals("y")) {
            if(pilihan == 1) {
                makanDelayedText();
                Kotor();
            } else if(pilihan == 2) {
                tidurDelayedText();
                Kotor();
            } else if(pilihan == 3) {
                bermainDelayedText();
                Kotor();
            } else if(pilihan == 4) {
                mandiDelayedText();
                Bersih();
            }
        } else if(kondisi.equals("N")) {
            println("Terima kasih Laura! badan Hamtaro terasa bersih :D");
            println("Status : ACCEPTED"); // <- State Akhir (FINAL)
        }
    }

    public static String println(String text) {
        System.out.println(text);
        return text;
    }

    public static String print(String text) {
        System.out.print(text);
        return text;
    }

    public static void delayedText() {
        try {
			Thread.sleep(3000);
		}
		catch (InterruptedException ex) 
		{ 
			// do nothing 
		}
    }

    public static void makanDelayedText() {
        println("Hamtaro sedang memakan kuacinya ...");
        delayedText();
        println("------------------------------------------------------------------------------------------------");
    }

    public static void tidurDelayedText() {
        println("Hamtaro sedang tidur dalam beberapa jam ...");
        delayedText();
        println("------------------------------------------------------------------------------------------------");
    }

    public static void bermainDelayedText() {
        println("Hamtaro sedang bermain Running Wheel selama beberapa menit ...");
        delayedText();
        println("------------------------------------------------------------------------------------------------");
    }

    public static void mandiDelayedText() {
        println("Hamtaro sedang membersihkan dirinya dengan pasir Zeolite ...");
        delayedText();
        println("------------------------------------------------------------------------------------------------");
    }

}
