package type;

import static org.junit.Assert.*;
import org.junit.Test;

public class TypeTest {

    @Test
    public void TypeTest() {
        Type typeInteger = new Type(new Integer(1));
        assertEquals(typeInteger.getSimpleClassName(), Integer.class.getSimpleName());

        Type typeDouble = new Type(new Double(1.0));
        assertEquals(typeDouble.getSimpleClassName(), Double.class.getSimpleName());

        Type primitiveInt = new Type(1);
        assertEquals(primitiveInt.getSimpleClassName(), Integer.class.getSimpleName());

        Type primitiveDouble = new Type(1.0);
        assertEquals(primitiveDouble.getSimpleClassName(), Double.class.getSimpleName());
    }
}
