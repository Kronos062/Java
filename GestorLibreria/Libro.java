public class Libro {
    //declaro de que va a estar compuesto libro
    private int id;
    private String titulo;
    private String autor;
    private int año;
    //Creo "libro"
    public Libro(int id, String titulo, String autor, int año) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }
    //voy a hacer los get y los set
    public int getId() { retiurn id; }
    public String getTilulo() {return titulo; }
    public String getAutor() { return autor;}
    public int getAño() { return año; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setAño(int año) { this.año = año; }
}