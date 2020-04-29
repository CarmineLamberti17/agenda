class Agenda{
    private Contatto head;
    private int counter;
    
    public Agenda(){
        this.head=null;
        this.counter=1;
    }
    
    public void stampa(){
      Contatto attuale=this.head;
        
       
        if(attuale==null){
            System.out.printf("Agenda telefonica vuota\n");
        }
        
        while(attuale!=null){
            System.out.printf("Nome:%s\tCognome:%s\tNumeroTel:%s\tEmail:%s\n",attuale.nome,attuale.cognome,attuale.numeroTel,attuale.email);
            attuale=attuale.next;
        }

    }
    
    public void inserimento(String nome, String cognome, String numeroTel, String email){
        Contatto attuale=this.head;
        Contatto app=null;
        Contatto nuovo=new Contatto(nome,cognome,numeroTel,email);
        
        while(attuale!=null){
            app=attuale;
            attuale=attuale.next;
        }
        
         if(app==null){
            nuovo.next=this.head;
            this.head=nuovo;
        }else{
            app.next=nuovo;
            nuovo.next=attuale;
        }
        
    }
    
    public void ricerca(String nome, String cognome){
        Contatto attuale = this.head;
        Contatto prev = null;
        while(attuale != null && attuale.nome == nome || attuale.cognome == cognome){
            
            prev = attuale;
            attuale = attuale.next;
            
        }
        
        if(attuale == null){
            
            System.out.println("Contatto non trovato nella lista, controlla il nome e il cognome inserito\n");
            return;
            
        }    
        
        System.out.printf("Contatto trovato:\n");
        System.out.printf("Nome:%s\tCognome_%s\tNumerotel:%s\temail%s",attuale.nome,attuale.cognome,attuale.numeroTel,attuale.email);
    }
    
    public void rimozione(String nome, String cognome){
        Contatto attuale = this.head;
        Contatto app = null;
        
        while(attuale != null && attuale.nome == nome || attuale.cognome == cognome){
            
            app = attuale;
            attuale = attuale.next;
            
        }
        
        if(attuale == null){
            
            System.out.println("Contatto non trovato nella lista\n");
            return;
            
        }    
        
        System.out.printf("Contatto trovato\n");
       
        
        if (app == null){
            
            System.out.printf("Contatto da eliminare e' in testa, elimina\n");
            this.head = this.head.next;  
            return;
            
        }
        
        System.out.printf("Contatto da eliminare non e' in testa, elimina\n");
        app.next = app.next.next;
        
        
    }
}