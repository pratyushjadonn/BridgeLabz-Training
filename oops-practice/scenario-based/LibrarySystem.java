package scenario.based;

public class LibrarySystem {
    static String[] titles={"Java Programming","Data Structures","Operating Systems","Database Management","Computer Networks"};
    static String[] authors={"James Gosling","Mark Weiss","Silberschatz","Elmasri","Tanenbaum"};
    static boolean[] available={true,true,true,true,true};

    public static void displayBooks(){
        for(int i=0;i<titles.length;i++){
            String s=available[i]?"Available":"Checked Out";
            System.out.println(titles[i]+" | "+authors[i]+" | "+s);
        }
    }

    public static void searchBook(String k){
        for(int i=0;i<titles.length;i++){
            if(titles[i].toLowerCase().contains(k.toLowerCase())){
                String s=available[i]?"Available":"Checked Out";
                System.out.println(titles[i]+" | "+authors[i]+" | "+s);
            }
        }
    }

    public static void updateStatus(int i){
        if(i>=0&&i<available.length){
            available[i]=!available[i];
        }
    }

    public static void main(String[] args){
        displayBooks();
        searchBook("data");
        updateStatus(1);
        displayBooks();
    }
}