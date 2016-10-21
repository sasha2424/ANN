import Jama.Matrix;

public class Main {
	
	static Matrix a = new Matrix(new double[][] {{1.,2.,3.},{4.,5.,6.}});
	static Matrix b = new Matrix(new double[][] {{1.,2.,3.},{4.,5.,6.},{7.,8.,9.}});
	
	public static void main(String[] args) {
		Matrix c = a.times(b);
		for (int i = 0; i < c.getColumnDimension(); i++) {
			for (int j = 0; j < c.getRowDimension(); j++) {
				System.out.print(c.get(j, i) + "\t");
			}
			System.out.println();
		}

	}
}
