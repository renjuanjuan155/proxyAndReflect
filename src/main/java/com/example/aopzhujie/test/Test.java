package com.example.aopzhujie.test;

import java.util.*;

/**
 * @author Leo
 * @date 2021/1/29
 */
public class Test {


    public static void main(String[] args) {

        /*String str1 = "通话";
        String str2 = "重地";
        System. out. println(String. format("str1：%d | str2：%d",  str1. hashCode(),str2. hashCode()));
        System. out. println(str1. equals(str2));

        Map<String,String> map = new HashMap<String, String>();
        map.put("通话","通话");
        map.put("重地","重地");

        Set<String> strings = map.keySet();
        strings.hashCode();
        for (String string:strings){
            System.out.println(string.hashCode());
        }
        String s = map.get("通话");
        System.out.println(s);
        String ss = s;
        System.out.println(s == ss);

        String reverse = "anfbbgdk";
        StringBuffer stringBuffer = new StringBuffer(reverse) ;
        stringBuffer.reverse();
        reverse = stringBuffer.toString();
        System.out.println(reverse);


        Collection collection = new ArrayList();
        collection.add("s");
        collection.add("a");
        for (Object c:collection){

        }

        List<String> list = new ArrayList<String>();
        list.add("a");
        List<String> list1 = new ArrayList<String>();
        list1.add("b");
        Collections.copy(list,list1);
        System.out.println(list1.get(0));
        System.out.println(list.get(0));*/

        List<Long> list = new ArrayList<Long>();

        List<Long> list1 = new ArrayList<Long>();

        list.add(1L);
        list.add(2L);
        list.add(3L);

        list1.add(2L);
        list1.add(3L);
        List<Long> longs = removeAll(list, list1);
        for (Long dto:longs){
            System.out.println(dto);
        }


    }

    public  static List<Long> removeAll(List<Long> list1,List<Long> list2){

        LinkedList<Long> result = new LinkedList<Long>(list1);
        HashSet<Long> set = new HashSet<Long>(list2);
        Iterator<Long> itor = result.iterator();
        while(itor.hasNext()){
            if(set.contains(itor.next())){
                itor.remove();
            }
        }
        return result;
    }
}
