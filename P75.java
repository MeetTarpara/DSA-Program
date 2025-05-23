import java.util.*;

public class P75 {
    public static int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]); // Sort by deadline

        List<Integer> selected = new ArrayList<>(); // To store durations
        int time = 0;

        for (int[] course : courses) {
            time += course[0];
            selected.add(course[0]);

            // If total time exceeds the deadline, remove the biggest duration course
            if (time > course[1]) {
                int maxDuration = Collections.max(selected);
                selected.remove(Integer.valueOf(maxDuration));
                time -= maxDuration;
            }
        }

        return selected.size();
    }

    public static void main(String[] args) {
        int[][] courses = { { 100, 200 }, { 200, 1300 }, { 1000, 1250 }, { 2000, 3200 } };
        System.out.println("Max courses that can be taken: " + scheduleCourse(courses));
    }
}