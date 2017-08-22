/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibofact;

/**
 *
 * @author Diego Herrera y Ángel Hernández Velazquez
 * @version: 2.0
 */
public class cFibo {
    //Metodo constructor
    public cFibo(){
        
    }
    //Metodo para calcular fibonacci
    public String Conv(long numero){
        long num;
        num=numero;
        long re=1;
        long anterior =1;
        String Resul="";
        if(num==1)
        {
            re =0;
            Resul = "El número es: "+Long.toString(re);
            return Resul;
        }
        else{
            if(num ==2){
                re =1;
                Resul = "0,1, su resultado final es: "+Long.toString(re);
                return Resul;
            }
        }
        for(long i=0; i<num-3; i++){
            re = re+ anterior;
            anterior = re-anterior;
            Resul=Resul+Long.toString(re)+" ,"; 
            
        }
        Resul="0,1,1,"+Resul+" su resultado final es: "+Long.toString(re);
        return Resul;
    }
}
