package class5;
import java.util.Arrays;
public class AntiTheticGRVGenerator implements RandomVectorGenerator{

    private int N;

    public AntiTheticGRVGenerator(int N){
        this.N = N;
    }

    public double [] getVector(){
        if(N%2 == 0){
            RandomVectorGenerator rvg = new AntiTheticVectorGenerator(new GaussianRandomVectorGenerator(N/2));
            double[] randomVector = rvg.getVector();
            double[] anti_randomVector = rvg.getVector();
            double[] vector;

            vector = Arrays.copyOf(randomVector, N);
            System.arraycopy(anti_randomVector, 0, vector, randomVector.length, N/2);
            return vector;
        }
        else{
            RandomVectorGenerator rvg = new AntiTheticVectorGenerator(new GaussianRandomVectorGenerator((N-1)/2));
            double[] randomVector = rvg.getVector();
            double[] anti_randomVector = rvg.getVector();
            double[] vector;

            vector = Arrays.copyOf(randomVector, N);
            System.arraycopy(anti_randomVector, 0, vector, randomVector.length, (N-1)/2);
            return vector;
        }

    }
}
