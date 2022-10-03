class Exercice9 {
    public static void main(String[] args) {
        int matriX[][] = new int[10][10];
        boolean zero_contRows = false;
        boolean zero_contCol = false;
        int cont_fila = 0;
        int cont_col = 0;

        for (int i = 0; i < matriX.length; i++) { // i = rows
            for (int col = 0; col < matriX.length; col++) { // col = columns
                matriX[0][4] = 1;
                matriX[2][6] = 1;
                matriX[3][1] = 1;
                matriX[8][6] = 1;
                System.out.print(matriX[i][col]);
            }
            System.out.println();

        }
        for (int i = 0; i < matriX.length; i++) {
            zero_contRows = false;
            for (int col = 0; col < matriX[0].length; col++) {
                if (matriX[i][col] == 1) {
                    zero_contRows = true;
                    break;
                }
            }
            if (!zero_contRows) {
                cont_fila++;
            }
        }
        System.out.println("nº rows all 0= " + cont_fila);

        for (int col = 0; col < matriX[0].length; col++) {
            zero_contCol = false;
            for (int i = 0; i < matriX[0].length; i++) {
                if (matriX[i][col] == 1) {
                    zero_contCol = true;
                    break;
                }
            }
            if (!zero_contCol) {
                cont_col++;
            }
        }
        System.out.println("nº col all 0= " + cont_col);


    }
}

    
