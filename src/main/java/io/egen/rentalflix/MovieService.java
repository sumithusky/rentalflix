package io.egen.rentalflix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Service implementing IFlix interface
 * You can use any Java collection type to store movies
 */
public class MovieService implements IFlix {
        public int id;
        public int year;
        public String title;
        public String language;
            
    private ArrayList<Movie> movielist;
    public MovieService(){
        movielist = new ArrayList<Movie>();
    }
//    public MovieService(int id, int year,String title, String language){
//        m.setId(id);
//        m.setTitle(title);
//        m.setLanguage(language);
//        m.setYear(year);
//    }
      
    @Override
    public List<Movie> findAll() {
       return movielist;
    }

    @Override
    public List<Movie> findByName(String name) {
        Iterator it = movielist.iterator();
         while(it.hasNext()){
            Movie l=(Movie)it.next();
            if(l.getTitle()== name){
                 System.out.println(name);
                 System.out.println("Name is Found");
            }
        }
        return movielist;
    }

    @Override
    public Movie create(Movie movie) {
        movielist.add(movie);
        return movie;
    }
    
    public List movielist(){
        return movielist;
    }

    @Override
    public Movie update(Movie movie) {
        Iterator it = movielist.iterator();
         while(it.hasNext()){
            Movie l=(Movie)it.next();
            if(l.getId()==movie.getId()){
                movielist.remove(l);
                movielist.add(movie);
            }
        }
         return movie;
    }

    @Override
    public Boolean delete(int id) {
        boolean flag=false;
        Iterator it = movielist.iterator();
        if(movielist.size() < 0){
            return flag;
        }
        while(it.hasNext()){
            Movie l=(Movie)it.next();
            if(l.getId()==id){
                movielist.remove(l);
                flag=true;
            }
        }
        return flag;
        }

    

    @Override
    public boolean rentMovie(int movieId, String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    
 


