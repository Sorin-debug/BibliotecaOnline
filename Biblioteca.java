import java.util.Scanner;

public class Biblioteca {

    private Carte carti[];

public Biblioteca(Carte carti[]){
    this.carti = carti;
}

private void afisareObiect(Carte x){

    System.out.println("ID: "+ x.getId());
    System.out.println("#####################################");
    System.out.println("Titlu: " + x.getTitlu());
    System.out.println("Autor: " + x.getAutor());
    System.out.println("Anul: " + x.getAn());
    System.out.println("Pret carte: " +  x.getPret() + " lei.");
    System.out.println("");



}


public void afisareBiblioteca(){
    System.out.println("Afisare toate cartile disponibile:");
    for (Carte x : carti) {
        if (x != null) {
            afisareObiect(x);
        }
    }
}


    public void afisareCartiTitlu(){
    System.out.println("Afisare dupa Titlu carti disponibile:");
        for (Carte x : carti) {
            if (x != null) {
                System.out.println("ID: "+ x.getId() + " -> Titlu: " + x.getTitlu());
            }
        }
        System.out.println(" ");
    }


public void cautareAutor(){
    System.out.print("Cautare dupa autor, introduce numele autorului: ");
    String autorName;
    Scanner checkAutor = new Scanner(System.in);
    autorName = checkAutor.nextLine();
    for (Carte x : carti) {
        if (x != null) {
            if (x.getAutor().toLowerCase().contains(autorName.toLowerCase())) {
            // metoda de afisare privata
               afisareObiect(x);
            }
        }
    }
}

public void cautareAn(){
    System.out.print("Cautare carti dupa anul lansarii, introduce anul dorit: ");
    int anIn;
    Scanner checkAn = new Scanner(System.in);
    anIn = checkAn.nextInt();
    int numara = 0;
    for (Carte x : carti) {
        if (x != null) {
            if (x.getAn() == anIn) {
                System.out.println("ID: " + x.getId());
                System.out.println("#####################################");
                System.out.println("Titlu: " + x.getTitlu());
                System.out.println("Autor: " + x.getAutor());
                System.out.println("Anul: " + x.getAn());
                System.out.println("Pret carte: " + x.getPret() + " lei.");
                System.out.println("");
                numara++;
            }
        }
    }

    if(numara == 0){
        System.out.println("#############");
        System.out.println("Ne pare rau dar nu avem carti dupa anul cautat. ");
        System.out.println("#############");
    }
}

public void afisarePret(){

    System.out.print("Introduce pretul maxim pentru carte: ");
    int checkprice;
    Scanner pretIn = new Scanner(System.in);
    checkprice = pretIn.nextInt();
    for (Carte x : carti) {
        if (x != null) {
            if (x.getPret() < checkprice) {

                System.out.println("ID: " + x.getId());
                System.out.println("#####################################");
                System.out.println("Titlu: " + x.getTitlu());
                System.out.println("Autor: " + x.getAutor());
                System.out.println("Anul: " + x.getAn());
                System.out.println("Pret carte: " + x.getPret() + " lei.");
                System.out.println("");


            }
        }
    }
}

//end of Biblioteca

}
