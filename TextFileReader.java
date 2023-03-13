import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class TextFileReader {

    public static void main(String[] args) throws URISyntaxException, IOException {
        //快速读取文本文件为字符串
        //读json并转换为map对象
        URL resource = TextFileReader.class.getClassLoader().getResource("test.json");
        URI uri;
        if(resource!=null){
            uri = resource.toURI();
            Path path = Paths.get(uri);
            //Scanner use path
            //Scanner in = new Scanner(path);
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter("outFile");
            //byte[] bytes = Files.readAllBytes(path);
            //String s = new String(bytes);
            while(in.hasNextLine()){
                String line = in.nextLine();
                if(line.equals("end")){
                    break;
                }else{
                    out.println(line);
                }

            }
            out.flush();
            out.close();
        }




    }
}
