package ch10;

public class Counting {
	public static void main(String[] args) {
		int[] people = {55,40,27,99,76,81,29,31,33,62};
		int[] ages = new int[10]; //���ɴ뿡 ���� �� ����
		
		for(int i=0; i<people.length; i++) {
			int age = people[i];
			if(age < 30) {
				ages[0]++;
			}else if(age < 40){
				ages[1]++;
			}else if(age < 50){
				ages[2]++;
			}else if(age < 60){
				ages[3]++;
			}else if(age < 70){
				ages[4]++;
			}else if(age < 80){
				ages[5]++;
			}else if(age < 90){
				ages[6]++;
			}else if(age <= 100){
				ages[7]++;
			}
		}
		int number = people.length;
		System.out.println(number + " �� �� 20��� "+ages[0]+ "�� �Դϴ�.");
		System.out.println(number + " �� �� 30��� "+ages[1]+ "�� �Դϴ�.");
		System.out.println(number + " �� �� 40��� "+ages[2]+ "�� �Դϴ�.");
		System.out.println(number + " �� �� 50��� "+ages[3]+ "�� �Դϴ�.");
		System.out.println(number + " �� �� 60��� "+ages[4]+ "�� �Դϴ�.");
		System.out.println(number + " �� �� 70��� "+ages[5]+ "�� �Դϴ�.");
		System.out.println(number + " �� �� 80��� "+ages[6]+ "�� �Դϴ�.");
		System.out.println(number + " �� �� 90��� "+ages[7]+ "�� �Դϴ�.");
	}
}
