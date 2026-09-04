package collectionInterface;

import java.util.*;

import static java.util.Collections.list;
import static java.util.Collections.sort;

public class Module1 {
    public static void main(String[] args){
        // List arr Collection - interfaces

        //ArrayList -> concrete class , List<> -> interface, Collection<> -> interface

//        ArrayList<Integer> arrList = new ArrayList<>();
//        arrList.add(10);
//        arrList.add(20);
//        arrList.add(1,30);
//        System.out.println(arrList);
//        arrList.add(40);
//        System.out.println(arrList);
//        arrList.remove(2);
//        System.out.println(arrList);
//
//        List<Integer> list = new ArrayList<>(arrList);
//        list.add(132);
//        list.add(123);
//        list.addAll(arrList);
//        System.out.println("This is the data of list that contains the data of arrList: " + list);
//        list.removeAll(arrList);
//        System.out.println("arrList is removed from list: " + list);
//        list.clear();
//        System.out.println("arrList is removed from list: " + list.size());
//
//        Iterator<Integer> iterator = arrList.iterator();
//        while (iterator.hasNext()){
//            System.out.println("Element: " + iterator.next());
//        }
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(11);
//        list2.add(22);
//        list2.add(33);
//        System.out.println(list2.get(1));
//        list2.set(1,44);
//        System.out.println(list2.get(1));
//        System.out.println(list2.contains(44));

        //toArray

//        Object[] arr =  list2.toArray();
//        System.out.println("Array of arr: " + Arrays.toString(arr));
//        for (Object obj : arr){
//            System.out.println("arr: " + obj);
//        }

//        List<Integer> sorting = new ArrayList<>();
//
//        sorting.add(23);
//        sorting.add(12);
//        sorting.add(74);
//        sorting.add(54);
//
//        System.out.println("Unsorted list: " + sorting);
//        Collections.sort(sorting, Collections.reverseOrder());
//        System.out.println("Sorted list: " + sorting);
//        Collections.reverse(sorting);
//        System.out.println("Reverse sorted list: " + sorting);
//        System.out.println("Index of 52 element is: " + sorting.indexOf(54));
//
//        ArrayList<Integer> newList = new ArrayList<>();
//        newList.ensureCapacity(100);
//        System.out.println("newList is empty: " + newList.isEmpty());

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(45);
        System.out.println(ll);
        ll.addFirst(12);
        System.out.println(ll);
        ll.addLast(67);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.peek());
        System.out.println(ll.poll());
        System.out.println(ll);
        ll.offer(63);
        System.out.println(ll);

        //vector same implementation
        //stack same implementation
    }

}
