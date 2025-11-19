import org.junit.jupiter.api.Test;
import org.wallet.PorteFeuille;

import static org.junit.jupiter.api.Assertions.*;

class PorteFeuilleTest {

    @Test
    void testAddMoney() {
        PorteFeuille pf = new PorteFeuille("Noir", 2, 0.3, "Gucci");
        pf.addMoney(100);
        assertEquals(100, pf.getMoney());
    }

    @Test
    void testCheckMoney() {
        PorteFeuille pf = new PorteFeuille("Noir", 2, 0.3, "Gucci");
        pf.addMoney(50);
        assertTrue(pf.checkMoney(30));
        assertFalse(pf.checkMoney(100));
    }

    @Test
    void testAddCard() {
        PorteFeuille pf = new PorteFeuille("Noir", 2, 0.3, "Gucci");
        pf.addCard();
        assertEquals(3, pf.getPorteCarte());
    }

    @Test
    void testLost() {
        PorteFeuille pf = new PorteFeuille("Noir", 2, 0.3, "Gucci");
        pf.addMoney(50);
        pf.addCard();
        pf.lost();
        assertEquals(0, pf.getMoney());
        assertEquals(0, pf.getPorteCarte());
    }
}

