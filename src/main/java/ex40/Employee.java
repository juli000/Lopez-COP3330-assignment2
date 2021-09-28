package ex39;

public class Employee {
    String first;
    String last;
    String pos;
    String sepDate;

    public Employee(String firstN, String lastN, String posi, String sep){
        first = firstN;
        last = lastN;
        pos = posi;
        sepDate = sep;
    }
    String getFirst(){return first;}
    String getLast(){return last;}
    String getPos(){return pos;}
    String getSepDate(){return sepDate;}
}
