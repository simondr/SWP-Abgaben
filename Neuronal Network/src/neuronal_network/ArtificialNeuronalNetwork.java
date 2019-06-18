package neuronal_network;

import exceptions.InvalidMatrixException;
import matirx.Matrix;
import java.util.ArrayList;
import java.util.Random;

public class ArtificialNeuronalNetwork {


    private Matrix input;
    private int[] hiddenlayers;
    private int outputneurons;
    private Matrix weights;
    private Matrix biases;
    private ArrayList<Matrix> weightslist = new ArrayList<>();
    private ArrayList<Matrix> biaseslist = new ArrayList<>();


    public ArtificialNeuronalNetwork(int inputneurons, int[] hiddenlayers, int outputneurons) {
        this.input = new Matrix(inputneurons, 1);
        this.hiddenlayers = hiddenlayers;
        this.outputneurons = outputneurons;
        biases = new Matrix(hiddenlayers[0],1);
        Random random = new Random();
        double values[] []= new double [hiddenlayers[0]][inputneurons];
        for (int i = 0; i< hiddenlayers[0]; i++) {
            for (int j = 0; j < inputneurons; j++) {
                values[i] [j] = -1 + 2 * random.nextDouble();
            }
        }
        weights = new Matrix(values);
        weightslist.add(weights);
        biaseslist.add(biases);
    }

    public ArtificialNeuronalNetwork(Matrix input, int[] hiddenlayers, int outputneurons) {
        this.input = input;
        this.hiddenlayers = hiddenlayers;
        this.outputneurons = outputneurons;
        biases = new Matrix(hiddenlayers[0],1);
        Random random = new Random();
        double values[] []= new double [hiddenlayers[0]][input.getRows()];
        for (int i = 0; i< hiddenlayers[0]; i++) {
            for (int j = 0; j < input.getRows(); j++) {
                values[i] [j] = -1 + 2 * random.nextDouble();
            }
        }
        this.weights = new Matrix(values);
        this.weightslist.add(weights);
        this.biaseslist.add(biases);
    }


    public void setInput(Matrix input) throws InvalidMatrixException {
        if(input.getRows() != this.input.getRows())
            throw new InvalidMatrixException();
        this.input = input;
    }

    public Matrix calculate() throws InvalidMatrixException{
        Matrix output = this.weightslist.get(0).multiplyWith(this.input).add(this.biases);
        return output;
    }


}
