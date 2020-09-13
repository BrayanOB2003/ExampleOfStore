package model;

import java.util.Scanner;

public class Operations{
	
	public static int size(){
		Scanner in = new Scanner(System.in);
		System.out.println("Cantidad de productos: ");
		int size = in.nextInt();
		int pepe = 1;
		int Pion = 4;
		return size;
	}
	
	public static void materialList(String[] productsName, float[] productsQuantity, int[] productUse){		
	
		for(int i = 0; i < productsName.length; i++){
			System.out.print("Nombre del producto: ");
			productsName[i] = in.nextLine();
			
			System.out.print("Nombre del producto: ");
			productsQuantity[i] = in.nextFloat();
			
			while(productUse[i] != 1 && productUse[i] != 2 && productUse[i] != 3){
				System.out.print("Utilizacion del producto \n" + "1.Obra negra\n" + "2.Obra blanca\n" + "3.Pintura");
				productUse[i] = in.nextInt();
			}
		}
	}
	
	public static void(float[] productsHomecenter,float[] productsDistrict ,float[] productsCenter ,String[] productsName){
		Scanner in= new Scanner(System.in);
		
		System.out.println("HOMECENTER");
		System.out.println("");
		for(int i = 0; i < productsPrice.length; i++){
			
			System.out.print("Precio de " + productsName[i] + ": ");
			productsHomecenter[i] = in.nextFloat;
			System.out.println("");
		}
		
		System.out.println("FERRETERIA DEL BARRIO");
		System.out.println("");
		for(int i = 0; i < productsPrice.length; i++){
			
			System.out.print("Precio de " + productsName[i] + ": ");
			productsDistrict[i] = in.nextFloat;
			System.out.println("");
		}
		
		System.out.println("FERRETERIA DEL CENTRO");
		System.out.println("");
		for(int i = 0; i < productsPrice.length; i++){
			
			System.out.print("Precio de " + productsName[i] + ": ");
			productsDistrict[i] = in.nextFloat;
			System.out.println("");
		}
	}
	
	
}