package com.rocacher.visitor;
import java.util.ArrayList;


public class Principale
{
    public static void main(String[] args)
    {
		Directory racine = new Directory("racine") ;
		Directory d1 = new Directory("Java") ;
		Directory d2 = new Directory("src") ;

		File f1 = new File("File.java","classe File") ;
		File f2 = new File("Principale.java","classe Principale") ;

		Symlink sl1 = new Symlink("lien",f2) ;
		Symlink sl2 = new Symlink("Java") ;

		racine.add(d1) ;
        racine.add(d2) ;
		d1.add(f2) ;
		d1.add(f1) ;
		d2.add(sl2) ;
		d2.add(sl1) ;


		System.out.println(racine.absoluteAdress()) ;
		System.out.println("ls : ") ;
		racine.ls() ;
		System.out.println("taille : "+racine.size()) ;
		System.out.println("\n") ;

		System.out.println(d1.absoluteAdress()) ;
		System.out.println("ls : ") ;
		d1.ls() ;
		System.out.println("taille : "+d1.size()) ;
		System.out.println("\n") ;

		System.out.println(d2.absoluteAdress()) ;
		System.out.println("ls : ") ;
		d2.ls() ;
		System.out.println("taille : "+d2.size()) ;
		System.out.println("\n") ;

		System.out.println(f1.absoluteAdress()) ;
		System.out.println("cat : ") ;
		f1.cat() ;
		System.out.println("taille : "+f1.size()) ;
		System.out.println("\n") ;

		System.out.println(sl1.absoluteAdress()) ;
		System.out.println("cat : ") ;
		sl1.cat() ;
		System.out.println("taille : "+sl1.size()) ;
		System.out.println("\n") ;

		ArrayList<String> rechercheSimple = racine.find("Java") ;

		System.out.println("resultat de notre recherche simple sur Java dans racine : ") ;
		racine.afficheCollection(rechercheSimple) ;
		System.out.println("\n") ;

		ArrayList<String> rechercheTransitive = racine.findR("Java") ;

		System.out.println("resultat de notre recherche transitive sur Java dans racine : ") ;
		racine.afficheCollection(rechercheTransitive) ;
		System.out.println("\n") ;

		racine.remove(d1) ;
        System.out.println("Dossier d1: Java supprimé") ;

		System.out.println(racine.absoluteAdress()) ;
		System.out.println("ls : ") ;
		racine.ls() ;
		System.out.println("taille : "+racine.size()) ;
		System.out.println("\n") ;

		/*

        Directory d = new Directory("Pastis") ;
        File f = new File("Martini.class","martini") ;
        File f2 = new File("Ricard","ricard") ;
        Directory d2 = new Directory("Eau") ;
        File f3 = new File("GlaÃ§ons.class","glaÃ§ons") ;

        d.add(f) ;
        d.add(f2) ;
        d.add(d2) ;
        d2.add(f3) ;

        File f4 = new File("Duval","duval") ;

        System.out.println("AVANT"+"\n") ;
        System.out.println("taille "+d.name+" : "+d.size()) ;
        System.out.println("taille "+d2.name+" : "+d2.size()) ;
        System.out.println("taille "+f.name+" : "+f.size()) ;
        System.out.println("taille "+f2.name+" : "+f2.size()) ;
        System.out.println("taille "+f3.name+" : "+f3.size()) ;
        System.out.println("taille "+f4.name+" : "+f4.size()) ;

        d.ls();
        d2.ls(); */
    }
}