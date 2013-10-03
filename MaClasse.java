import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class MaClasse {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// CREATION TABLEAU VIDE ET INITIALISATION
		//List lum = new LinkedList();
		
		/*
		
		//LECTURE DU FICHIER
		try{
			InputStream flux=new FileInputStream("lena.pgm");
			InputStreamReader lecture=new InputStreamReader(flux);
			BufferedReader buff=new BufferedReader(lecture);
			String ligne= null;
			while ((ligne=buff.readLine())!=null){
				//System.out.println(ligne);
				
				
				String delimiteurs = "/0123456789°~^%$£*-_=+|#'.,;:?!() {}[]`<>\"\t\\<>«»";
				StringTokenizer st = new StringTokenizer (ligne, delimiteurs);
				while (st.hasMoreTokens())	{
					String mot = st.nextToken();
					mot=mot.toLowerCase();
					// Traitement du mot courant
					System.out.println(mot);	
					lum.add((String)mot);  
				
				}
			}
			buff.close(); 
			}		
			catch (Exception e){
			System.out.println(e.toString());
			}
		
		//TRAITEMENT DU FICHIER : MOT PAR MOT
	
			/*
			// Lecture du fichier texte
			Reader reader = new FileReader("lena.pgm");
			// Prise en compte d'une ligne
			BufferedReader in = new BufferedReader(reader);
			String ligne = in.readLine();
			while (ligne != null)	{
				// traitement de la ligne courante: decouper les mots separes par des delimiteurs
				
	            }
				// Lecture de la prochaine ligne 
				ligne = in.readLine();
			}
			
			int i=0;
			for (i=0 ; i<lum.size() ; i++){
				System.out.println(lum.get(i));
			}*/
			
		Scanner sc2 = null;
	    try {
	        sc2 = new Scanner(new File("lena.pgm"));
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();  
	    }
	    
	    int i=0;
	    
	    int tab[]= new int[256];
	    for (int j=0;j<256;j++){
	    	tab[j]=0;
	    }
	    while (sc2.hasNextLine()) {
	            Scanner s2 = new Scanner(sc2.nextLine());
	            i+=1;
	        boolean b;
	        String s;
	       
	        while (b = s2.hasNext()) {
	        	
	        	        
	        	s = s2.next();
	        	 PrintWriter pw = null;
	    		  try {
	    		     File file = new File("resultat.pgm");
	    		     FileWriter fw = new FileWriter(file, true);
	    		     pw = new PrintWriter(fw);
	    		     pw.println(s);
	    		  } catch (IOException e) {
	    		     e.printStackTrace();
	    		  } finally {
	    		     if (pw != null) {
	    		        pw.close();
	    		     }
	    		  }
	            if (i>5){
	            	tab[Integer.parseInt(s)]+=1;
	            	
	            }
	            }	
	        	
	        }
	    
	  
	}
	

}
