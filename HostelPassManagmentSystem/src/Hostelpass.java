public class Hostelpass {



        int passId;
        int studentId;
        String reason;
        String status;

        Hostelpass( int passId, int studentId, String reason){
            this.passId = passId;
            this.studentId = studentId;
            this.reason = reason;
            this.status = "Pending";
        }
    }
