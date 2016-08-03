package usc.ds092.geoquiz;

public class Question {
    public String text;
    public boolean solution;

    Question(String text, boolean solution)
    {
        this.text = text;
        this.solution = solution;
    }
}