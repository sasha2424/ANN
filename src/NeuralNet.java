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
	
}
