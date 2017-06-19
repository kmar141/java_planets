import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PlanetTest{

  Planet planet;

  @Before
  public void before(){
    planet = new Planet("Endor", 1337);

  }

  @Test
  public void hasName(){
    assertEquals("Endor", planet.getName());
  }

  @Test
  public void hasSize(){
    assertEquals(1337, planet.getSize());
  }

  @Test
  public void canExplode(){
    assertEquals("Boom! Endor has exploded", planet.hasExploded());
  }



}