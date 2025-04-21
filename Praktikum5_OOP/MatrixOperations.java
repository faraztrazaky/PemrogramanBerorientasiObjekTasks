import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A, B, C;
        int baris, kolom;
        int choice;

        System.out.print("Input baris matrix A = ");
        baris = sc.nextInt();
        System.out.print("Input kolom matrix A = ");
        kolom = sc.nextInt();

        A = new int[baris][kolom];
        System.out.println("Input elemen matrix A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.print("Input baris matrix B = ");
        int barisB = sc.nextInt();
        System.out.print("Input kolom matrix B = ");
        int kolomB = sc.nextInt();

        B = new int[barisB][kolomB];
        System.out.println("Input elemen matrix B:");
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Penjumlahan Matriks A + B");
            System.out.println("2. Transpos Matriks (A + B)");
            System.out.println("3. Perkalian Matriks A x B");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (baris == barisB && kolom == kolomB) {
                        C = new int[baris][kolom];
                        System.out.println("Hasil penjumlahan matriks A + B:");
                        for (int i = 0; i < baris; i++) {
                            for (int j = 0; j < kolom; j++) {
                                C[i][j] = A[i][j] + B[i][j];
                                System.out.print(C[i][j] + "\t");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Ukuran matriks A dan B harus sama untuk penjumlahan!");
                    }
                    break;

                case 2:
                    if (baris == barisB && kolom == kolomB) {
                        C = new int[baris][kolom];
                        for (int i = 0; i < baris; i++) {
                            for (int j = 0; j < kolom; j++) {
                                C[i][j] = A[i][j] + B[i][j];
                            }
                        }
                        System.out.println("Hasil transpos matrix C:");
                        for (int i = 0; i < kolom; i++) {
                            for (int j = 0; j < baris; j++) {
                                System.out.print(C[j][i] + "\t");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Ukuran matriks A dan B harus sama untuk transpos hasil penjumlahan!");
                    }
                    break;

                case 3:
                    if (kolom == barisB) {
                        C = new int[baris][kolomB];
                        System.out.println("Hasil perkalian matriks A x B:");
                        for (int i = 0; i < baris; i++) {
                            for (int j = 0; j < kolomB; j++) {
                                C[i][j] = 0;
                                for (int k = 0; k < kolom; k++) {
                                    C[i][j] += A[i][k] * B[k][j];
                                }
                                System.out.print(C[i][j] + "\t");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Kolom matrix A harus sama dengan baris matrix B untuk perkalian!");
                    }
                    break;

                case 4:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (choice != 4);

        sc.close();
    }
}
