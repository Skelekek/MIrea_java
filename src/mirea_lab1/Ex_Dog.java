package mirea_lab1;
import java.lang.*;
public class Ex_Dog {
        public static void main(String[] args){
            Dog d1 = new Dog(5,"First");
            Dog d2 = new Dog(7,"Second");
            Dog d3 = new Dog(9,"Third");
            System.out.println(d1);
            d1.intoHumAge();
            d2.intoHumAge();
            d3.intoHumAge();
        }
    }

