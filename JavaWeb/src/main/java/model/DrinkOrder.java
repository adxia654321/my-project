package model;

import java.util.Map;

public class DrinkOrder {

	
	private String type ;
    private String size ;
    private boolean ice ;
    private double price;
    private String iceMessge;
    
  
	public DrinkOrder(String type, String size, String iceMessge) {
		super();
		this.type = type;
		this.size = size;
		this.price = drinkMap.get(type.toLowerCase()).get(size);
		if(iceMessge.equals("yes")) {						//讓使用者輸入yes,no  來代替輸入true,false
			this.ice = true;
		}else {
			this.ice = false;
		}
	}

	// 飲料的表單 
	public static final Map<String, Map<String, Integer>> drinkMap = Map.of("greentea",Map.of("S",30,  "M",50,  "L",50),
			                                            "blacktea",Map.of("S",45,  "M",55,  "L",65),
			                                            "milktea", Map.of("S",40,  "M",45,  "L",60));

	// 將ice的true false 轉換成中文
	public static final Map<Boolean, String> iceMap = Map.of(true,"有加冰",  false,"沒加冰");
	
	
	// 列印飲料資訊
	public String getInfo() {
		String iceText = iceMap.get(ice);
		return String.format("你點了一杯%s (%s,%s) , 價格為%.0f元", type,size,iceText,price);
		
	}
	
	
	

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public boolean isIce() {
		return ice;
	}


	public void setIce(boolean ice) {
		this.ice = ice;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public static Map<String, Map<String, Integer>> getDrinkmap() {
		return drinkMap;
	}
	
	
	
}
