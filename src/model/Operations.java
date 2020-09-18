package model;

public class Operations{
	
	private final static int roughConstruction = 1300000;
	private final static int finalConstruction = 2600000;
	private final static int painting = 980000; 
	
	
	/**
	* Calculate the total price of the work for each establishment and cost per address for north location<br>
	* <b> pre: </b> Array totalPrice must be initialized <br>
	* <b> post: </b> Calculation of the total price for each establishment <br>
	* @ param productsQuantity product quantity. productsQuantity> 0
	* @ param homecenter price of products in homecenter. homecenter> 0
	* @ param district price of the products in the neighborhood hardware store. district []> 0
	* @ param center price of the products in the center hardware store. center []> 0
	*/
	
	public static void totalPrice(float[] productsQuantity,float[] homecenter, float[] district, float[] center, float[] totalPrice){
		
		
		for(int i = 0; i < homecenter.length; i++){
			totalPrice[0] += (productsQuantity[i]*homecenter[i]);
			totalPrice[1] += (productsQuantity[i]*district[i]);
			totalPrice[2] += (productsQuantity[i]*center[i]);
		}
		
		for(int i = 0; i < totalPrice.length; i++){
			totalPrice[i] += roughConstruction + finalConstruction + painting;
		}
		
		for(int i = 0; i < totalPrice.length; i++){
			
			if(totalPrice[i] < 80000){
				totalPrice[i] += 120000;
			} else if(totalPrice[i] < 300000){
				totalPrice[i] += 28000;
			}
			
		}
		
	}
	
	/**
	* Calculate the best price to buy according to the establishments<br>
	* <b> pre: </b> betterBuy array and place array must be initialized <br>
	* <b> post: </b> Calculation of the best prices and their respective establishments <br>
	* @ param homecenter price of products in homecenter. homecenter> 0
	* @ param district price of the products in the neighborhood hardware store. district []> 0
	* @ param center price of the products in the center hardware store. center []> 0
	* @ param productsQuantity product quantity. productsQuantity> 0
	*/
	
	public static void betterBuy(float[] homecenter, float[] district, float[] center, float[] productsQuantity, float[] betterBuy, String[] place){
		
		float[] totalHomecenter = new float[productsQuantity.length];
		float[] totalDistrict = new float[productsQuantity.length];
		float[] totalCenter = new float[productsQuantity.length];
		
		for(int i = 0; i < homecenter.length; i++){
			totalHomecenter[i] = productsQuantity[i]*homecenter[i];
			totalDistrict[i] = productsQuantity[i]*district[i];
			totalCenter[i] = productsQuantity[i]*center[i];
		}
		
		for(int i = 0; i < totalHomecenter.length; i++){
			if(totalHomecenter[i] < totalDistrict[i]){
				
				if(totalHomecenter[i] < totalCenter[i]){
					
					place[i] = "Homecenter";
					betterBuy[i] = totalHomecenter[i];
				} else{
					place[i] = "Ferreteria del centro";
					betterBuy[i] = totalCenter[i];
				}
				
			}else if(totalDistrict[i] < totalCenter[i]){
				
				place[i] = "Ferreteria del barrio";
				betterBuy[i] = totalDistrict[i];
				
			}else if(totalCenter[i] < totalDistrict[i]){
				
				place[i] = "Ferreteria del centro";
				betterBuy[i] = totalCenter[i];
				
			}else if(totalHomecenter[i] == totalCenter[i] && totalHomecenter[i] == totalDistrict[i] && totalDistrict[i] == totalCenter[i]){
				
				place[i] = "Homecenter, ferreteria del barrio y ferreteria del centro";
				betterBuy[i] = totalCenter[i];
				
			} else if(totalHomecenter[i] == totalCenter[i]){
				
				place[i] = "Homecenter y Ferreteria de centro";
				betterBuy[i] = totalCenter[i];
				
			} else if(totalDistrict[i] == totalCenter[i]){
				
				place[i] = "Ferreteria del barrio y Ferreteria de centro";
				betterBuy[i] = totalCenter[i];
				
			} else if(totalHomecenter[i] == totalDistrict[i]){
				
				place[i] = "Homecenter y ferreteria del barrio";
				betterBuy[i] = totalDistrict[i];
			}
		}
	}
	
	/**
	* Returns the accumulated total of the best prices and cost per address for north location <br>
	* <b> pre: </b> butterBuy arrangement must have the best prices stored <br>
	* <b> post: </b> Calculate the accumulated total of the best prices and the address <br>
	* @ param betterBuy Stores the best prices. betterBuy> 0
	*/
	
	public static float totalBetterBuy(float[] betterBuy){
		
		float totalBetterBuy = 0;
		
		for(int i = 0; i < betterBuy.length; i++){
			totalBetterBuy += betterBuy[i];
		}
		
		if(totalBetterBuy < 80000){
			totalBetterBuy += 120000;
		} else if(totalBetterBuy < 300000){
			totalBetterBuy += 28000;
		}
		
		return totalBetterBuy;
	}
}