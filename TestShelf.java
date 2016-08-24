import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TestShelf {
  // these lines enable the instances in the before method to be available too all the tests
  Shelf shelf;
  Book book;
  Magazine magazine;

  @Before
  public void before() {
    shelf = new Shelf(10);
    book = new Book();
    magazine = new Magazine();
  }

  @Test
  public void hasLength() {
    assertEquals(10, shelf.getLength() );
  }

  @Test
  public void countTheCollection() {
    assertEquals(0, shelf.countCollection() );
  }

  @Test
  public void putBookOnShelf() {
    shelf.shelve(book);
    assertEquals(1, shelf.countCollection() );
  }

  @Test 
  public void putMagazineOnShelf() {
    shelf.shelve(magazine);
    assertEquals(1, shelf.countCollection());
  }

  @Test
  public void shelfIsFull() {
    assertEquals(false, shelf.isFull());
  }

  @Test 
  public void countContentRating() {
    shelf.shelve(magazine);
    shelf.shelve(magazine);
    shelf.shelve(book);
    assertEquals(8, shelf.contentRating());
  }

  @Test
  public void canTakeBookFromShelf() {
    shelf.shelve(book);
    Shelfable reader = shelf.takeFromShelf();
    assertEquals("Hardback", ((Book)reader).cover());
  }







}