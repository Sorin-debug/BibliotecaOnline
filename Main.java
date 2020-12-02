import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Coding Starts here

        File listaBooks = new File("biblioteca.txt");

        Carte carti[] = new Carte[100];
        int contor = 0;

        try {
            Scanner books = new Scanner(listaBooks);

            while (books.hasNextLine()) {

                String value = books.nextLine();

                String[] element = value.split(";");

                int id = Integer.parseInt(element[0]);
                String titlu = element[1];
                String autor = element[2];
                int an = Integer.parseInt(element[3]);
                int pret = Integer.parseInt(element[4]);

                Carte book = new Carte(id, titlu, autor,an,pret);
                carti[contor++] = book;

            }

        }catch(Exception a){
            a.printStackTrace();
        }

        Biblioteca operator = new Biblioteca(carti);
        Scanner console = new Scanner(System.in);
        char menuItem;
        boolean running = true;
        do{
            System.out.println(" ============== Biblioteca Meniu ============");
            System.out.println("'z' – Vezi toate cartile");
            System.out.println("'t' – Afisare cărți după titlu");
            System.out.println("'u' – Căutare cărți după autor");
            System.out.println("'a' – Căutare cărți după an");
            System.out.println("'p' – Afișarea cărților cu prețul mai mic decât o valoare de la tastatura.");
            System.out.println(" ");
            System.out.println("'0' - Pentru a parasi biblioteca.");
            System.out.println(" ============================================");

            System.out.print("Introduceți o opțiune: _");
            menuItem = console.next().charAt(0);

                    switch(menuItem){
                        case 'z':
                            operator.afisareBiblioteca();
                            break;
                        case 't':
                            operator.afisareCartiTitlu();
                            break;
                        case 'u':
                            operator.cautareAutor();
                            break;
                        case 'a':
                            operator.cautareAn();
                            break;
                        case 'p':
                            operator.afisarePret();
                            break;
                        case '0':
                            System.out.println("Multumim pentru vizita, o zi buna !");
                            running = false;
                            break;
                        default:
                            System.out.println("Optiunea nu exista, te rugam alege din meniu!");
                            break;

                    }

        }while(running);

        //end of code - main section
    }
}
