/*
 * Naaman and Elisha
 */
package sundayschoollesson;

/**
 *
 * @author Ryan
 */
public class SundaySchoolLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person naaman = new Person("Naaman","leprosy","Please take these gifts.");
        Person elisha = new Person("Elisha","none","Go wash in the Jordan seven times.");
        Person girl = new Person("Servant Girl","none","There is a prophet in Israel"
                + " who can heal you.");
        Person gehazi = new Person("Gehazi","none","We have visitors and can use"
                + " the gifts.");
        System.out.println("Problem: Naaman has the disease " + 
                naaman.getDisease()+".");
        girl.speak();
        elisha.speak();
        naaman.wash(7);
        naaman.setDisease("none");
        System.out.println("Naaman has the disease " + naaman.getDisease() + ".");
        naaman.speak();
        gehazi.speak();
        gehazi.setDisease("leprosy");
        System.out.println("Gehazi has the disease " + gehazi.getDisease() + ".");
    }
}