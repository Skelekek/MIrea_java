package mirea_lab1;
import java.lang.*;
public class Dog {
        private int age;
        private String name;

        public Dog(int a, String n) {
            age = a;
            name = n;
        }
        public Dog(String n){
            name = n;
            age = 0;
        }
        public Dog(){
            name = "First";
            age = 10;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public String getName(String name){
            return name;
        }
        public int getAge(int age){
            return age;
        }
        public String toString(){
            return this.name+", " +this.age+" y.o.";
        }
        public void intoHumAge(){
            System.out.println("Dog age into a human age "+ age*7);
        }


    }
