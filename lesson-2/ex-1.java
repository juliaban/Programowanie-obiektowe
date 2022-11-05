final class Book {
    private Author author;
    private Title title;
    private Pages pages;
    private Opinion opinion;

    Book(Author author, Title title, Pages pages, Opinion opinion) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.opinion = opinion;
    }

}

final class Author {
    String firstName;
    String surname;

    public Author(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    void text() {
        System.out.println("Name: " + firstName + "\nSurname: " + surname);
    }
}

final class Title {
    String mainTitle;
    String partOfTitle;

    public Title(String mainTitle, String partOfTitle) {
        this.mainTitle = mainTitle;
        this.partOfTitle = partOfTitle;
    }

    void text() {
        System.out.println("Title:  '" + mainTitle + partOfTitle + "'");
    }
}

final class Pages {
    int chapter;
    int pages;

    public Pages(int chapter, int pages) {
        this.chapter = chapter;
        this.pages = pages;
    }

    void text() {
        System.out.println("Pages: " + pages + "\nChapter: " + chapter);
    }
}

final class Opinion {
    int opinion;

    public Opinion(int opinion) {
        this.opinion = opinion;
    }

    void text() {
        System.out.println("Opinion: " + opinion + "/10");
    }
}

public class ex1 {
    public static void main(String[] args) {
        Author newAuthor = new Author("Joanne", "Rowling");
        Title newTitle = new Title("Harry Potter ", "And the Goblet of Fire");
        Pages newPages = new Pages(50, 432);
        Opinion newOpinion = new Opinion(5);
        newAuthor.text();
        newTitle.text();
        newPages.text();

    }

}
