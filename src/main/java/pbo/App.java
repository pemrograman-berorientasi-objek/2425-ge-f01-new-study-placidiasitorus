import java.util.*;
import pbo.DrivApp;    

public class App {
    public static void main(String[] args) {

        DrivApp.initializeEntityManager();
        DrivApp.cleanTableStudent();
        DrivApp.cleanTableCourse();
        DrivApp.cleanTableEnrollment();
        String str;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            str = scanner.nextLine();

            if (str.equals("---")) {
                break;
            } else {
                String split[] = str.split("#");

                switch (split[0]) {
                    case "student-add":
                        DrivApp.CreateStudent(split[1], split[2], split[3]);
                        break;
                    case "student-show-all":
                        DrivApp.ShowStudent();
                        break;
                    case "course-add":
                        DrivApp.createCourse(split[1], split[2], Integer.parseInt(split[3]), Integer.parseInt(split[4]));
                        break;
                    case "course-show-all":
                        DrivApp.ShowCourse();
                        break;
                    // enroll
                    case "enroll":
                        DrivApp.createEnroll(split[1], split[2]);
                        break;
                    case "student-show":
                        DrivApp.ShowStudentDetail(split[1]);
                        break;
                    default:
                        break;
                }
            }
        }
         scanner.close();
    }
}
