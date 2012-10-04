package studentcomparer;

import sun.misc.Sort;

/**
 *
 * @author Ryan
 */
public class Student implements Comparable {

    String name;
    int id;
    String floorName;
    int golfHandicap;
    int removedCount;
    //Big-o notation: O(1)
    public Student(String name, int id, String floorName, int golfHandicap) {
        this.name = name;
        this.id = id;
        this.floorName = floorName;
        this.golfHandicap = golfHandicap;
    }
    //Big-o notation: O(1)
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    //Big-o notation: O(1)
    public int compareTo(Student o) {
        return this.floorName.compareTo(o.floorName);
    }

    //Big-o notation: O(N^2)
    public Student[] removeDupes(Student[] students) {
        this.removedCount = 0;
        for (int i = 0; i < students.length - this.removedCount; i++) {
            for (int j = i + 1; j < students.length - this.removedCount; j++) {
                if (students[i].compareTo(students[j]) == 0) {
                    students = remove(students, j);
                    removedCount++;
                }
            }
        }
        return students;
    }
    //Big-o notation: O(N)
    public Student[] remove(Student[] students, int index) {
        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }
        students[students.length - 1] = null;
        return students;
    }
    //Big-o notation: O(N^2)
    public Student[] sort(Student[] students) {
        Student tmpStudent;
        for (int i = 0; i < students.length - this.removedCount; i++) {
            for (int j = i + 1; j < students.length - this.removedCount; j++) {
                if (students[i].compareTo(students[j]) > 0) {
                    tmpStudent = students[i];
                    students[i] = students[j];
                    students[j] = tmpStudent;
                }
            }
        }

        return students;
    }
    //Big-o notation: O(N)
    public void output(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }

    @Override ////Big-o notation: O(1)
    public String toString() {
        return "Name: " + this.name + "\tID:" + this.id + "\tFloor Name: "
                + this.floorName + "\tGolf Handicap: " + this.golfHandicap;
    }
}
