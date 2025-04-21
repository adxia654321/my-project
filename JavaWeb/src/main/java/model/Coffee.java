package model;

public class Coffee {

	private int milkCC;
	private int coffeeCC;
	private String coffeeType;
	private String coffeeInfo;
	
	
	public Coffee(String milkCC, String coffeeCC) {
		this.milkCC = Integer.parseInt(milkCC);
		this.coffeeCC = Integer.parseInt(coffeeCC);
		setCoffeeType();
		setCoffeeInfo();
	}

	
	
	
	
	public String getCoffeeInfo() {
		return coffeeInfo;
	}





	public void setCoffeeInfo() {
		
		switch(coffeeType) {
		
			case "濃郁的拿鐵":
				coffeeInfo = "牛奶的比例遠高於咖啡，味道偏向牛奶。";
				break;
				
			case"平衡的拿鐵咖啡":
				coffeeInfo = "牛奶與咖啡的比例較為平衡，風味溫和。";
				break;
				
			case"標準的卡布奇諾":
				coffeeInfo = "牛奶與咖啡的比例恰到好處，典型的卡布奇諾。";
				break;
				
			case"濃縮咖啡":
				coffeeInfo = "咖啡的比例遠高於牛奶，口感濃烈，偏向純咖啡。";
				break;
				
			case"普通咖啡":
				coffeeInfo = "牛奶與咖啡的比例較為普通，適合日常飲用。";
				break;
				
			
		}
		
			
			
		
		
	}
	
	
	public void setCoffeeType() {
		
		this.coffeeType = (milkCC >= 3*coffeeCC)?   "濃郁的拿鐵" :
						  (milkCC >= 1.5*coffeeCC)? "平衡的拿鐵咖啡" :
						  (milkCC == coffeeCC)?     "標準的卡布奇諾" :
						  (coffeeCC >= 3*milkCC)?   "濃縮咖啡" :
							  					    "普通咖啡";
		
	}
	
	
	
	
	
	public String getCoffeeType() {
		return coffeeType;
	}






	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}






	public int getMilkCC() {
		return milkCC;
	}

	public void setMilkCC(int milkCC) {
		this.milkCC = milkCC;
	}

	public int getCoffeeCC() {
		return coffeeCC;
	}

	public void setCoffeeCC(int coffeeCC) {
		this.coffeeCC = coffeeCC;
	}
	
	
	
	


	
	
	
	
	

}
