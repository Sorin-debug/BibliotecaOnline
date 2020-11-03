public class Carte {

    private int id;
    private String titlu;
    private String autor;
    private int an;
    private int pret;


    public Carte(int id,String titlu,String autor,int an,int pret){
        this.id = id;
        this.titlu = titlu;
        this.autor = autor;
        this.an = an;
        this.pret = pret;


    }

    public int getId() {
        return id;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getAn() {
        return an;
    }

    public int getPret() {
        return pret;
    }
}
