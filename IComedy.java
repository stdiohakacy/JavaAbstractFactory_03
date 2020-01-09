package creational.AbstractFactory._03;

public interface IComedy {
	public void getNameMovie();
}

class BollyComedyMovie implements IComedy{
	@Override
	public void getNameMovie() {
		System.out.println("Bolly comedy movie");
	}
}

class HollyComedyMovie implements IComedy{
	@Override
	public void getNameMovie() {
		System.out.println("Holly comedy movie");
	}
}