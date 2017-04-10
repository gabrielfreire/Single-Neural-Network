/**
 * Created by Gabriel Freire on 10/04/2017.
 */
public class ActivationFunction {

    public static int stepFunction(float activation){
        if(activation >= 1){
            return 1;
        }
        return 0;
    }
}
