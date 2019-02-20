package com.five;

public class Artist implements Sing,Moive,TVPlay{
	private String name;

	
	public Artist() {
		super();
	}


	public Artist(String name) {
		super();
		this.name = name;
	}


	public void showName(){
		System.out.println("我是"+name);
	}
	@Override
	public void actorTV() {
		// TODO Auto-generated method stub
		System.out.println("演电视剧");
	}


	@Override
	public void actorMoive() {
		// TODO Auto-generated method stub
		System.out.println("演电影");
	}


	@Override
	public void singSong() {
		// TODO Auto-generated method stub
		System.out.println("唱歌");
	}
	public static void main(String[] args) {
		Artist a1 = new Artist("杨洋");
		a1.showName();
		a1.actorMoive();
		a1.actorTV();
		a1.singSong();
		
	}
}
