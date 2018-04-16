package com.yibo;

import com.yibo.bean.Person;
import com.yibo.bean.PersonFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    @Test
    public void testPerson() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("11", "A"));
        list.add(new Person("1", "A7.1"));
        list.add(new Person("4", "A10.10"));
        list.add(new Person("2", "A2.1"));
        list.add(new Person("7", "D1.1"));
        list.add(new Person("3", "B1.1.1"));
        list.add(new Person("5", "C1.1"));
        list.add(new Person("6", "C1.2.1"));
        list.add(new Person("10", "C"));
        list.add(new Person("12", "A2.1"));
        list.sort((p1, p2) -> {//lambda表达式代替匿名内部类Comparator
            int a = p1.getNumber().charAt(0) - p2.getNumber().charAt(0);
            if (a != 0) {
                return a;
            } else {//这个时候首位相等
                //首字母排除掉，剩下的用.分割成数组
                String[] p1s = p1.getNumber().substring(1).split("\\.");
                String[] p2s = p2.getNumber().substring(1).split("\\.");
                if (p1s[0].equals("")) {
                    return -1;
                }
                if (p2s[0].equals("")) {
                    return 1;
                }
                int b = p1s.length < p2s.length ? p1s.length : p2s.length;//循环次数为较短数组的长度
                for (int i = 0; i <b; i++) {
                    int x = Integer.parseInt(p1s[i]) - Integer.parseInt(p2s[i]);
                    if (x != 0) {
                        return x;
                    }
                }
            }
            return 0;
        });
        list.forEach(System.out::println);//lambda表达式循环打印数组
    }
    @Test
    public void testPersonFactory(){
        PersonFactory<Person> personFactory=Person::new;
        Person person = personFactory.create("韩梅梅", "22");
        System.out.println(person);
    }
}