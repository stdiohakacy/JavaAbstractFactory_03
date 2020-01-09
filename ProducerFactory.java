package creational.AbstractFactory._03;

public class ProducerFactory {
	public static AbstractFactory getFactory(String choice) {
		switch (choice) {
		case "COMEDY":
			return new ComedyFactory();
		case "ACTION":
			return new ComedyFactory();
		default:
			return null;
		}
	}
}
