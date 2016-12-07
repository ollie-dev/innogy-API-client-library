
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import in.ollie.innogysmarthome.entity.link.Link;

public class LinkTest {
    private Link linkToDevice;
    private Link linkToCapability;
    private Link linkToMessage;
    private Link linkToSHC;
    private Link linkToUnknown;

    @Before
    public void setUp() {
        linkToDevice = new Link("/device/76e68e066e874b9da3403223cbf4b048");
        linkToCapability = new Link("/capability/4ab7788f5aa745de852e1b3e133320f2");
        linkToMessage = new Link("/message/bd57a0ab619b429d9de32e6f2ea68a27");
        linkToSHC = new Link("/desc/device/SHC.RWE/1.0");
        linkToUnknown = new Link("/<UNKNOWN>/76e68e066e874b9da3403223cbf4b048");
    }

    @Test
    public void testGetValue() {
        assertSame(linkToDevice.getValue(), "/device/76e68e066e874b9da3403223cbf4b048");
        assertSame(linkToCapability.getValue(), "/capability/4ab7788f5aa745de852e1b3e133320f2");
        assertSame(linkToMessage.getValue(), "/message/bd57a0ab619b429d9de32e6f2ea68a27");
        assertSame(linkToSHC.getValue(), "/desc/device/SHC.RWE/1.0");
        assertSame(linkToUnknown.getValue(), "/<UNKNOWN>/76e68e066e874b9da3403223cbf4b048");
    }

    @Test
    public void testLinkIsDeviceType() {
        assertTrue(linkToDevice.isTypeDevice());
        assertFalse(linkToCapability.isTypeDevice());
        assertFalse(linkToMessage.isTypeDevice());
        assertFalse(linkToSHC.isTypeDevice());
        assertFalse(linkToUnknown.isTypeDevice());

    }

    @Test
    public void testLinkIsCapabilityType() {
        assertTrue(linkToCapability.isTypeCapability());
        assertFalse(linkToDevice.isTypeCapability());
        assertFalse(linkToMessage.isTypeCapability());
        assertFalse(linkToSHC.isTypeCapability());
        assertFalse(linkToUnknown.isTypeCapability());

    }

    @Test
    public void testLinkIsMessageType() {
        assertFalse(linkToCapability.isTypeMessage());
        assertFalse(linkToDevice.isTypeMessage());
        assertTrue(linkToMessage.isTypeMessage());
        assertFalse(linkToSHC.isTypeMessage());
        assertFalse(linkToUnknown.isTypeMessage());
    }

    @Test
    public void testLinkIsSHCType() {
        assertFalse(linkToCapability.isTypeSHC());
        assertFalse(linkToDevice.isTypeSHC());
        assertFalse(linkToMessage.isTypeSHC());
        assertTrue(linkToSHC.isTypeSHC());
        assertFalse(linkToUnknown.isTypeSHC());
    }

    @Test
    public void testLinkIsUnknownType() {
        assertFalse(linkToCapability.isTypeUnknown());
        assertFalse(linkToDevice.isTypeUnknown());
        assertFalse(linkToMessage.isTypeUnknown());
        assertFalse(linkToSHC.isTypeUnknown());
        assertTrue(linkToUnknown.isTypeUnknown());
    }

    @Test
    public void testGetLinkType() {
        assertTrue(linkToCapability.getLinkType().equals(Link.LINK_TYPE_CAPABILITY));
        assertTrue(linkToDevice.getLinkType().equals(Link.LINK_TYPE_DEVICE));
        assertTrue(linkToMessage.getLinkType().equals(Link.LINK_TYPE_MESSAGE));
        assertTrue(linkToSHC.getLinkType().equals(Link.LINK_TYPE_SHC));
        assertTrue(linkToUnknown.getLinkType().equals(Link.LINK_TYPE_UNKNOWN));
    }

}
