import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Person{
    String name;
    String email = new String();
    int id;
    int age;

    /* ENCAPSULATION*/
    private String description;
    private Double salary;


    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    /**/



    public void ShowPerson(){
        System.out.println(name + ":" + email);
    }

}
/*class Calculator{

//  Method Overloading
    public int sum(int x,int y){

        int result = x + y;
        System.out.println("Sum of numbers");
        return result;
    }

    public int sum(int x, int y, int z){
        return x + y + z;
    }
    public int sum(int x, int y, int z, int a){
        return x + y + z + a;
    }
}*/

/*
class Computer{

    public void moveMouse(){
        System.out.println("Mouse is moving");
    }

    public String playMusic(int cost){
        if (cost >=2) {
            return "Music is playing";}
        else{
            return "Not sufficient";
        }
    }

}*/

public class First {

    public static void main(String[] args) {

        Person person1 = new Person();


        person1.name = "Victor";
        person1.age = 25;
        person1.id = 1;
        person1.email = "test@yahoo.com";
        System.out.println(person1.getDescription());


        Person person2 = new Person();

        person2.name = "Trustcott";
        person2.age = 24;
        person2.id = 2;
        person2.email = "test2@ay.com";
        System.out.println(person2.getDescription());

        System.out.println(person1.name);
        System.out.println(person2.name);
        System.out.println("----------->");

        Person persons[] = new Person[2];
        persons[0]=person1;
        persons[1]=person2;

//      Enhanced for loop
        for(Person n : persons ){
            System.out.println(n.name + ':' + n.email + ':' + n.age);
        }

/*     int[] array= {1,2,3,4,5,6};
       //Enhanced for-loop
       for(int n: array){
           System.out.println(n);
       }*/

        person1.ShowPerson();
        person2.ShowPerson();



        HashMap<String, List<String>> countries = new HashMap<String, List<String>>();

        List<String> G = new ArrayList<String>(){
            {
                add("Ghana");
                add("Greece");
                add("Gabon");
                add("Greenland");
            }
        };

        List<String> I = new ArrayList<String >(){
            {
                add("Indonesia");
                add("India");
                add("Italy");
                add("Iraq");
                add("Ireland");
            }

        };

        List<String> U = new ArrayList<String >(){
            {
                add("Uruguay");
                add("United States of America");
                add("United Kingdom");
                add("United Arab Emirates");
            }

        };

        //initialize hashmap

        countries.put("G", G);
        countries.put("I", I);
        countries.put("U", U);

        List<String> result = countries.get("I");

        for ( String country: result) {
//            System.out.println(country);
        }




        //Binary Search Tree

//        class Node{
//            int value;
//            Node left;
//            Node right;
//
//            Node(int value){
//                this.value = value;
//                right = null;
//                left = null;
//            }
//        }
//        Bitwise XOR operator
//        System.out.println(75&58);

        String name1 = "Opeoluwa";

//        name2 is an object of the class String
        String name2 = new String("Femi");
        String name3 = new String("Feyi");

//        Create an object of scanner class
        Scanner bucket =  new Scanner(System.in);

//        System.out.println("Please enter your name : ");
//
//        String name4 = bucket.next();
//
//        System.out.println("My name is "+ name4);

//        ------------------CONDITIONAL STATEMENTS----------------

//        -------------------IF AND SWITCH----------------------

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please pick a valid day of the week: ");

//        int x = scanner.nextInt();

//        if else statements
//        if (x == 1){
//            System.out.println("Monday");
//        }
//        else if (x==2){
//            System.out.println("Tuesday");
//        }else if(x ==3){
//            System.out.println("Wednesday");
//        } else if (x==4) {
//            System.out.println("Thursday");
//        } else if (x==5) {
//            System.out.println("Friday");
//        } else if (x==6) {
//            System.out.println("Saturday");
//        } else if (x==7) {
//            System.out.println("Sunday");
//        }else {
//            System.out.println("Only 7 days of the week");
//        }

//      ----------------------Switch statement

//        switch (x) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Not a valid day of the week");
//                break;
//        }

//        ------------------Guess my name game----------------

//        ------------New switch statements not supported in java 8------------
//          Scanner scanner1 = new Scanner(System.in);
//          System.out.println("Guess my name here: ");
//          String name6 = scanner1.next();

//          switch (name6){
//            case "Ope" -> System.out.println("You are correct");
//            default -> System.out.println("You are wrong");
//          }
//
//
//        --------------------------LOOPS-------------------------------

//        ------------------WHILE, DO WHILE AND FOR LOOP----------------
/*          int i = 1;
          while (i<=4){
              System.out.println("Hi " + i);
              i++;
          }*/

/*        ------------------------------DO WHILE-----------------------
          If the condition is false it only prints what's in the do block once'
          int k = 1;
          do
          {
            System.out.println("Hello " + k);
            k++;
          }
          while (k<=4); */


/*        int num_of_times = 4;

        for (int i = 0; i< num_of_times; i++){
            System.out.println("HI");
        }*/

/*
        for (int j=1;j<=5;j++){
            System.out.println("DAY "+ j);
            for (int k=1;k<=9;k++){
                System.out.println( "   "+(k+8) +" - " + (k+9));
            }
        }*/

/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int m = scanner.nextInt();
        System.out.println("Please enter the second number");
        int n = scanner.nextInt();*/

        /*
        Calculator calculator = new Calculator();
        int sum = calculator.sum(1,2, 7, 5);
        System.out.println("The sum is " + sum);*/

/*      Computer computer = new Computer();
        computer.moveMouse();
        System.out.println(computer.playMusic(1)); */



//      MUTABLE AND IMMUTABLE STRINGS - String buffer and builder

        String objName = "Victor"; //Immutable;
        String objName1 = new String("Stephen"); //Immutable

//        Thread Safe
        StringBuffer sb = new StringBuffer("Adeniyi");
        sb.append(" Jones");
//        sb.insert(0,"test ");
//        sb.replace(0,4,"Type");
        System.out.println(sb);

//        Not Thread safe
        StringBuilder stringBuilder = new StringBuilder();

        Scanner sc = new Scanner(System.in);


//        BMI CALCULATOR
/*
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Please enter you weight in kg: ");
        double weight = sc1.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Please enter you height in meters: ");
        double height = sc2.nextDouble();

        double bmi = weight / Math.pow(height,2);

        if (bmi < 18){
            System.out.println("You are underweight with a "+ bmi + " bmi, please eat some more.");
        } else if (bmi >= 18 && bmi <25) {

            System.out.println("You are very healthy with a "+ bmi + " bmi, Keep it up.");
        }
        else if (bmi >= 25 && bmi < 30){
            System.out.println("You are overweight with a "+ bmi + " bmi, please eat healthy veges and work out more.");
        }
        else {
            System.out.println("You health is in critical condition.");

        }*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String username = scanner.nextLine();



        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter your password: ");

        String password = scanner.nextLine();

        if (username.equals("admin")){
//            System.out.println("Username: "+ username);
            if (password.equals("P@55w0rd")){
                System.out.println("Login successful!!!");
            }else {
                System.out.println("wrong password entered");
            }
        } else if (username.equals("guest")) {
//            System.out.println("Username: "+ username);
            if (password.equals("P@55w0rd")){
                System.out.println("Login successful!!!");
            }else {
                System.out.println("wrong password");
            }
        }else
            System.out.println(" Wrong details entered");

    }



}
