public class Classroom{

    private int roomNumber;
    private String teacher, subject;


    public Classroom() {
        roomNumber = 0;
        teacher = "";
        subject = "";
    }
    public Classroom(int roomNumber, String teacher, String subject) {
        this.roomNumber = roomNumber;
        this.teacher = teacher;
        this.subject = subject;
    }
    
    public int getRoomNum() {
        return roomNumber;
    }
    public String getTeacher() {
        return teacher;
    }
    public String getSubject() {
        return subject;
    }
    public void setRoomNum(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    @Override
    public String toString() {
        return teacher + "\n" + subject +  "\n" + roomNumber;
    }

}