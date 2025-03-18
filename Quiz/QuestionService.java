package Quiz;

import java.util.Scanner;

public class QuestionService {

	Question questions[] = new Question[5];

	public QuestionService() {
		questions[0] = new Question(1, "Size of int", "1", "4", "6", "8", "4");
		questions[1] = new Question(2, "Size of char", "1", "4", "2", "8", "2");
		questions[2] = new Question(3, "Size of double", "1", "4", "6", "8", "8");
		questions[3] = new Question(4, "Size of long", "1", "4", "6", "8", "8");
		questions[4] = new Question(5, "Size of boolean", "1", "4", "6", "8", "1");
	}

	String selection[] = new String[questions.length];

	public void displayQuestions() {

		Scanner sc = new Scanner(System.in);
		int i = 0;
		for (Question q : questions) {

			System.out.print("Question No:" + q.getId() + " ");
			System.out.println(q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());

			System.out.println("Select the Answer:");

			selection[i] = sc.nextLine();
			i++;
		}

		for (String s : selection) {
			System.out.println(s);
		}

		sc.close();

		System.out.println("Thanks for playing the Quiz... Alien");
	}

	public void getScore() {

		int score = 0;

		for (int i = 0; i < questions.length; i++) {

			String actualAnswer= questions[i].getAnswer();
			String useranswer = selection[i];
			
			if(actualAnswer.equalsIgnoreCase(useranswer)) {
				score++;
			}
		}
		System.out.println("Your Quiz Score is: "+score);

	}

}
