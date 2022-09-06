import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PriorityQueue implements Solution {

    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        Priorities priorities = new Priorities();
        System.out.print("Enter number of Events: ");
        int totalEvents = Integer.parseInt(scan.nextLine());

        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}

/** Senario 1 Result Maria Dan **
 12
 ENTER John 3.75 50
 ENTER Mark 3.8 24
 ENTER Shafaet 3.7 35
 SERVED
 SERVED
 ENTER Samiha 3.85 36
 SERVED
 ENTER Ashley 3.9 42
 ENTER Maria 3.6 46
 ENTER Anik 3.95 49
 ENTER Anik 3.95 50
 SERVED
 */

/** Senario 2 Result Maria**
 5
 ENTER Maria 3.6 46
 ENTER Anik 3.95 49
 ENTER Dan 3.95 50
 SERVED
 SERVED
 */


/**
 * ENTER John 3.75 50 [John 3.75 50]
 * ENTER Mark 3.8 24 [John 3.75 50, Mark 3.8 24]
 * ENTER Shafaet 3.7 35 [John 3.75 50, Mark 3.8 24, Shafaet 3.7 35]
 * SERVED // removed highest CGPA first,
 * SERVED
 * ENTER Samiha 3.85 36
 * SERVED
 * ENTER Ashley 3.9 42
 * ENTER Maria 3.6 46
 * ENTER Anik 3.95 49
 * ENTER Dan 3.95 50
 * SERVED
 */


/**
 * In computer science, a priority queue is an abstract data type which is like a regular queue, but where additionally each element has a "priority" associated with it. In a priority queue, an element with high priority is served before an element with low priority. - Wikipedia
 * <p>
 * In this problem we will test your knowledge on Java Priority Queue.
 * <p>
 * There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED, can take place which are described below.
 * <p>
 * ENTER: A student with some priority enters the queue to be served.
 * SERVED: The student with the highest priority is served (removed) from the queue.
 * A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):
 * <p>
 * The student having the highest Cumulative Grade Point Average (CGPA) is served first.
 * Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
 * Any students having the same CGPA and name will be served in ascending order of the id.
 * Create the following two classes:
 * <p>
 * The Student class should implement:
 * The constructor Student(int id, String name, double cgpa).
 * The method int getID() to return the id of the student.
 * The method String getName() to return the name of the student.
 * The method double getCGPA() to return the CGPA of the student.
 * The Priorities class should implement the method List<Student> getStudents(List<String> events) to process all the given events and return all the students yet to be served in the priority order.
 * Input Format
 * <p>
 * The first line contains an integer, , describing the total number of events. Each of the  subsequent lines will be of the following two forms:
 * <p>
 * ENTER name CGPA id: The student to be inserted into the priority queue.
 * SERVED: The highest priority student in the queue was served.
 * The locked stub code in the editor reads the input and tests the correctness of the Student and Priorities classes implementation.
 * <p>
 * Constraints
 *
 * <p>
 * Output Format
 * <p>
 * The locked stub code prints the names of the students yet to be served in the priority order. If there are no such student, then the code prints EMPTY.
 * <p>
 * Sample Input 0
 * <p>
 * 12
 * ENTER John 3.75 50
 * ENTER Mark 3.8 24
 * ENTER Shafaet 3.7 35
 * SERVED
 * SERVED
 * ENTER Samiha 3.85 36
 * SERVED
 * ENTER Ashley 3.9 42
 * ENTER Maria 3.6 46
 * ENTER Anik 3.95 49
 * ENTER Dan 3.95 50
 * SERVED
 * Sample Output 0
 * <p>
 * Dan
 * Ashley
 * Shafaet
 * Maria
 * Explanation 0
 * <p>
 * In this case, the number of events is 12. Let the name of the queue be Q.
 * <p>
 * John is added to Q. So, it contains (John, 3.75, 50).
 * Mark is added to Q. So, it contains (John, 3.75, 50) and (Mark, 3.8, 24).
 * Shafaet is added to Q. So, it contains (John, 3.75, 50), (Mark, 3.8, 24), and (Shafaet, 3.7, 35).
 * Mark is served as he has the highest CGPA. So, Q contains (John, 3.75, 50) and (Shafaet, 3.7, 35).
 * John is served next as he has the highest CGPA. So, Q contains (Shafaet, 3.7, 35).
 * Samiha is added to Q. So, it contains (Shafaet, 3.7, 35) and (Samiha, 3.85, 36).
 * Samiha is served as she has the highest CGPA. So, Q contains (Shafaet, 3.7, 35).
 * Now, four more students are added to Q. So, it contains (Shafaet, 3.7, 35), (Ashley, 3.9, 42), (Maria, 3.6, 46), (Anik, 3.95, 49), and (Dan, 3.95, 50).
 * Anik is served because though both Anil and Dan have the highest CGPA but Anik comes first when sorted in alphabetic order. So, Q contains (Dan, 3.95, 50), (Ashley, 3.9, 42), (Shafaet, 3.7, 35), and (Maria, 3.6, 46).
 * As all events are completed, the name of each of the remaining students is printed on a new line.
 */
