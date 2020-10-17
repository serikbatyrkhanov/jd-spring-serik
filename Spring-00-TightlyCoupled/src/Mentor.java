public class Mentor {
    FullTimeMentor fullTimeMentor;

    public Mentor(FullTimeMentor fullTimeMentor, PartTimeMentor partTimeMentor) {
        this.fullTimeMentor = fullTimeMentor;
        this.partTimeMentor = partTimeMentor;
    }

    PartTimeMentor partTimeMentor;

    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
    }

}
