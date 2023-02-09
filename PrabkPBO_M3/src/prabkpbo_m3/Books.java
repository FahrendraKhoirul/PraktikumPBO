package prabkpbo_m3;

public class Books{
    String title;
    String author;
}

class BooksTestDrive{
    public static void main(String[] a){
        Books[] myBooks = new Books[3];
        int x = 0;
        
        // inisialisasi
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        
        // mengisi array
        myBooks[0].title = "Melawan Kemustahilan";
        myBooks[1].title = "Seni Hidup Minimalis";
        myBooks[2].title = "awe-inspirirng me";
        myBooks[0].author = "Dewa eka Prayoga";
        myBooks[1].author = "Fumio Sasaki";
        myBooks[2].author = "Dewi Nur Aisyah";
        
        while(x < myBooks.length){
            System.out.print(myBooks[x].title);
            System.out.print(" karya ");
            System.out.println(myBooks[x].author);
            x++;
        }
    }
}