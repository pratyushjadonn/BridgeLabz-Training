package functional_interface;
interface Backupable {
    // marker interface (empty)
}

class UserData implements Backupable {
    String name;
    int age;

    UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class BackupService {

    static void processBackup(Object obj) {
        if (obj instanceof Backupable) {
            System.out.println("Backing up object...");
        } else {
            System.out.println("Object is NOT eligible for backup");
        }
    }
}

public class BackupApp {
    public static void main(String[] args) {

        UserData user = new UserData("Amit", 25);
        String temp = "Not Backup Data";

        BackupService.processBackup(user);
        BackupService.processBackup(temp);
    }
}
