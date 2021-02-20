import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
public class HW2Qstn4 {
    public static void main(String [] args)throws IOException {
        Scanner s=new Scanner (System.in);

        //creates the file
        String path = System.getProperty("User.dir") + "\\dir\\";

        File F = new File(path);
        if (F.mkdir()) {
            System.out.println("Success");
        }

        // creates FileWriter object
        FileWriter writer = new FileWriter(F);
        String path = System.getProperty("user.dir") + "Student Directory";
        File folder = new File(path);
        if (folder.mkdir()) {
            System.out.println("Exists");
        }
        String name, age, major, gender, info, dir = args[1],  fileName = "StudentPersonalInfo";


        System.out.println("What is your name?" );
        s.nextLine();
        name = s.nextLine();


        System.out.println("What is your age?" );
        s.nextLine();
        age = s.nextLine();

        System.out.println("What is your gender?" );
        s.nextLine();
        gender = s.nextLine();

        System.out.println("Insert student's major");
        major = s.nextLine();

        info = name + "\n" + age + "\n" + gender + "\n" + major + "\n";

        try {
            classBW.writeBufferedWriter(info, dir, fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ReadDir {
    public static void Read() {
        String[] paths;

        try {
            // create new file object
            File file = new File("/tmp");
            // array of files and dir
            paths = file.list();

            // names in path array
            assert paths != null;
            for(String path:paths) {
                // prints filename and directory name
                System.out.println(path);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
}
