import java.util.ArrayList;

import Jama.Matrix;

public class NeuralNet {

	private Matrix[] net;
	
	
	public NeuralNet(int[] neurons){
		//sets matrix array size
		net = new Matrix[neurons.length];
		
		//sets input Matrix
		net[0] = new Matrix(1,neurons[0]);
		
		//sets other Matrices 
		for(int i = 1; i < net.length;i++){
			net[i] = new Matrix(neurons[i-1],neurons[i]);
		}
	}
	
	public double[] feedForward(){
		Matrix a = net[0];
		for(int i = 1; i < net.length ;i++){
			a = a.times(net[i]);
		}
		double[] out = a.getColumnPackedCopy();
		return out;
	}
	
	public double sigmoid(Matrix x, Matrix w, double b){
		Matrix xw = x.times(w);
		double z = xw.getColumnPackedCopy()[0];
		z += b;
		z = 1 / (1 + Math.pow(Math.E, z));
		return z;
	}
	
}
