import java.io.*;

public class File1 {
    public static void main(String[] args) throws IOException{
	FileInputStream in = null;
	FileOutputStream out = null;

try{
in = new FileInputStream("D:/TY BSC CS 2024/Java Tutorial/sourcefile.txt");
out = new FileOutputStream("D:/TY BSC CS 2024/Java Tutorial/targetfile.txt");

int c;
while((c=in.read())!=-1){
out.write(c);
}
}

finally{
if(in!=null){
in.close();
}
if(out!=null){
in.close();
}
}

    }
}
