package creational.AbstractFactory._03;

public class Client {
	public static void main(String[] args) {
		AbstractFactory comedyFactory = ProducerFactory.getFactory("COMEDY");
		IComedy comedy = comedyFactory.getComedyMovie("BOLLY");
		comedy.getNameMovie();
	}
}
