package day16;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import day13.Quiz.Questions;

public interface QuizRmiInterface extends Remote {

	public int performTest() throws RemoteException;
	//public boolean takeTest(List<day16.RmiServiceQuiz.Questions> questions) throws RemoteException;
   // public int getScore() throws RemoteException;
}
