
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

	public double[][] summ(double[][] summer) {
		if (summer != null) {
			if ((matrix.length == summer.length) && (matrix[0].length == summer[0].length)) {
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix[0].length; j++) {
						matrix[i][j] += summer[i][j];
					}
				}
			} else {
				return null;
			}
		} else {
			return null;
		}
		return matrix;
	}

	public double[][] difference(double[][] differenser) {
		if (differenser != null) {
			if ((matrix.length == differenser.length) && (matrix[0].length == differenser[0].length)) {
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix[0].length; j++) {
						matrix[i][j] -= differenser[i][j];
					}
				}
			} else {
				return null;
			}
		} else {
			return null;
		}
		return matrix;
	}

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

	public double determinant() {

		int n = matrix.length;
		double determinant = 1.0;
		double[][] worker = new double[n][n];
		int[] row = new int[n];
		int hold;
		int iPivot;
		double pivot;
		double absPivot;
		if (matrix[0].length != n) {
			return 0;
		}
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				worker[i][j] = matrix[i][j];
		for (int k = 0; k < n; k++) {
			row[k] = k;
		}
		for (int k = 0; k < n - 1; k++) {
			pivot = worker[row[k]][k];
			absPivot = Math.abs(pivot);
			iPivot = k;
			for (int i = k; i < n; i++) {
				if (Math.abs(worker[row[i]][k]) > absPivot) {
					iPivot = i;
					pivot = worker[row[i]][k];
					absPivot = Math.abs(pivot);
				}
			}
			if (iPivot != k) {
				hold = row[k];
				row[k] = row[iPivot];
				row[iPivot] = hold;
				determinant = -determinant;
			}
			if (absPivot < 1.0E-10) {
				return 0.0;
			} else {
				determinant = determinant * pivot;
				for (int j = k + 1; j < n; j++) {
					worker[row[k]][j] = worker[row[k]][j] / worker[row[k]][k];
				}
				for (int i = 0; i < n; i++) {
					if (i != k) {
						for (int j = k + 1; j < n; j++) {
							worker[row[i]][j] = worker[row[i]][j] - worker[row[i]][k] * worker[row[k]][j];
						}
					}
				}
			}
		}
		return determinant * worker[row[n - 1]][n - 1];
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
