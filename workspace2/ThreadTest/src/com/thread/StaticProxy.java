package com.thread;

public class StaticProxy {
	public static void main(String[] args) {
		new RecordCompany(new Singer()).ReleaseAlbum();
	}
}
interface Album{
	void ReleaseAlbum();
}
class RecordCompany implements Album{
	private Singer singer;
	public RecordCompany(Singer singer) {
		this.singer = singer;
	}
	public void Prepare(){
		System.out.println("唱片公司准备创作环境");
	}
	public void Advertise(){
		System.out.println("唱片公司做宣传");
	}
	@Override
	public void ReleaseAlbum() {
		Prepare();
		singer.ReleaseAlbum();
		Advertise();
	}
	
}
class Singer implements Album{
	private String name = "张三";
	@Override
	public void ReleaseAlbum() {
		System.out.println(this.name+"发歌了");
	}
	
}