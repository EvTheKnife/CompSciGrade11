public class Driver {
    public static void main(String[] args) {
        Classroom scott = new Classroom();
        
        Classroom martino = new Classroom(217, "Martino", "CS");

        scott.setRoomNum(245);
        scott.setSubject("Chemistry");
        scott.setTeacher("Scott");

        System.out.println(scott);
        System.out.println(martino);

    }
}
