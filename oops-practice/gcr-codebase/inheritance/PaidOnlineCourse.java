package Inheritance;

class PaidOnlineCourse extends OnlineCourse {
	double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration,
                     String platform, boolean isRecorded,
                     double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayDetails() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " hours");
        System.out.println("Platform    : " + platform);
        System.out.println("Recorded    : " + isRecorded);
        System.out.println("Fee         : " + fee);
        System.out.println("Discount    : " + discount + "%");
    }
}
