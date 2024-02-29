import best_practices.YearDescriber;
import design_patterns.adapter_exercise.Pensioner;
import design_patterns.adapter_exercise.PensionerAdapter;
import design_patterns.builder_example.*;
import design_patterns.factory_example.*;
import design_patterns.singleton_exercise.GuessTheNumber;
import design_patterns.strategy_pattern_exercise.CaeserCipher;
import design_patterns.strategy_pattern_exercise.CipherStrategy;
import design_patterns.strategy_pattern_exercise.Encoder;
import design_patterns.strategy_pattern_exercise.NumberCipher;


public class Main {
    public static void main(String[] args) {
        //Singleton thing
        GuessTheNumber game = GuessTheNumber.getInstance();
        //game.playGame();

        //Strategy thing
        String message = "I hecking love java";
        CipherStrategy NumberCipher = new NumberCipher();
        CipherStrategy CaesarCipher = new CaeserCipher();
        String newMessage = Encoder.encodeMessage(NumberCipher, message);
        String newMessage2 = Encoder.encodeMessage(CaesarCipher, message);
        System.out.println(newMessage);
        System.out.println(newMessage2);

        //Adapater thing
        Pensioner pensioner = new Pensioner("Leo", 65);
        PensionerAdapter pensionerAdapter = new PensionerAdapter(pensioner);
        System.out.println(pensionerAdapter.toString());

        //year describer thing
        YearDescriber.describeYear();
    }
}