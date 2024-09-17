public class AttendanceSystemAdapter implements SchoolManagementApp{
    AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }

    @Override
    public String integrateSystem() {
        return attendanceSystem.markAttendance();
    }
}
