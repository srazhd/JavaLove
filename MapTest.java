import java.util.*;
public class MapTest {
    public static void main(String[] args) {
        Map map=new HashMap();
        //Adding elements to map
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        //Traversing Map
        Set set=map.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
          //  System.out.println(entry.getKey()+" "+entry.getValue());
        }

        Map<String, Student> smap = new HashMap<>();

        smap.put("s1", new Student(1, "Saraf"));
        smap.put("s2", new Student(2, "Raz"));
        smap.put("s3", new Student(3, "Alam"));
        smap.put("s4", new Student(4, "Sunam"));


//        for(String key:smap.keySet()){
//            Student student = smap.get(key);
//            System.out.println("Id: "+ student.getId() +" Name: "+ student.getName());
//        }

        Set set2 = smap.entrySet();
        Iterator itr2 = set2.iterator();

        while (itr2.hasNext()){
            Map.Entry entry = (Map.Entry) itr2.next();
            Student student = (Student) entry.getValue();
            System.out.println("Id No: "+ student.getId() +" Name: "+ student.getName());
        }


    }
}


class Student{
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}