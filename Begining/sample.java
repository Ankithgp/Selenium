package Begining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class sample {

	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add("hello");
		set.add("hi");
		set.add("hello");
		System.out.println(set);
//		Map<Integer,String> map=new HashMap<Integer,String>();  
//		map.put(1, "hello");
//		map.put(2, "hello");
//		for(Map.Entry m:map.entrySet()){  
//			   System.out.println(m.getKey()+","+m.getValue());  
//			  }  
//		System.out.println(map.get(1));
//		System.out.println(map.containsKey(3));
//		  Set set=map.entrySet();//Converting to Set so that we can traverse  
//		    Iterator itr=set.iterator();  
//		    while(itr.hasNext()){  
//		        //Converting to Map.Entry so that we can get key and value separately  
//		        Map.Entry entry=(Map.Entry)itr.next();  
//		        System.out.println(entry.getKey()+" "+entry.getValue());  
//		    }  
//		String stringarray[] = new String[5];
//		stringarray[0]="hi";
//		stringarray[1]="hiss";
//		stringarray[2]="hssi";
//		for(String s:stringarray)
//		{
//			System.out.println(s);
//		}
		/*User[] userarray= new User[5];
		String stringarray[] = new String[5];
		stringarray[0]="hi";
		stringarray[1]="hiss";
		stringarray[2]="hssi";
		User u1= new User("shashi",1);
		userarray[0]=u1;
		userarray[1]=u1;
		System.out.println(userarray[0]);
		System.out.println(userarray[0].getUsername());
		System.out.println(Arrays.toString(userarray));*/
		/*String stringarray[] = new String[5];
		stringarray[0]="hi";
		stringarray[1]="hiss";
		stringarray[2]="hssi";
		List list= new ArrayList();
		List list1= new ArrayList();
		list.add("hello");
		list.add(1);
		list1.add("jsdjh");
		list.addAll(list1);
		System.out.println(list);
		list.remove(0);
		list.add(1);
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains(1));
		System.out.println("Get(0): "+list.get(0));
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains(1));*/
	}

}
