package javaapplication1;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;
public class Java2 {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Random rand = new Random();
        Vector vec = new Vector();
        
        for (int i = 0; i <8 ; i++) {
            System.out.println(rand.nextInt(8));
            vec.add(rand.nextInt(8));
        }
        
        System.out.println(vec);
        
        
        File f = new File("Hello.txt");
        f.createNewFile();
        FileWriter fwriter = new FileWriter(f);
        
        
        
        fwriter.write("this a string \n");
        fwriter.append("this  a new String ");
        fwriter.flush();
        fwriter.close();
        
        
        File f2 = new File("GreanFile.24");
        FileUtils fUtils = new FileUtils();
        
        
        try{
        
            fUtils.copyFile(f, f2);
        }catch(IOException e){
            System.out.println(e);
        }
        
        System.out.println("Done");
    
    }
    
}