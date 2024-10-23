import java.util.*;
public class program1 {

    String usn, name, branch;
    long phone;

    void insertStudent(String reg, String nm, String br, long ph)
    {
        usn = reg;
        name = nm;
        branch = br;
        phone = ph;
    }

    void displayStudent()
    {
        System.out.println("***********************");
        System.out.println("USN - " + usn);
        System.out.println("NAME - " + name);
        System.out.println("BRANCH - " + branch);
        System.out.println("PHONE NUMBER - " + phone);
        System.out.println("***********************");
    }

    public static void main(String[] args) {
        program1 st[] = new program1[100];
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter the number of student: ");
        int n = ip.nextInt();
        ip.nextLine();

        for (int i=0; i<n; i++)
            st[i] = new program1();

        for (int j=0; j<n; j++) {
            System.out.println("\nEnter the USN, Name, Branch, Phone Number of student "+(j+1));
            String usn = ip.next();
            String name = ip.next();
            String branch = ip.next();
            long phone = ip.nextLong();
            ip.nextLine();
            st[j].insertStudent(usn, name, branch, phone);
        }

        for (int k=0; k<n; k++) {
            System.out.format("\nStudent %d details\n", k+1);
            st[k].displayStudent();
        }

        ip.close();
    }
}
