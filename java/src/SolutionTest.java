import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.Arrays;

public class SolutionTest {

  PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);

  @Test
  public void pageCount() {
    assertEquals(2, helper.pageCount());
  }

  @Test
  public void itemCount() {
    assertEquals(6, helper.itemCount());
  }

  @Test
  public void pageItemCount() {
    assertEquals(4, helper.pageItemCount(0));
    assertEquals(2, helper.pageItemCount(1));
    assertEquals(-1, helper.pageItemCount(2));
  }

  @Test
  public void pageIndex() {
    assertEquals(1, helper.pageIndex(5));
    assertEquals(0, helper.pageIndex(2));
    assertEquals(-1, helper.pageIndex(20));
    assertEquals(-1, helper.pageIndex(-10));
  }
}
