package creational.AbstractFactory._03;

public class ActionFactory implements AbstractFactory{
	@Override
	public IAction getActionMovie(String name) {
		switch (name) {
		case "BOLLY":
			return new BollyActionMovie();
		case "HOLLY":
			return new HollyActionMovie();
		default:
			return null;
		}
	}

	@Override
	public IComedy getComedyMovie(String name) {
		return null;
	}
}
