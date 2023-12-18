package iterator;

public class Ogrenci<T> implements Comparable<T>{

	private int num;
	private String sınıf;
	
	
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}
	public Ogrenci(int num, String sınıf) {
		// TODO Auto-generated constructor stub
	this.num=num ;
	this.sınıf=sınıf;
	
	}
	
	public void setSınıf(String sınıf) {
		this.sınıf = sınıf;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSınıf() {
		return sınıf;
	}
	public int getNum() {
		return num;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "num :"+num+",sınıf :"+sınıf;
				
	}
	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
