package collection;

import java.util.*;

public class ArrayListPractice {
    public static void m1() {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        System.out.println("ArrayList: " + languages);
    }
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(null);
        list.add(384);
        list.add(385);
        list.add(386);
        list.add(null);
        list.add(387);


        list.add(1,"edited element");

        Object[] array = list.toArray();

        for (Object o : array) {
            System.out.println(o);
        }

        Object[] arr = list.toArray();


        list.addAll(Arrays.asList("sdfs","sdfsdf","asdfsdfa"));

        System.out.println(list);

        list.addAll(2,Arrays.asList(3,4,5,6));


        Collection<Object> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(22);
        list2.add(33);


        System.out.println( list.containsAll(list2));

        list.addAll(list2);

        System.out.println(list.containsAll(list2));

        System.out.println(list.contains(11));

        System.out.println(list.hashCode());

        System.out.println(list.isEmpty());

        System.out.println(list.remove(11));

        System.out.println(list.size());

        System.out.println(list.get(4));

        System.out.println(list.equals(22));

        System.out.println(list.contains(22));

        System.out.println(list.equals(list));

        int size = list.size();
        System.out.println(size);

        System.out.println(list.lastIndexOf(null));

        List<Object> list1 = new ArrayList<>();

        List<Object> list5 = list;

        List<Object> list3 = new ArrayList<>();

        list1.add(1);
        list3.add(1);

        System.out.println(list1.equals(list3));
        System.out.println(list1==list3);

        System.out.println(list);

        list3.clear();


        Iterator iterator= list.iterator();
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());

        iterator.remove();

        System.out.println(list);

        
    }
}
