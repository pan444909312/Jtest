package com.exam.object;

public abstract  class Instrument {
	private String name;
	public Instrument() {
		
	}
	public Instrument(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void makeSound();

}

class Erhu extends Instrument{
	

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("µ¯¶þºú");
	}
	
}
class Piaon extends Instrument{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("µ¯¸ÖÇÙ");
	}
	
}

class Violin extends Instrument{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("µ¯Ð¡ÌáÇÙ");
	}
	
}