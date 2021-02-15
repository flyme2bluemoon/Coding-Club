public class music_player {
    public static int sum(int[][] matrix) {
        int sum = 0;
        for (int[] i : matrix) {
            for (int j : i) {
                sum += j;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {0, 0, 0}
        };

        int[][] new_matrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                new_matrix[j][i] = matrix[i][j];
            }
        }

        for (int[] i : new_matrix) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
        int sum_of_matrix = sum(matrix);
        System.out.println(sum_of_matrix);
    }
}