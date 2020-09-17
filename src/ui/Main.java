package ui;
import java.util.Scanner;
import model.*;

public class Main{
	
	public static int size(){
		Scanner in = new Scanner(System.in);
		System.out.print("Numero de productos que quiere comprar: ");
		int size = in.nextInt();
		
		return size;
	}
	
	public static void materialList(String[] productsName, float[] productsQuantity, int[] productsUse){		
		Scanner in  = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < productsName.length; i++){
			System.out.print("Nombre del producto: ");
			productsName[i] = in.nextLine();
			
			System.out.print("Cantidad del producto: ");
			productsQuantity[i] = sc.nextFloat();
			
			System.out.println("Utilizacion del producto \n" + "1.Obra negra\n" + "2.Obra blanca\n" + "3.Pintura");
			productsUse[i] = sc.nextInt();
		}
	}
	
	public static void productsPrice(float[] Homecenter,float[] District ,float[] Center ,String[] productsName){
		Scanner in= new Scanner(System.in);
		System.out.println("Digite el precio de cada prducto en los establecimientos");
		System.out.println("");
		System.out.println("HOMECENTER");
		System.out.println("");
		for(int i = 0; i < Homecenter.length; i++){
			
			System.out.print("Precio de " + productsName[i] + ": ");
			Homecenter[i] = in.nextFloat();
			System.out.println("");
		}
		
		System.out.println("FERRETERIA DEL BARRIO");
		System.out.println("");
		for(int i = 0; i < District.length; i++){
			
			System.out.print("Precio de " + productsName[i] + ": ");
			District[i] = in.nextFloat();
			System.out.println("");
		}
		
		System.out.println("FERRETERIA DEL CENTRO");
		System.out.println("");
		for(int i = 0; i < Center.length; i++){
			
			System.out.print("Precio de " + productsName[i] + ": ");
			Center[i] = in.nextFloat();
			System.out.println("");
		}
	}
	
	public static void printTotalPrice(float[] totalPrice){
		
		System.out.println("El total a pagar en Homecenter es : " + totalPrice[0]);
		System.out.println("El total a pagar en la ferreteria del barrio es : " + totalPrice[1]);
		System.out.println("El total a pagar en la ferreteria del centro es : " + totalPrice[2]);
		
	}
	
	public static void printBetterBuy(float[] betterBuy, String[] place, String[] productsName){
		
		float totalPrice = 0;
		
		System.out.println("Mejores precios");
		System.out.println("");
		for(int i = 0; i < productsName.length; i++){
			
			System.out.println("Producto: " + productsName[i]);
			System.out.println("Tienda: " + place[i]);
			System.out.println("Precio: " + betterBuy[i]);
			
			System.out.println("");
		}
		
		for(int i = 0; i < betterBuy.length; i++){
			totalPrice += betterBuy[i];
		}
		System.out.println("Pago total: " + totalPrice);
		
	}
	
	public static void printProducts(String[] productsName, int[] productsUse){
		
		Scanner sc = new Scanner(System.in);
		int option = 0;
		
		while(option < 4){
			System.out.println("Productos por utilizacion \n" + "1.Obra negra\n" + "2.Obra blanca\n" + "3.Pintura\n" + "4.Terminar");
			option = sc.nextInt();
		
			if(option == 1){
				System.out.println("Materiales usados en obra negra");
				for(int i = 0; i < productsUse.length; i++){
					if(productsUse[i] == 1){
						System.out.println(productsName[i]);
					}
				}
			} else if(option == 2){	
				System.out.println("");
				System.out.println("Materiales usados en obra blanca");
				for(int i = 0; i < productsUse.length; i++){
					if(productsUse[i] == 2){
						System.out.println(productsName[i]);
					}
				}
			} else if(option == 3){	
				System.out.println("");
				System.out.println("Materiales usado en pintura");
				for(int i = 0; i < productsUse.length; i++){
					if(productsUse[i] == 3){
						System.out.println(productsName[i]);
					}
				}
			} else if(option != 4){
				option = 0;
			}
		}
	}
	
	
	public static void main(String[] args){
		int size = size();
		
		String[] productsName = new String[size];
		float[] productsQuantity = new float[size];
		int[] productsUse = new int[size];
		float[] homecenter = new float[size];
		float[] center = new float[size];
		float[] district = new float[size];
		float[] totalPrice = new float[3];
		float[] betterBuy = new float[size];
		String[] place = new String[size];
		
		materialList(productsName,productsQuantity,productsUse);
		productsPrice(homecenter, district, center, productsName);
		Operations.totalPrice(productsName, productsQuantity, homecenter, district, center, totalPrice);
		printTotalPrice(totalPrice);
		Operations.betterBuy(homecenter, district, center, productsQuantity, betterBuy, place);
		printBetterBuy(betterBuy, place, productsName);
		printProducts(productsName,productsUse);
	}
}