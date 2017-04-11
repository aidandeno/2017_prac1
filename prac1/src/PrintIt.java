import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class PrintIt
{
    public static void main(String[] args)
    {
        String INPUT_FILE = "data/testdata";

        List<String> lines = null;
        try
        {
            lines = Files.readAllLines(Paths.get(INPUT_FILE));
        }
        catch (IOException e)
        {
            System.out.println(INPUT_FILE + "is not a file");
        }

        BinarySearchTree<Record> bst = new BinarySearchTree<>();

        for (String line : lines)
        {
            String name = line.substring(line.lastIndexOf("|") + 1);
            Record record = new Record(name, line);
            bst.insert(record);
        }

        bst.inOrder();
    }
}