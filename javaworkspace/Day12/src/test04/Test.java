package test04;

import java.util.HashMap;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<>();
		
		// �ʿ� ������ �߰��ϱ�(Ű,��ü)
		map.put("������", new Student("������","010-7564-0626",20,"���� ���빮�� ������"));
		map.put("���ڹ�", new Student("���ڹ�","010-1111-1111",30,"���� ������ ���̵�"));
		map.put("�ڻＺ", new Student("�ڻＺ","010-9999-9999",29,"���� ���ϱ� ������"));
		map.put("���߱�", new Student("���߱�","010-3333-3333",25,"���� ���빮�� ������"));
		
		// �ʿ� �ִ� ������ �����ϱ�
		map.put("������", new Student("������","010-7564-0626",20,"���� ������ ���ﵿ"));
		
		// ���� ������ �����ϱ�
		map.remove("���ڹ�");
		
		// �ʿ� �ִ� ��ü ������ �ϳ��� ��������
		Set<String> keySet = map.keySet();
		for(String name: keySet){
			System.out.println(map.get(name));
		}
	}
}


