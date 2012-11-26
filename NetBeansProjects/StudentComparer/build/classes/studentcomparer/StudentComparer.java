/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcomparer;

/**
 *
 * @author Ryan
 */
public class StudentComparer {

    public static void main(String[] args) {
        Student[] students = new Student[9];
        students[0] = new Student("Sarah Witty", 1, "Witty", 100);
        students[1] = new Student("Ryan Johnson", 2, "Illimunati", 1);
        students[2] = new Student("Justin Shore", 3, "FPS ", 5);
        students[3] = new Student("Johnny Broda", 4, "Ewok", 10);
        students[4] = new Student("Kyle Broda", 5, "Raptor", 32);
        students[5] = new Student("Stephen Goodenow", 6, "Gandhi", 54);
        students[6] = new Student("Sarah Witty", 1, "Witty", 100);
        students[7] = new Student("Ryan Johnson", 2, "Illimunati", 1);
        students[8] = new Student("Moises Dasilva", 7, "Kimble", 53);

        students[0].removeDupes(students);
        students[0].sort(students);
        students[0].output(students);
    }
}
