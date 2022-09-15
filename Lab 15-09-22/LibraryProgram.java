import java.util.Scanner;

class LibraryProgram
{

    String author;
    String bookname;
    int pageno;
  
  LibraryProgram(String author)
  {
     this.author = author;
  }
 
  LibraryProgram(String author,String bookname)
  {
     this.author = author;
     this.bookname = bookname;
  }

  LibraryProgram(String author, String bookname, int pageno)
  {
    this.author = author;
    this.bookname = bookname;
    this.pageno = pageno;
  }


    void showInfo()
  {
     System.out.println("author: " + author);
     System.out.println("bookname: " + bookname);
     System.out.println("pageno: " + pageno);
     System.out.println();
  }

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		LibraryProgram lib1 = new LibraryProgram("R. K. Narayan");
		LibraryProgram lib2 = new LibraryProgram("R. K. Narayan" ,"Dracula");
		LibraryProgram lib3 = new LibraryProgram("R. K. Narayan" ,"Dracula", 38);
		lib1.showInfo();
		lib2.showInfo();
		lib3.showInfo();
		
	}
}