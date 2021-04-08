import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int total = 0;
        int count = 0;
        System.out.println("nhập số tiền mua sách :");
        Scanner sc = new Scanner(System.in);
        int abc  = sc.nextInt();
        ProGramminBook books[] = new ProGramminBook[10];
        books[0] = new ProGramminBook("1", "Book 1", "zed", 12000, 5, "Java", "Msi 1");
        books[1] = new ProGramminBook("2", "Book 2", "zoro", 5000, 5, "Java2", "Msi 2");
        books[2] = new ProGramminBook("3", "book 3", "zed", 7600, 6, "Java", "Msi 3");
        books[3] = new ProGramminBook("4", "book 4", "zed", 19000, 3, "Java1", "Msi 3");
        books[4] = new ProGramminBook("5", "book 5", "zoro", 3900, 10, "Java2", "Msi 1");
        books[5] = new ProGramminBook("6", "book 6", "zoro", 29900, 1, "Java ", "Msi 1");
        books[6] = new ProGramminBook("7", "Book 7", "noa", 5500, 5, "Java2", "Msi 2");
        books[7] = new ProGramminBook("8", "Book 8", "noa", 10500, 5, "Java1", "Msi 3");
        books[8] = new ProGramminBook("9", "Book 9", "noa", 50500, 5, "Java", "Msi 2");
        books[9] = new ProGramminBook("10", "Book 10", "noa", 35500, 5, "Java2", "Msi 3");
        for (int i = 0; i < books.length; i++){
            total += books[i].getAmount();
            if (books[i].getLanguage().equalsIgnoreCase("Java") ){
                count ++;
            }
            if (abc >= books[i].getPrice()){
                System.out.println("sách phù hợp là " + books[i].getName());
            }
        }
        System.out.println("tổng tiền khi mua 10 đầu sách là : "+total);
        System.out.println("số sách có langaege là :"+count);
    }
}
