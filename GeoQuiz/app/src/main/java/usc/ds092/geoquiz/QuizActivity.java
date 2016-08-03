package usc.ds092.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalseButton;
    private TextView questionText;
    private Question currentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionText = (TextView) findViewById(R.id.textView_question);
        mTrueButton = (Button) findViewById(R.id.button_true);
        mTrueButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                checkAnswer(true);
            }
        });
        mFalseButton = (Button) findViewById(R.id.button_false);
        mFalseButton.setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View v) {
               checkAnswer(false);
           }
       });

        nextQuestion();
    }

    public void nextQuestion()
    {
        currentQuestion = QuizDummyBackend.getRandomQuestion();
        questionText.setText(currentQuestion.text);
    }

    public void checkAnswer(boolean response)
    {
        int toastTextId = (response == currentQuestion.solution) ? R.string.correct_toast : R.string.incorrect_toast;
        Toast.makeText(QuizActivity.this, toastTextId, Toast.LENGTH_SHORT).show();
        nextQuestion();
    }
}
