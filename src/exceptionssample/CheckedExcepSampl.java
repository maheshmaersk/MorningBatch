package exceptionssample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExcepSampl {

    public static void main(String[] args) {

    }

    public void readFile() {
        String fileName = "file does not exist";
        File file = new File(fileName);
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
