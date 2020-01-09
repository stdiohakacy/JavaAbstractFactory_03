package creational.AbstractFactory._03;

public interface AbstractFactory {
	public IComedy getComedyMovie(String name);
	public IAction getActionMovie(String name);
}
