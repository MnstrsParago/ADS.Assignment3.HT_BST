class MyTestingClass {
    private int id;
    private String name;
    public MyTestingClass(int id, String name){
        this.id= id;
        this.name= name;
    }
    @Override
    public int hashCode(){
        int result= 17;
        result= 31* result+ id;
        result= 31* result+ (name!= null? name.hashCode(): 0);
        return result;
    }
    @Override
    public boolean equals(Object obj){
        if(this== obj) return true;
        if(obj== null|| getClass()!= obj.getClass())return false;
        MyTestingClass that = (MyTestingClass) obj;
        return id == that.id && name.equals(that.name);
    }
}
class Student{
    private String name;
    private int age;
    public Student(String name, int age){
        this.name= name;
        this.age= age;
    }
}
public class Main{
    public static void main(String[] args){
        MyHashTable<MyTestingClass, Student>table= new MyHashTable<>();
        for (int i= 0; i< 10000; i++){
            MyTestingClass key= new MyTestingClass(i, "Name"+ i);
            Student value= new Student("Student"+ i, 20+ (i% 10));
            table.put(key,value);
        }
        table.printBucketSizes();
    }
}