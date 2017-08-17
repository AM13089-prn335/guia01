
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;

/**
 *
 * @author PC04
 */
public class Utilities {
     
    /**
     * 
     * @param texto
     * @return el metodo resume lee las primeras 30 caracteres
     */
    public String getResume(String texto){
        
        String cadena="";
        int aumento=0;
        boolean existe=false;
  
            do{
                cadena=cadena+texto.charAt(aumento);
                 aumento++;
                  if(aumento<=texto.length()){ 
                    existe =false;
               } 
                  
                    else{
                     existe=true;
                  } 
            }
            while(existe==false);
            return cadena;
    
    }
    
    
    public String Capitalizar(String texto){
       String letra1,letra2;
        //recorre el texto ingresado
        for(int numero=0;numero<=texto.length();numero++){
            letra1=""+texto.charAt(numero);
            if(letra1.equals("")){
                
              
            }
 
        }
       
    return texto ;
    
    
    }

    /**
     * 
     * @param frase
     * @param texto
     * @return el metodo contarcoincidencias de una frase 
     */
public int ContarCoincidencias(String frase,String texto){
    
    int contar=0;
    frase.getBytes();
    
    if(frase.equals(texto)){
        contar++;
    }else{
        contar=0;
    }    
  
    return contar;
    }

}
