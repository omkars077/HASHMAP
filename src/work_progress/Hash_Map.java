package work_progress;

import java.util.HashMap;

public class Hash_Map {
    public void hashdemo(){
        HashMap<Integer,String> name= new HashMap <> ();
        name.put(1 ,"Dell");
        name.put(2,"Hp");
        name.put(3,"Acer");
        name.put(4,"Asus");
        System.out.println("This is my system name :"+name.get(2));
        System.out.println(name.get(3));
    }
    public void demo(){
        HashMap <String,String> job= new HashMap<>();
        job.put("A","Doctor");
        job.put("B","Engineer");
        job.put("C","Advocate");
        System.out.println(job.get("A"));
        System.out.println(job.get("B"));
        System.out.println(job.get("C"));
    }
    public static void main(String[] args){
        Hash_Map obj = new Hash_Map();
        obj.hashdemo();
        obj.demo();
    }
}
