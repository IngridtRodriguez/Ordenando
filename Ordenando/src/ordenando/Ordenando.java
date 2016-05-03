package ordenando;

import java.util.Scanner;

public class Ordenando {
    private String[] nombres={"Edna", "Ricardo", "Martin",
                                "Obama", "Hermana", "Zapato",
                                "Alisson", "Ana", "Ferguso"};
    
     
    private Contacto[] contactos= new Contacto[nombres.length];
    
    
     public Ordenando(){
         populaContactos(contactos, nombres);
         imprimir(contactos);
         
         System.out.println("\n");
         ordenaContact(contactos);
         imprimir(contactos);
         
        int opc;
        Scanner sc=new Scanner(System.in);
        
        do{
            System.out.println("\nMENU DE BÚSQUEDA\n 1)Secuencial \t2)Binaria\t3)Salir\n Escoja una opción");
            opc=sc.nextInt();
        
            switch(opc)
            {
                case 1: 
                    busquedaSec(contactos);
                    break;
                
                case 2:
                    busquedaBin(contactos);
                break;
                    
                case 3:
                    System.exit(0);
                    break;
                    
                default: System.out.println("Opción no válida, Ingrese un número en el menú");
                
                
        }
        }while (opc!=3);
         
     }   
    
     //TRANSFORMANDO EL ARRAY DE NOMBRES A OBJETOS
     public void populaContactos(Contacto[] con, String[] nomb)
     {
         int i,j;
         for(i=0;i<con.length;i++)
         {
             for(j=0;j<con.length;j++)
             {
             con[i]=new Contacto(nomb[i]);
                     }
         }
     }
     
     //IMPRIME OBJETO DE LA CLASE CONTACTO
     public void imprimir(Contacto[]con)
     {
         int i;
         
         System.out.println("Contactos: \t\t Telefono");
         for(i=0;i<con.length;i++)
             System.out.println((i+1)+"\t"+con[i].getNomb() + "\t\t "+ con[i].getNumero());
     }
     
     //MÉTODO DE ORDENACIÓN BURBUJA
     public void ordenaContact(Contacto[] con)
     {
         int i, j;
         String s1 =""; String s2= "";
         
         for (i=0;i<con.length;i++)
         {
             for (j=0;j<i;j++)
             {
                 //Positivo cuando con[i] es menor a con[j]
                 if(con[i].getNomb().compareTo(con[j].getNomb())<0)
                 {
                     s1=con[j].getNomb();
                     s2=con[i].getNomb();
                     con[j].setNomb(s2);
                     con[i].setNomb(s1);
                     
                 }
             }
         }
     }
     
     //BUSQUEDA SECUENCIAL
     public void busquedaSec(Contacto[]con)
     {
         int dato,i;
         
         Scanner sc=new Scanner(System.in);
         System.out.println("Qué número desea buscar?");
                    dato=sc.nextInt();
                    for (i=0;i<con.length;i++)
                    {
                        if(dato==con[i].getNumero())
                        {
                            System.out.println("El número que busca está en la posición "+ (i+1)+ " y pertenece a "+ con[i].getNomb());
                        }
                    }
     }
     
     //BÚSQUEDA BINARIA
     public void busquedaBin(Contacto[] con)
     {
         int dato,i,centro, sup=con.length , inf=0;
         
         Scanner sc=new Scanner(System.in);
         System.out.println("Qué número desea buscar?");
         dato=sc.nextInt();
                
                    while(inf<=sup)
                    {
                        centro= ((sup-inf)/2) + inf;
                        if (con[centro].getNumero()==dato)
                        {
                            System.out.println("El telefono que busca está en "+ (centro+1));
                            break;
                        }
                                                    
                        else if (dato < con[centro].getNumero())
                        {
                            sup=centro-1;
                        }
                        else
                        {
                            inf=centro+1;
                        }
                    }
                    
     }
     
    public static void main(String[] args) {
        new Ordenando();
        
    }
    
}