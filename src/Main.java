import Jama.Matrix;

public class Main {
	
	static Matrix a = new Matrix(new double[][] {{1.,2.,3.},{4.,5.,6.}});
	static Matrix b = new Matrix(new double[][] {{1.,2.,3.},{4.,5.,6.},{7.,8.,9.}});
	
	public static void main(String[] args) {
		NeuralNet a = new NeuralNet(new int[] {1,3,2});
		
	}
}
