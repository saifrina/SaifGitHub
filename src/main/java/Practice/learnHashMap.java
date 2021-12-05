package Practice;


import java.util.HashMap;

public class learnHashMap {

    public void addHashMapValue(){
       HashMap<String,String>  hmap = new HashMap<>();
       hmap.put("IE","Internet Explorer");
       hmap.put("Chrome","Google");
       hmap.put("Messanger","Facebook");
       hmap.put("Firefox","Mozilla Firefox");

       System.out.println("browser name : "+hmap);

    }
    public void hashMapProblem() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Vishal",10);
        map.put("Sachin",34);
        map.put("saiful",43);

        System.out.println("Size of map:" +map.size());
        //Check is a "Vishal" present in the value
        if(map.containsKey("Vishal")){
            System.out.println(map.get("Vishal"));
        }

    }



}
