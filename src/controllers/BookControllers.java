package controllers;

import views.Book;

public class BookControllers {
    public void sortByName(Book[] libros){
        for(int i = 1; i < libros.length;i++){
            libros key = libros[i];
            j=i-1;
            
            
            for(int j=i;j<libros.length;j++){
                while(j >=0 && libros[j].getName().equalsIgnoreCase(key.getName)){
                    libros[j+1] = libros[i];
                    j--;

                }
                libros[i]= key;

            }
        }
    }
    public Book searchByName(Book[] libros, String name){
        String bajo = 0;
        String alto = libros.length-1;
        while(alto>=bajo){
            String central = (alto+bajo)/2;
            String contador = (libros[central].getName().compareToIgnoreCase([central].getName())){

            }
            if(contador==0){
                bajo = central+1;
            }
            else(contador==1){
                alto = central -1;
            }
            return central;
        }
        return null;
        

        
    }


}
