import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {


    @Test
    public void exampleTests1() {
        assertEquals("+++\n+++\n+++", Main.generateShape(3));

    }

    @Test
    public void exampleTests2() {

        assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", Main.generateShape(5));

    }

    @Test
    public void exampleTests3() {

        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", Main.generateShape(8));
    }



}
