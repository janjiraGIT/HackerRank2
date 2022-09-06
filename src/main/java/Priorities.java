import java.util.*;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Priorities {

    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> studentQueue = new PriorityQueue<>
                (Comparator.comparing(Student::getCGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId));

        for (String event : events) {
            if (event.equals("SERVED")) {
                studentQueue.poll();
            } else {
                String[] tokens = event.split(" ");
                studentQueue.add(new Student(Integer.parseInt(tokens[3]), tokens[1], Double.parseDouble(tokens[2])));
            }
        }

        return Stream.generate(studentQueue::poll)
                .limit(studentQueue.size())
                .collect(Collectors.toList());

    }
}
