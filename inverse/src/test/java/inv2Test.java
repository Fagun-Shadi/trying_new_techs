import static org.junit.jupiter.api.Assertions.*;

class inv2Test {

    @org.junit.jupiter.api.Test
    void determ() {

        int [][] arr = {{4,2},{7,6}};
        inv2 obj = new inv2();
        float val = obj.determ(arr);
        assertEquals(10, val);

    }
}