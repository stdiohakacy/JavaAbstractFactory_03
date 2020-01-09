package creational.AbstractFactory._03;

public interface IAction {
	public void getNameMovie();
}

class BollyActionMovie implements IAction {
	@Override
	public void getNameMovie() {
		System.out.println("Bolly action movie");
	}
}

class HollyActionMovie implements IAction {
	@Override
	public void getNameMovie() {
		System.out.println("Holly action movie");
	}
}