
package array2;

/**
 *@version 2.1
 * @author iquintasgonzalez
 */
public class metodos {
    public static void visualizar(String[]nome,int[]dorsais){
        System.out.println("nome"+"dorsal");
        for(int i=0;i<nome.length;i++){
            System.out.println(nome[i]+"\t\t"+dorsais[i]);
        }
    }
    public static void buscar (String []nome,int[]dorsais,int elebus){
        int atopado=0;//non está
        for(int i=0;i<nome.length;i++){
            if(elebus==dorsais[i])
                atopado=1;
            System.out.println("nome atopado"+nome[i]);
            break;
        }
    
    
    
}


}


