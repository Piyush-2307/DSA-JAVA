package OOPS.D02encaptulation;

public class EncapClassTemplate {

    public int id;
    public String name;
    private int age;
    public int noOfSubjects;
    private String gf;


    public EncapClassTemplate(int id, String name, int age, int noOfSubjects, String gf){
        this.id = id;
        this.name = name;
        this.age = age;
        this.noOfSubjects = noOfSubjects;
        this.gf = gf;
    }

    public void bunk(){
        System.out.println(name + ": Bunk");
    }
    public void study(){
        System.out.println(name + ": Studying");
    }
    public void sleep(){
        System.out.println(name + ": Sleeping");
    }

    public String getGf(){
        return this.gf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
            this.age = a;
    }

}
