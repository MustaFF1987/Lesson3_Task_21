public class Dog {
    String dogsname;
    String dogscolor;
    Integer dogsage;

    Dog (String dogsname, String dogscolor, Integer dogsage){

        this.dogsname = dogsname;
        this.dogscolor = dogscolor;
        this.dogsage = dogsage;
    }
    String getdogsname() {return this.dogsname;}
    String getdogscolor() {return this.dogscolor;}
    Integer getdogsage() {return this.dogsage;}

    void sayYourName() {
        System.out.println("My name is " + this.dogsname);
    }
    void sayYourColor() {
        System.out.println("My color is " + this.dogscolor);
    }
    void sayYourAge() {
        System.out.println("I'm " + this.dogsage + " years old");
    }
}
