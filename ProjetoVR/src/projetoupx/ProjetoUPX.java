
package projetoupx;



public class ProjetoUPX {

    
    public static void main(String[] args) {
        
        Connectdb connect = new Connectdb();
        connect.conectaBanco();
        
        
       telas.TelaInicial inicio = new telas.TelaInicial();
       inicio.setVisible(true);
       
       
    }
    
}
