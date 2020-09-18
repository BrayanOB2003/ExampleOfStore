package ui;
import java.util.Scanner;
import model.*;

public class Main{
	
	/**
	* Ask for the quantity of products to define the size of the arrangements<br>
	* <b> pre: </b> <br>
	* <b> post: </b> Returns quantity of products / size of arrangements <br>
	* @ param size Stores the requested value. size> 0
	*/
	
	public static int size(){
		Scanner in = new Scanner(System.in);
		System.out.print("Numero de productos que quiere comprar: ");
		int size = in.nextInt();
		System.out.println("");
		
		return size;
	}
	
	/**
	* Ask for the name, quantity and use of the product<br>
	* <b> pre: </b> <br>
	* <b> post: </b> Stores the typed product information in the arrangements <br>
	* @ param productsQuantity product quantity. productsQuantity> 0
	* @ param productsUse product usage. 0 <productsUse <= 3
	*/
	
	public static void materialList(String[] productsName, float[] productsQuantity, int[] productsUse){		
		Scanner in  = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < productsName.length; i++){
			System.out.print("Nombre del producto: ");
			productsName[i] = in.nextLine();
			
			System.out.print("Cantidad del producto: ");
			productsQuantity[i] = sc.nextFloat();
			System.out.println("________________________");
			System.out.println("Utilizacion del producto \n" + "1.Obra negra\n" + "2.Obra blanca\n" + "3.Pintura");
			productsUse[i] = sc.nextInt();
			System.out.println("");
		}
	}
	
	/**
	* Ask for the price of each product in three establishments<br>
	* <b> pre: </b> Homecenter, District and Center arrangements must be initialized <br>
	* <b> post: </b> The value of the respective product is stored in each arrangement.
	* @ param Homecenter price of products in homecenter. homecenter> 0
	* @ param District price of the products in the neighborhood hardware store. district []> 0
	* @ param Center price of the products in the hardware store of the center. center []> 0
	*/
	
	public static void productsPrice(float[] Homecenter,float[] District ,float[] Center ,String[] productsName){
		Scanner in= new Scanner(System.in);
		System.out.println("***********************************************************");
		System.out.println("*Digite el precio de cada producto en los establecimientos*");
		System.out.println("***********************************************************");
		System.out.println("");
		System.out.println("|-----------|");
		System.out.println("|HOMECENTER |");
		System.out.println("|-----------|");
		System.out.println("");
		for(int i = 0; i < Homecenter.length; i++){
			
			System.out.print("Precio de " + productsName[i] + ": ");
			Homecenter[i] = in.nextFloat();
			System.out.println("");
		}
		System.out.println("|---------------------|");
		System.out.println("|FERRETERIA DEL BARRIO|");
		System.out.println("|---------------------|");
		System.out.println("");
		for(int i = 0; i < District.length; i++){
			
			System.out.print("Precio de " + productsName[i] + ": ");
			District[i] = in.nextFloat();
			System.out.println("");
		}
		System.out.println("|---------------------|");
		System.out.println("|FERRETERIA DEL CENTRO|");
		System.out.println("|---------------------|");
		System.out.println("");
		for(int i = 0; i < Center.length; i++){
			
			System.out.print("Precio de " + productsName[i] + ": ");
			Center[i] = in.nextFloat();
			System.out.println("");
		}
	}
	
	/**
	* Print the total purchase price for each establishment<br>
	* <b> pre: </b> <br>
	* <b> post: </b> Displays the total prices in each establishment <br>
	* @ param totalPrice Stores the calculated total price. totalPrice> 0
	*/
	
	public static void printTotalPrice(float[] totalPrice){
		
		System.out.println("El total a pagar en Homecenter es : " + totalPrice[0]);
		System.out.println("El total a pagar en la ferreteria del barrio es : " + totalPrice[1]);
		System.out.println("El total a pagar en la ferreteria del centro es : " + totalPrice[2]);
		
	}
	
	/**
	* Print product, best price, establishment and total payment to which it corresponds<br>
	* <b> pre: </b> The arrangements must have the corresponding information <br>
	* <b> post: </b> Shows on screen the name of the product, the lowest price, the establishment to which it belongs and the total payment <br>
	* @ param betterBuy arrangement Stores the best prices. ! = null
	* @ param Array place Stores the names of the places with the best price. ! = null
	* @ param Array productsName Stores the names of the products. ! = null
	*/
	
	public static void printBetterBuy(float[] betterBuy, String[] place, String[] productsName, float totalBetterBuy){
		
		float totalPrice = 0;
		System.out.println("");
		System.out.println("*****************");
		System.out.println("*Mejores precios*");
		System.out.println("*****************");
		System.out.println("");
		for(int i = 0; i < productsName.length; i++){
			
			System.out.println("Producto: " + productsName[i]);
			System.out.println("Tienda: " + place[i]);
			System.out.println("Precio: " + betterBuy[i]);
			
			System.out.println("");
		}
		
		System.out.println("Pago total: " + totalBetterBuy);
		
	}
	
	/**
	* Print the products for the use that they were given in the work<br>
	* <b> pre: </b> <br>
	* <b> post: </b> It shows on the screen a list of products by use, according to the user choose the type of work <br>
	* @ param Array productsName Stores the names of the products. ! = null
	* @ param productsUse product usage. 0 <productsUse <= 3
	*/
	
	public static void printProducts(String[] productsName, int[] productsUse){
		
		Scanner sc = new Scanner(System.in);
		int option = 0;
		System.out.println("");
		System.out.println("***************************");
		System.out.println("*Productos por utilizacion*");
		System.out.println("***************************");
	
		while(option < 4){
			System.out.println("1.Obra negra\n" + "2.Obra blanca\n" + "3.Pintura\n" + "4.Terminar");
			option = sc.nextInt();
			System.out.println("");
			
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
			System.out.println("");
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
		float totalBetterBuy = 0;
		
		materialList(productsName,productsQuantity,productsUse);
		productsPrice(homecenter, district, center, productsName);
		Operations.totalPrice(productsQuantity, homecenter, district, center, totalPrice);
		printTotalPrice(totalPrice);
		Operations.betterBuy(homecenter, district, center, productsQuantity, betterBuy, place);
		totalBetterBuy = Operations.totalBetterBuy(betterBuy);
		printBetterBuy(betterBuy, place, productsName, totalBetterBuy);
		printProducts(productsName,productsUse);
	}
}