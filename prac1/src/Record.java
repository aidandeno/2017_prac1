public class Record implements Comparable<Record>
{
    private String fullName;
    private String fullEntry;

    Record(String fullName, String fullEntry)
    {
        this.fullName = fullName;
        this.fullEntry = fullEntry;
    }

    public int compareTo(Record other)
    {
        return this.fullName.compareTo(other.fullName);
    }

    public String toString()
    {
        return this.fullEntry;
    }
}
