
public class Matrix {

    private double[][] matrix;

    public Matrix(double[][] items) {
        matrix = items;
    }

    public double getElement(int row, int grid) {
        return matrix[row][grid];
    }

    public void setElement(double data, int row, int grid) {

        matrix[row][grid] = data;
    }

    public double[][] summ(double[][] items) {
        if (isCorrect(items)) {
            operationSum(items);
        } else {
            return null;
        }
        return matrix;
    }

    public double[][] difference(double[][] items) {
        if (isCorrect(items)) {
            operationDifferense(items);
        } else {
            return null;
        }
        return matrix;
    }
    //////////////////////////////////////////////////////////////////////////////////////////

    private boolean isCorrect(double[][] items) {
        boolean check = false;
        if (items != null) {
            if ((matrix.length == items.length) && (matrix[0].length == items[0].length)) {
                check = true;
                return check;
            } else {
                return check;
            }
        }
        return check;
    }

    private double[][] operationSum(double[][] items) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] += items[i][j];
            }
        }
        return matrix;
    }

    private double[][] operationDifferense(double[][] items) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] -= items[i][j];
            }
        }
        return matrix;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    public double[][] multiply(double[][] secondMylty) {
        if (matrix == null || secondMylty == null) {
            return null;
        }
        if ((matrix.length < secondMylty[0].length) || (secondMylty.length < matrix[0].length))
            return null;
        double[][] result = new double[matrix.length][secondMylty[0].length];
        if (matrix[0].length >= secondMylty[0].length) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    for (int k = 0; k < result.length; k++) {
                        result[i][j] += matrix[i][k] * secondMylty[k][j];
                    }
                }
            }
        }
        return result;
    }

    private boolean IsSquare(double[][] items) {
        if (matrix[0].length == matrix.length) {
            return true;
        } else
            return false;
    }

    public double determinant() {
        double determinant = 1.0;
        double[][] worker = new double[matrix.length][matrix.length];
        if (!IsSquare(matrix)) {
            return 0;
        }
        if (!isCorrect(worker)) {
            return 0;
        } else {
            int[] row = new int[matrix.length];
            double pivot;
            int iPivot;
            double absPivot;
            for (int k = 0; k < matrix.length - 1; k++) {
                pivot = worker[row[k]][k];
                absPivot = Math.abs(pivot);
                iPivot = k;
                searchRowWithMinFirstitem(worker, row, determinant, iPivot, absPivot, pivot);
                chekPivot(worker, row, k, determinant, iPivot);
                checkAbs(absPivot);
                toDiagonal(worker, row, k);
                finalPart(worker, row, k);
                determinant = determinant * pivot;
            }
            return determinant * worker[row[matrix.length - 1]][matrix.length - 1];
        }
    }

    private void searchRowWithMinFirstitem(double[][] worker, int[] row, 
                                           double determinant, int iPivot,
                                           double absPivot, double pivot) {
        for (int k = 0; k < worker.length - 1; k++) {
            pivot = worker[row[k]][k];
            absPivot = Math.abs(pivot);
            iPivot = k;
            for (int i = k; i < worker.length; i++) {
                if (Math.abs(worker[row[i]][k]) > absPivot) {
                    iPivot = i;
                    pivot = worker[row[i]][k];
                    absPivot = Math.abs(pivot);
                }
            }
        }
    }
    private void chekPivot(double[][] worker, int[] row, int k, double determinant, int iPivot) {
        int hold;
        if (iPivot != k) {
            hold = row[k];
            row[k] = row[iPivot];
            row[iPivot] = hold;
            determinant = -determinant;
        }
    }
    private void toDiagonal(double[][] worker, int[] row, int k) {
        for (int j = k + 1; j < worker.length; j++) {
            worker[row[k]][j] = worker[row[k]][j] / worker[row[k]][k];
        }
    }

    private void finalPart(double[][] worker, int[] row, int k) {
        for (int i = 0; i < worker.length; i++) {
            if (i != k) {
                for (int j = k + 1; j < worker.length; j++) {
                    worker[row[i]][j] = worker[row[i]][j] - worker[row[i]][k] * worker[row[k]][j];
                }
            }
        }
    }

    private double checkAbs(double absPivot) {
        if (absPivot < 1.0E-10) {
            return 0.0;
        }
        return absPivot;
    }

    private int[] searchRowWithFirstMinItem(int[] row) {
        for (int k = 0; k < row.length; k++) {
            row[k] = k;
        }
        return row;
    }

    private double[][] copy(double[][] worker) {
        for (int i = 0; i < worker.length; i++) {
            for (int j = 0; j < worker[0].length; j++) {
                worker[i][j] = matrix[i][j];
            }
        }
        return worker;
    }

    private double considerToDeterminant(int row, int grid) {

        return 0;
    }
}
