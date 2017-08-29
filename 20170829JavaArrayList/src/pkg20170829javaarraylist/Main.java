/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
  set：
    HashSet ； LinkedHashSet TreeSet;
   List:
   ArrayList Vector ;linkeList;
  quenue:just for store data;
  ProrityQueue;
Map:
  hashtable ;
  linkedHashMap;
  HashMap;
  Treemap;

 */
package pkg20170829javaarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         ArrayList<String>  names = new ArrayList<String>();
         
         // demon1: index不能越界
         names.add("我是第一个元素");
//         names.add(11, "??");  //注意 index 存在越界问题，在添加和获取的时候，不要越界使用
        // demon2 : clear the data    
         names.clear();        //清空 names.
         System.out.println(names.size());
         
         // demon3:
         names.add(0,"??");
         System.err.println(names.contains("??"));
         names.clear();
         //demon4:
         names.add(0,"??");
         names.ensureCapacity(1);
         names.add("1");
         names.add("1");
         names.add("1");
        // demon5: find the index ;
         System.out.println(  names.indexOf("1") ); 
         names.trimToSize();
        
         //demon5 use listIterator handle the names and use the remove ;
        ListIterator<String> listiterator =   names.listIterator();
        while(listiterator.hasNext()){
            String name = listiterator.next();
//            listiterator.remove();   //use the remove ,will effect the arraylist ;
            listiterator.add("123");    // use the add ,can effet the arraylist
//            System.err.println("name"+name);
        }
        System.out.println("alter user listiterator remove size="+names.size());
        
        for (Iterator<String> iterator = names.iterator(); iterator.hasNext();) {
            String next = iterator.next();
             System.err.println("name"+next);
            
        }
       
    }
    
}
/**
 *  study day: iterator and listIterator 区别
　　我们在使用List,Set的时候，为了实现对其数据的遍历，我们经常使用到了Iterator(迭代器)。使用迭代器，你不需要干涉其遍历的过程，只需要每次取出一个你想要的数据进行处理就可以了。

　　但是在使用的时候也是有不同的。List和Set都有iterator()来取得其迭代器。对List来说，你也可以通过listIterator()取得其迭代器，两种迭代器在有些时候是不能通用的，Iterator和ListIterator主要区别在以下方面：

　　1. iterator()方法在set和list接口中都有定义，但是ListIterator（）仅存在于list接口中（或实现类中）；

　　2. ListIterator有add()方法，可以向List中添加对象，而Iterator不能

　　3. ListIterator和Iterator都有hasNext()和next()方法，可以实现顺序向后遍历，但是ListIterator有hasPrevious()和previous()方法，可以实现逆向（顺序向前）遍历。Iterator就不可以。

　　4. ListIterator可以定位当前的索引位置，nextIndex()和previousIndex()可以实现。Iterator没有此功能。

　　5. 都可实现删除对象，但是ListIterator可以实现对象的修改，set()方法可以实现。Iierator仅能遍历，不能修改。　　

　　因为ListIterator的这些功能，可以实现对LinkedList等List数据结构的操作。其实，数组对象也可以用迭代器来实现。
 */
