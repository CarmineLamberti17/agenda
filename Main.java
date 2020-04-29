import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner tastiera=new Scanner(System.in);
		Scanner t=new Scanner(System.in);
		Agenda uso=new Agenda();
		
		String nome;
		String cognome;
		String numeroTel;
		String email;
		int app;
		
		
		do{
		    System.out.printf("1=Inserimento\n");
		    System.out.printf("2=Rimozione\n");
		    System.out.printf("3=Ricerca\n");
		    System.out.printf("4=Stampa\n");
		    System.out.printf("0=Uscire dal menù\n");
		    app=t.nextInt();
		    switch(app){
		        case(1):
		            System.out.printf("Inserire il nome\n");
		            nome=tastiera.nextLine();
		            System.out.printf("Inserire il cognome\n");
		            cognome=tastiera.nextLine();
		            System.out.printf("Inserire il numero telefonico\n");
		            numeroTel=tastiera.nextLine();
		            System.out.printf("Inserire l'email\n");
		            email=tastiera.nextLine();
		            uso.inserimento(nome,cognome,numeroTel,email);
		            break;
		        case(2):
		            System.out.printf("Inserire il nome\n");
		            nome=tastiera.nextLine();
		            System.out.printf("Inserire il cognome\n");
		            cognome=tastiera.nextLine();
		            uso.rimozione(nome,cognome);
		            break;
		        case(3):
		            System.out.printf("Inserire il nome\n");
		            nome=tastiera.nextLine();
		            System.out.printf("Inserire il cognome\n");
		            cognome=tastiera.nextLine();
		            uso.ricerca(nome,cognome);
		            break;
		        case(4):
		            uso.stampa();
		            break;
		        default:
		            break;
		    }
		}while(app!=0);
		
		System.out.printf("Sei uscito dalla rubrica");
		
	}
}
