package pk24;

class MyArray<E>{
	private Object[] array=new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++]=obj;
	}
	
	public E get(int index) {
		return (E)array[index];
		
	}
}

public class MyArrayTest2 {
	
	public static void main(String[] args) {
		// �ε����� 0���� �ּҰ� ��ŸƮ �ּ��̱� ������ �迭�� ��ü �ּ��̴�.
		MyArray<String> myArray1=new MyArray<String>();
		myArray1.add(new String("test1"));
		String str=myArray1.get(0); // ��������ȯ
		System.out.println(str);
		
		
		MyArray<Integer> myArray2=new MyArray<Integer>();
		myArray2.add(new Integer(100));
		Integer num=myArray2.get(0); // ���� ����ȯ
		System.out.println(num);
		
		
		
	}

}
