package ejercicio1_morse;

import java.util.Scanner;
//import java.util.StringTokenizer;

public class Ejercicio1_morse {

    public static void main(String[] args) {
        
        String cadena;
        String morse;
        int opcion;
        
        System.out.println("Seleccione una Opción:");
        System.out.println("1) Traduccion de Letras a Morse.");
        System.out.println("2) Traduccion de Morse a Letras.");
        Scanner entrada0 = new Scanner(System.in);
        opcion = entrada0.nextInt();
        
        if(opcion == 1){
        System.out.println("Ingrese Texto: ");
        Scanner entrada1 =  new Scanner(System.in);
        cadena = entrada1.nextLine().toLowerCase();
        
        String base0 = "";
        String[] temp0; //Variable temp1oral
        temp0 = cadena.split(" "); //Particion de la cadena
        
                for(String c_morse : temp0){
                    for(int i = 0; i< c_morse.length();i++){
                   
                if (c_morse.substring(i,i+1).equals("a")) {
                    base0 = base0 + ".-" + " " ;}
                if (c_morse.substring(i,i+1).equals("b")) {
                    base0 = base0 + "-..." + " ";}
                if (c_morse.substring(i,i+1).equals("c")) {
                    base0 = base0 +"-.-." + " ";}
                if (c_morse.substring(i,i+1).equals("d")) {
                    base0 = base0 +"-.." + " ";}
                if (c_morse.substring(i,i+1).equals("e")) {
                    base0 = base0 +"." + " "; }
                if (c_morse.substring(i,i+1).equals("f")) {
                    base0 = base0 +"..-." + " " ;}
                if (c_morse.substring(i,i+1).equals("g")) {
                    base0 = base0 +"--." + " ";}
                if (c_morse.substring(i,i+1).equals("h")) {
                    base0 = base0 +"...." + " "; }
                if (c_morse.substring(i,i+1).equals("i")) {
                    base0 = base0 +".." + " ";}
                if (c_morse.substring(i,i+1).equals("j")) {
                    base0 = base0 +".---" + " ";}
                if (c_morse.substring(i,i+1).equals("i")) {
                    base0 = base0 +"-.-" + " ";}
                if (c_morse.substring(i,i+1).equals("l")) {
                    base0 = base0 +".-.." + " ";}
                if (c_morse.substring(i,i+1).equals("m")) {
                    base0 = base0 +"--" + " ";}
                if (c_morse.substring(i,i+1).equals("n")) {
                    base0 = base0 +"-." + " ";}
                if (c_morse.substring(i,i+1).equals("o")) {
                    base0 = base0 +"----" + " ";}
                if (c_morse.substring(i,i+1).equals("p")) {
                    base0 = base0 +".--." + " ";}
                if (c_morse.substring(i,i+1).equals("q")) {
                    base0 = base0 +"--.-" + " ";}
                if (c_morse.substring(i,i+1).equals("r")) {
                    base0 = base0 +".-." + " ";}
                if (c_morse.substring(i,i+1).equals("s")) {
                    base0 = base0 +"..." + " ";}
                if (c_morse.substring(i,i+1).equals("t")) {
                    base0 = base0 +"-" + " ";}
                if (c_morse.substring(i,i+1).equals("u")) {
                    base0 = base0 +"..-" + " ";}
                if (c_morse.substring(i,i+1).equals("v")) {
                    base0 = base0 +"...-" + " ";}
                if (c_morse.substring(i,i+1).equals("w")) {
                    base0 = base0 +".--" + " ";}
                if (c_morse.substring(i,i+1).equals("x")) {
                    base0 = base0 +"-..-" + " ";}
                if (c_morse.substring(i,i+1).equals("y")) {
                    base0 = base0 +"-.--" + " ";}
                if (c_morse.substring(i,i+1).equals("z")) {
                    base0 = base0 +"--.." + " ";}
                if (c_morse.substring(i,i+1).equals("1")) {
                    base0 = base0 +".----" + " ";}
                if (c_morse.substring(i,i+1).equals("2")) {
                    base0 = base0 +"..---" + " ";}
                if (c_morse.substring(i,i+1).equals("3")) {
                    base0 = base0 +"...--" + " ";}
                if (c_morse.substring(i,i+1).equals("4")) {
                    base0 = base0 +"....-" + " ";}
                if (c_morse.substring(i,i+1).equals("5")) {
                    base0 = base0 +"....." + " ";}
                if (c_morse.substring(i,i+1).equals("6")) {
                    base0 = base0 +"-...." + " ";}
                if (c_morse.substring(i,i+1).equals("7")) {
                    base0 = base0 +"--..." + " ";}
                if (c_morse.substring(i,i+1).equals("8")) {
                    base0 = base0 +"---.." + " ";}
                if (c_morse.substring(i,i+1).equals("9")) {
                    base0 = base0 +"----." + " ";}
                if (c_morse.substring(i,i+1).equals("0")) {
                    base0 = base0 +"-----" + " ";}        
            }base0+= "  ";     
               
          } 
                System.out.println(base0);    
        }       
        else if(opcion == 2){
        
            System.out.println("Ingrese Código Morse: ");
            Scanner entrada2 = new Scanner(System.in);
            morse = entrada2.nextLine();
            
            String base = "";          
            String[] temp1 = morse.split("   ");
            
            for (String temp11 : temp1) {
                for(String temp12 : temp11.split(" ")){
          
                if (temp12.equals(".-")) {
                    base = base + "a" ;}
                if (temp12.equals("-...")) {
                    base = base + "b";}
                if (temp12.equals("-.-.")) {
                    base = base +"c" ;}
                if (temp12.equals("-..")) {
                    base = base +"d" ;}
                if (temp12.equals(".")) {
                    base = base +"e" ;}
                if (temp12.equals("..-.")) {
                    base = base +"f" ;}
                if (temp12.equals("--.")) {
                    base = base +"g" ;}
                if (temp12.equals("....")) {
                    base = base +"h" ;}
                if (temp12.equals("..")) {
                    base = base +"i" ;}
                if (temp12.equals(".---")) {
                    base = base +"j" ;}
                if (temp12.equals("-.-")) {
                    base = base +"k" ;}
                if (temp12.equals(".-..")) {
                    base = base +"l" ;}
                if (temp12.equals("--")) {
                    base = base +"m" ;}
                if (temp12.equals("-.")) {
                    base = base +"n" ;}
                if (temp12.equals("---")) {
                    base = base +"o" ;}
                if (temp12.equals(".--.")) {
                    base = base +"p" ;}
                if (temp12.equals("--.-")) {
                    base = base +"q" ;}
                if (temp12.equals(".-.")) {
                    base = base +"r" ;}
                if (temp12.equals("...")) {
                    base = base +"s" ;}
                if (temp12.equals("-")) {
                    base = base +"t" ;}
                if (temp12.equals("..-")) {
                    base = base +"u" ;}
                if (temp12.equals("...-")) {
                    base = base +"v" ;}
                if (temp12.equals(".--")) {
                    base = base +"w" ;}
                if (temp12.equals("-..-")) {
                    base = base +"x" ;}
                if (temp12.equals("-.--")) {
                    base = base +"y" ;}
                if (temp12.equals("--..")) {
                    base = base +"z" ;}
                if (temp12.equals(".----")) {
                    base = base +"1" ;}
                if (temp12.equals("..---")) {
                    base = base +"2" ;}
                if (temp12.equals("...--")) {
                    base = base +"3" ;}
                if (temp12.equals("....-")) {
                    base = base +"4" ;}
                if (temp12.equals(".....")) {
                    base = base +"5" ;}
                if (temp12.equals("-....")) {
                    base = base +"6" ;}
                if (temp12.equals("--...")) {
                    base = base +"7" ;}
                if (temp12.equals("---..")) {
                    base = base +"8" ;}
                if (temp12.equals("----.")) {
                    base = base +"9" ;}
                if (temp12.equals("-----")) {
                    base = base +"0";}
              } base+= " ";
            } 
              System.out.println(base);  
        }
    }
}

    
        
        
        
        
        
        
        
    


