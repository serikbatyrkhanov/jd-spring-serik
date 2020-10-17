import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class App {
    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTimeMentor);
        mentor.manageAccount();

        MentorAccount mentor2 = new MentorAccount(partTimeMentor);
        mentor2.manageAccount();
    }
}
