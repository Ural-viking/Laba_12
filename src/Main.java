//			12 ������� (HashSet, ArrayList, TreeMap).
/*	���������� ���������� ���������� ������� ������ ����������������� ��������, 
	���������� ��������� ���������� � ���� ��������� ������� � �������������� ��������.
	����� ���������� ���������� ���������� ��������� ������� � �������� ��������� ���� ���������
	� ������ ������ � �������:
			1. ��������� ������� ���������� �������� ���������� �������� � ������ ���������;
			2. ��������� ������� ���������� �������� ���������� �������� � ����� ���������;
			3. ��������� ������� ���������� �������� ���������� �������� � �������� ���������;
			4. ��������� ������� ���������� �������� �������� �������� � ������ ���������;
			5. ��������� ������� ���������� �������� �������� �������� � ����� ���������;
			6. ��������� ������� ���������� �������� �������� �������� � �������� ���������;
			7. ��������� ������� ���������� �������� ��������� �������� �� �������. 
	� ������������ � ���������:
			1. ���������� ��������� � ���������: 12 * 1_000_000;
			2. ���������� ��������� ��� ���������� �������� ��������� �� �������: 12 * 1_000_000_000.
	� ����� ������ ����� ��������� ��������� ����� HashSet, ArrayList, TreeMap.
	��� ������ 2 ������ HashSet � TreeMap �� ��������. ��� �������� ������� ������ ��� ArrayList.
	��� 3 ����� HashSet ����� �� ��������. � ���� ����������� ����� �� ������� ��� �����.			*/

import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		for(int i=0;i<1200000;i++) {
			al1.add(0,i);
		}
		TreeMap<Integer, Integer> tm1 = new TreeMap<>();
		for(int i=0;i<1200000;i++) {
			tm1.put(i, i);
		}
		System.out.println("\t\t\t\t\t\t" + "���������� � ������");
		System.out.println("����� ���������� �������� ���������� �������� � ������ ArrayList = " + vNachaloList(al1));
		System.out.println("\t\t\t\t\t\t" + "���������� � ��������");
		System.out.println("����� ���������� �������� ���������� �������� � �������� ArrayList = " + vSeredinyList(al1));
		System.out.println("\t\t\t\t\t\t" + "���������� � �����");
		System.out.println("����� ���������� �������� ���������� �������� � ����� (ArrayList) = " + vKonetsList(al1));
		System.out.println("\t\t\t\t\t\t" + "�������� c �����a");
		System.out.println("����� ���������� �������� �������� � ������ (ArrayList) = " + deleteNachaloList(al1));
		System.out.println("\t\t\t\t\t\t" + "�������� c ��������");
		System.out.println("����� ���������� �������� �������� � �������� (ArrayList) = " + deleteSeredinaList(al1));
		System.out.println("\t\t\t\t\t\t" + "�������� c �����");
		System.out.println("����� ���������� �������� �������� c ����� (ArrayList) = " + deleteKonetsList(al1));
		System.out.println("\t\t\t\t\t\t" + "����� �� �������");
		System.out.println("����� ���������� �������� ������ �� ������� �������� (ArrayList) = " + poiskList(al1));
		System.out.println("����� ���������� �������� ������ �� ������� �������� (TreeMap) = " + poiskMap(tm1));		
	}
	public static long vNachaloList(ArrayList<Integer> list) {
		long start = System.currentTimeMillis();
		list.add(0,12_000_001);
		long end = System.currentTimeMillis();
		return end-start;}
	public static long vSeredinyList(ArrayList<Integer> list) {
		long start = System.currentTimeMillis();
		list.add(list.size()/2,12_000_002);
		long end = System.currentTimeMillis();
		return end-start;}
	public static long vKonetsList(ArrayList<Integer> list) {
		long start = System.currentTimeMillis();
		list.add(12_000_003);
		long end = System.currentTimeMillis();
		return end-start;}
	public static long deleteNachaloList(ArrayList<Integer> list) {
		long start = System.currentTimeMillis();
		list.remove(0);
		long end = System.currentTimeMillis();
		return end-start;}
	public static long deleteSeredinaList(ArrayList<Integer> list) {
		long start = System.currentTimeMillis();
		list.remove(list.size()/2-2);
		long end = System.currentTimeMillis();
		return end-start;}
	public static long deleteKonetsList(ArrayList<Integer> list) {
		long start = System.currentTimeMillis();
		list.remove(list.size()-1);
		long end = System.currentTimeMillis();
		return end-start;}
	public static long poiskList(ArrayList<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<1200000;i++) {
			Random random = new Random();
			int num = random.nextInt(1200000-1);
			list.get(num);}
		long end = System.currentTimeMillis();
		return end-start;}
	public static long poiskMap(TreeMap<Integer,Integer> tmap) {
		long start = System.currentTimeMillis();
		for(int i=0;i<1200000;i++) {
		Random random = new Random();
		int num = random.nextInt(1200000-1);
		tmap.get(num);	
		}
		long end = System.currentTimeMillis();
		return end-start;}
}