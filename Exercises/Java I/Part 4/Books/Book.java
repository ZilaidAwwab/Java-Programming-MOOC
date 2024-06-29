public class Book {
  private String title;
  private int pages;
  private int publicationYear;

  public Book(String title, int pages, int publicationYear) {
    this.title = title;
    this.pages = pages;
    this.publicationYear = publicationYear;
  }

  public String getName() {
    return this.title;
  }

  public int getPages() {
    return this.pages;
  }

  public int getPublicationYear() {
    return this.publicationYear;
  }

  public String toString() {
    return this.title + ", " + this.pages + " pages, " + this.publicationYear;
  }
}
