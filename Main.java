//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        LibrarySystem librarySystem = new LibrarySystem();
        GradingSystem gradingSystem = new GradingSystem();

        SchoolManagementApp attendanceSystemAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp librarySystemAdapter = new LibrarySystemAdapter(librarySystem);
        SchoolManagementApp gradingSystemAdapter = new GradingSystemAdapter(gradingSystem);

        System.out.println(attendanceSystemAdapter.integrateSystem());
        System.out.println( librarySystemAdapter.integrateSystem());
        System.out.println(gradingSystemAdapter.integrateSystem());

    }
}