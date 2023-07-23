import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PhoneBookTest {


    @Test
    public void testAdd() {
        final int expected = 1;
        final String argumentNumber = "1111111";
        final String argumentNane = "aaa";
        PhoneBook phoneBook = new PhoneBook();

        final int result = phoneBook.add(argumentNane,argumentNumber);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByNumber(){
        PhoneBook phoneBook = new PhoneBook();
        final String argumentNumber = "1111111";
        final String argumentNane = "aaa";
        phoneBook.add(argumentNane,argumentNumber);
        final String expected = "aaa";

        final String result = phoneBook.findByNumber(argumentNumber);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByName(){
        PhoneBook phoneBook = new PhoneBook();
        final String argumentNumber = "1111111";
        final String argumentNane = "aaa";
        phoneBook.add(argumentNane,argumentNumber);
        final String expected = "1111111";

        final String result = phoneBook.findByName(argumentNane);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void printAllNames(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("aaa","1111");
        phoneBook.add("bbb","2222");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("aaa 1111");
        expected.add("bbb 2222");


        final ArrayList<String> result= phoneBook.printAllNames();

        Assertions.assertEquals(expected, result);
    }
}
