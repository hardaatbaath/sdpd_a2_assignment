package androidsamples.java.dicegames;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import static org.mockito.Mockito.*;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class WalletTest {
    Die d;
    WalletViewModel wv;
    private  WalletViewModel m;
    private  Die d1;

    @Before
    public void initialize() {
        d = new Die6();
        m = new WalletViewModel();
        wv=new WalletViewModel();
        d1= mock(Die6.class);
    }
    @Test
    public void valueIsBetween1And6() {
        d.roll();
        int value = d.value();
        assertTrue(value >= 1 && value <= 6);
    }



    @Test
    public void Non6Value(){
        int prev=m.previousRoll();
        int balance=m.balance();
        when(d1.value()).thenReturn(1);
        m.setDie(d1);
        m.dieValue();
        if (prev!=1)
            assertEquals(balance,m.balance());
        else assertEquals(balance-5,m.balance());
    }

    @Test
    public void valueDoesNotChangeUnlessRolled() {

        d.roll();
        int valueOld = d.value();
        int valueNew = d.value();
        assertEquals(valueNew, valueOld);
    }


    @Test
    public void NoOfSixes()
    {
        int sixroll=m.singleSixes();

        when(d1.value()).thenReturn(6);
        m.setDie(d1);
        m.rollDie();
        m.dieValue();
        m.dieValue();
        assertEquals(sixroll+1,m.singleSixes());


    }
    @Test
    public void TotalROLLS()
    {

        wv.setDie(d);
        int totRolls=wv.totalRolls();
        wv.rollDie();
        assertEquals(totRolls+1,wv.totalRolls());


    }



}
