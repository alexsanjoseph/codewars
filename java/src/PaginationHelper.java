import java.util.List;

public class PaginationHelper<I> {

  /**
   * The constructor takes in an array of items and a integer indicating how many
   * items fit within a single page
   */
  List <?> pages;
  int itemsPerPage;

  public PaginationHelper(List<I> collection, int itemsPerPage) {
    pages = collection;
    this.itemsPerPage = itemsPerPage;
  }

  /**
   * returns the number of items within the entire collection
   */
  public int itemCount() {
    return this.pages.size();
  }

  /**
   * returns the number of pages
   */
  public int pageCount() {
    return this.itemCount()/itemsPerPage + 1;
  }

  /**
   * returns the number of items on the current page. page_index is zero based.
   * this method should return -1 for pageIndex values that are out of range
   */
  public int pageItemCount(int pageIndex) {
    if (pageIndex < 0 || pageIndex > pageCount() - 1) return -1;
    if (pageIndex == pageCount() -  1) return itemCount() % itemsPerPage;
    return itemsPerPage;
  }

  /**
   * determines what page an item is on. Zero based indexes
   * this method should return -1 for itemIndex values that are out of range
   */
  public int pageIndex(int itemIndex) {
    if (itemIndex < 0 || itemIndex > itemCount() - 1) return -1;
    return itemIndex/itemsPerPage;
  }
}