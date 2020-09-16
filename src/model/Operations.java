package model;

public class Operations{
	
	public static void totalPrice(String[] productsName,float[] productsQuantity,float[] homecenter, float[] district, float[] center, float[] totalPrice){
		
		for(int i = 0; i < homecenter.length; i++){
			totalPrice[0] += productsQuantity[i]*homecenter[i];	
			totalPrice[1] += productsQuantity[i]*district[i];
			totalPrice[2] += productsQuantity[i]*center[i];
		}
		
		for(int i = 0; i < totalPrice.length; i++){
			
			if(totalPrice[i] < 80000){
				totalPrice[i] += 120000;
			} else if(totalPrice[i] < 300000){
				totalPrice[i] += 28000;
			}
			
		}
		
	}
	
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
				}
				
			}else if(totalDistrict[i] < totalCenter[i]){
				
				if(totalDistrict[i] < totalCenter[i]){
					
					place[i] = "Ferreteria del barrio";
					betterBuy[i] = totalDistrict[i];
				}
				
			} else {
				
				place[i] = "Ferreteria del centro";
				betterBuy[i] = totalCenter[i];
				
			}
		}
		
	}
	
	
	
	
}