import edu.duke.FileResource
public class HelloWorld {
    public <FileResource> void runHello()
    {
        FileResource f;
        f = new FileResource("file.txt");
        for (String line:f.lines())
        {
            System.out.println(line);
        
    }
}
