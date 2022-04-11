package parth;
import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("C:\\Intel\\ww2.txt");    
             String s="Parth Is Cool and Dumbo is Cute";
             byte b[]=s.getBytes();
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  

