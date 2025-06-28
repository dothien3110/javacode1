public class ArrayObject implements java.io.Serializable{
	private int[] a=null;
	public ArrayObject(){
	}
	public void setArray(int a[]){
		this.a=a;
	}
	public int[] getArray(){
		return a;
	}
}