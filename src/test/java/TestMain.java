import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {


    @Test
    public void exampleTests() {
        assertEquals("+++\n+++\n+++", Main.generateShape(3));
        assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", Main.generateShape(5));
        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", Main.generateShape(8));
    }


}
