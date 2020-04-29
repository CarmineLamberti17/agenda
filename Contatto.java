class Contatto{
    public String nome;
    public String cognome;
    public String nTel;
    public String email;
    public Contatto next;
    
    public Contatto(String nome, String cognome, String nTel, String email){
        this.nome=nome;
        this.cognome=cognome;
        this.numeroTel=nTel;
        this.email=email;
        this.next=null;
    }
}
