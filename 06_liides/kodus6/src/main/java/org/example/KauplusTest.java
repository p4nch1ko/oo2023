package org.example;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KauplusTest {

    @Test
    public void testKauplus() {
        Kauplus kauplus = new Kauplus();

        TSark TSark1 = new TSark("basic white", 10, "M");
        TSark TSark2 = new TSark("grey", 11, "S");
        Sark Sark1 = new Sark("black", 20, "L");
        Sark Sark2 = new Sark("pink", 25, "M");


        kauplus.addToode(TSark1);
        kauplus.addToode(TSark2);
        kauplus.addToode(Sark1);
        kauplus.addToode(Sark2);

        ArrayList<Toode> tooded = kauplus.getTooded();
        assertEquals(4, tooded.size());
        assertEquals("basic white", tooded.get(0).getName());
        assertEquals("grey", tooded.get(1).getName());
        assertEquals("black", tooded.get(2).getName());
        assertEquals("pink", tooded.get(3).getName());

        kauplus.sellToode(TSark2);
        tooded = kauplus.getTooded();
        assertEquals(3, tooded.size());
        assertEquals("basic white", tooded.get(0).getName());
        assertEquals("black", tooded.get(1).getName());
        assertEquals("pink", tooded.get(2).getName());
    }
}
