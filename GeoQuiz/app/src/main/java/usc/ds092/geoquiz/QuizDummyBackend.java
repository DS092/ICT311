package usc.ds092.geoquiz;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class QuizDummyBackend {
    private static Map<Integer, Question> questions = new HashMap<Integer, Question>();
    static {
        questions.put(0, new Question("Russia is the largest country by space", true));
        questions.put(1, new Question("Australia has Kangaroos", true));
        questions.put(2, new Question("Surfing at night has no risks", false));
        questions.put(3, new Question("Berlin is the capital city of Norway", false));
        questions.put(4, new Question("The US has the worlds largest economy", true));
    }

    public static Question getRandomQuestion()
    {
        return questions.get(new Random().nextInt(questions.size()));
    }
}
