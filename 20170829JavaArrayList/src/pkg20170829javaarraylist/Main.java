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
         names.ensureCapacity(1);
         names.add("1");
         names.add("1");
         names.add("1");
        // demon5: find the index ;
         System.out.println(  names.indexOf("1") );
         
         names.trimToSize();
         
    }
    
}
