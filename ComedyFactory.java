package creational.AbstractFactory._03;

public class ComedyFactory implements AbstractFactory{
	public IComedy getComedyMovie(String name) {
		switch (name) {
		case "BOLLY":
			return new BollyComedyMovie();
		case "HOLLY":
			return new HollyComedyMovie();
		default:
			return null;
		}
	}

	@Override
	public IAction getActionMovie(String name) {
		return null;
	}
}
