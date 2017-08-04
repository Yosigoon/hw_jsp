package web1.quiz;

import java.util.ArrayList;
import java.util.List;

public class QuizManager {
	
	private List<QuizVO> quizList;
	
	public QuizManager() {
		quizList = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			quizList.add(new QuizVO("문제", "1", "1","2","3","4"));
			
		}
	}
	
	public QuizVO getNext(int qno, String answer) {
		
		if(qno == 0) {
			return quizList.get(0);
		}
		
		if(quizList.get(qno-1).checkAnswer(answer)) {
			return quizList.get(qno);
		}else {
			return null;
		}
		
		
	}

}
