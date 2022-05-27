//			12 вариант (HashSet, ArrayList, TreeMap).
/*	Необходимо произвести вычисление времени работы нижеперечисленных операций, 
	количество элементов коллекциях и сами коллекции указаны в индивидуальном варианте.
	После выполнения вычислений необходимо заполнить таблицы и привести скриншоты кода программы
	и данных вывода в консоль:
			1. Сравнение времени выполнения операции добавление элемента в начало коллекции;
			2. Сравнение времени выполнения операции добавление элемента в конец коллекции;
			3. Сравнение времени выполнения операции добавление элемента в середину коллекции;
			4. Сравнение времени выполнения операции удаления элемента в начале коллекции;
			5. Сравнение времени выполнения операции удаления элемента в конце коллекции;
			6. Сравнение времени выполнения операции удаления элемента в середине коллекции;
			7. Сравнение времени выполнения операции получения элемента по индексу. 
	В соответствии с вариантом:
			1. Количество элементов в коллекции: 12 * 1_000_000;
			2. Количество элементов для вычисления скорости получения по индексу: 12 * 1_000_000_000.
	В нашем случаи будем проводить сравнения между HashSet, ArrayList, TreeMap.
	Для первых 2 опытов HashSet и TreeMap не подходят. Его возможно сделать только для ArrayList.
	Для 3 опыта HashSet также не подходит. у него отсутствует поиск по индексу или ключу.			*/

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
		System.out.println("\t\t\t\t\t\t" + "Добавление в начало");
		System.out.println("Время выполнения операции добавления элемента в начало ArrayList = " + vNachaloList(al1));
		System.out.println("\t\t\t\t\t\t" + "Добавление в середину");
		System.out.println("Время выполнения операции добавления элемента в середину ArrayList = " + vSeredinyList(al1));
		System.out.println("\t\t\t\t\t\t" + "Добавление в конец");
		System.out.println("Время выполнения операции добавления элемента в конец (ArrayList) = " + vKonetsList(al1));
		System.out.println("\t\t\t\t\t\t" + "Удаление c началa");
		System.out.println("Время выполнения операции удаления с начала (ArrayList) = " + deleteNachaloList(al1));
		System.out.println("\t\t\t\t\t\t" + "Удаление c середины");
		System.out.println("Время выполнения операции удаления с середины (ArrayList) = " + deleteSeredinaList(al1));
		System.out.println("\t\t\t\t\t\t" + "Удаление c конца");
		System.out.println("Время выполнения операции удаления c конца (ArrayList) = " + deleteKonetsList(al1));
		System.out.println("\t\t\t\t\t\t" + "Поиск по индексу");
		System.out.println("Время выполнения операции поиска по индексу элемента (ArrayList) = " + poiskList(al1));
		System.out.println("Время выполнения операции поиска по индексу элемента (TreeMap) = " + poiskMap(tm1));		
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