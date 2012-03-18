package class5;

/**
 * Class Description: Box-Muller transform to generate pairs of independent, standard,
 * normally distributed (zero expectation, unit variance) random numbers, given a source of uniformly distributed random numbers.
 * Author: Jingen Lin
 * Editor: Vim and IntelliJ.
 * Date: 3/12/12
 * Time: 10:22 PM
 */
public class GaussianRandomVectorGenerator implements RandomVectorGenerator{

    private int N;
    double[] randomVector;

    public GaussianRandomVectorGenerator(int N){
        this.N = N;
    }
    //
    public double[] getVector(){
        randomVector = new double[N];
        for(int i = 0; i < N ; i++){
//            Box-Muller transform
            randomVector[i] = Math.sqrt(-2*Math.log(Math.random()))*Math.cos(2*Math.PI*Math.random());
            //randomVector[i] = Math.sqrt(-2*Math.log(Math.random()))*Math.sin(2*Math.PI*Math.random());
        }
        return randomVector;
    }

} 
