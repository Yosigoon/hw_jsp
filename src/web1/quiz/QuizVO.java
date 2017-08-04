package web1.quiz;

import java.util.Arrays;

public class QuizVO {
	
	private String title;
	private String answer;
	private String[] option;
	
	public QuizVO(String title, String answer, String...option) {
		super();
		this.title = title;
		this.answer = answer;
		this.option = option;
	}
	
	public boolean checkAnswer(String userAnswer) {
		return this.answer.equals(userAnswer);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String[] getOption() {
		return option;
	}

	public void setOption(String[] option) {
		this.option = option;
	}

	@Override
	public String toString() {
		return "QuizVO [title=" + title + ", answer=" + answer + ", option=" + Arrays.toString(option) + "]";
	}
	
	
	
	
	
	

}
