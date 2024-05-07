package codingnotes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SomeListTest {

    @Test
    void addElement() {
        SomeList someList = new SomeList();
        ArrayList<String> newList = new ArrayList<>();
        someList.addElement(newList);
        assertEquals(1, newList.size());
    }
}