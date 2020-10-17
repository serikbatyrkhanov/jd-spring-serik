import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;

public class App {
    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor = new FullTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTimeMentor);
        mentor.manageAccount();
    }
}
