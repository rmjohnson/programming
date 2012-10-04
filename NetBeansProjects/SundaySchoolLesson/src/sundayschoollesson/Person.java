package sundayschoollesson;

/*
 * The Person class supporting the story of
 * Naaman and Elisha.
 */

/**
 *
 * @author Ryan
 */
public class Person {
    private String name;
    private String disease;
    private String lines;

    public Person(String name, String disease, String lines) {
        this.name = name;
        this.disease = disease;
        this.lines = lines;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
    /**
     * The person speaks their lines.
     */
    public void speak(){
        System.out.println(name + " says \"" + lines + "\"");
    }
    
    /**
     * The person is instructed to wash a number of times.
     * @param numberOfWashings 
     */
    public void wash(int numberOfWashings) {
        int washings = 0;
        while(numberOfWashings != washings) {
            washings++;
            System.out.println(name + " has washed " + washings + " time(s).");
        }
    }
}
