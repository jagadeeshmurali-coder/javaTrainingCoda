package day16;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.List;

import day13.Quiz.Questions;

public class RmiQuizClient {
	public static void main(String[] args) throws Exception{
		QuizRmiInterface qr=(QuizRmiInterface)Naming.lookup("rmi://localhost:1099/rmiservice/performTest");
		
		//int price=qr.getStockPrice("coda");
		
		//System.out.println("The stock price of coda is...:"+price);
		//List<day16.RmiServiceQuiz.Questions> questions = qr.getQuestions();
		
//		qr.takeTest(questions);
		
		
		int score = qr.performTest();
		System.out.println("you got "+score);
		
		
	}

}
