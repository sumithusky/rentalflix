package io.egen.rentalflix;
import java.util.*;


/**
 * JUnit test cases for MovieService
 */
public class MovieServiceTest {
    public static void main(String[] args) {
      
      
      
//      Movie m1 =new Movie();
//      m1.setId(101);
//      m1.setYear(2016);
//      m1.setLanguage("English");
//      m1.setTitle("deadpool");
//      Movie m2 =new Movie();
//      m2.setId(102);
//      m2.setYear(2014);
//      m2.setLanguage("English");
//      m2.setTitle("Mask");
     
    Movie m=new Movie(105, 2018, "sjolay", "lamf");
     Movie m1=new Movie(10, 208, "say", "laf");
     Movie m2=new Movie(11, 205, "No", "sedfj");
     Movie m3=new Movie(11, 207, "yes", "abcd");
    MovieService ms = new MovieService();
    ms.create(m);
    ms.create(m1);
    ms.create(m2);
        List l=ms.movielist();
        System.out.println(l);
        
        ms.update(m3);
     //   System.out.println(l);
       
       List l1 = ms.findAll();
        System.out.println(l1);
        
        ms.findByName("sjolay");
        
     
        
     
}
}
