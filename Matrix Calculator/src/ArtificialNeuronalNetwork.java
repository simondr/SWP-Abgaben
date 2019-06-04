import matirx.Matrix;
import java.util.ArrayList;

public class ArtificialNeuronalNetwork {

    private int inputneurons;
    private int[] hiddenlayers;
    private int outputneurons;
    private ArrayList<Matrix> weights;
    private ArrayList<Matrix> biases;


    public ArtificialNeuronalNetwork(int inputneurons, int[] hiddenlayers, int outputneurons) {
        this.inputneurons = inputneurons;
        this.hiddenlayers = hiddenlayers;
        this.outputneurons = outputneurons;
    }

}
