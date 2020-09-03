package com.factorybean.factorybean.structural;

import com.factorybean.factorybean.structural.decorator.Flowers;
import com.factorybean.factorybean.structural.decorator.Table;
import com.factorybean.factorybean.structural.decorator.TableImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DecoratorPatternIntegrationTest {

    @Test
    public void testDecorateTable(){

        Table table1 = new Flowers(new Flowers(new Flowers(new TableImpl())));
        assertEquals("Table with flowers with flowers with flowers",table1.decorate());

        Table table2 = new Flowers(new TableImpl());
        assertEquals("Table with flowers",table2.decorate());
    }
}
