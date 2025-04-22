package model;

import java.util.Map;

public class IceDessert {

	private String mainMeal;
	private String[] toppings;
	private Map<String, Integer> priceTable = Map.of("剉冰",50, "紅豆",10,
													"豆花",40, "芋圓",10,
													"花生",10, "粉圓",10,
													"綠豆",10, "煉乳",10);
	private int price;
	
	
	
	public IceDessert(String mainMeal,String[] toppings) {
		
		this.mainMeal = mainMeal;
		this.toppings = toppings;
		this.price = getPrice();
		
				
	}
	
	// 取得總價格
	public int getPrice() {
	
		int totle = 0;
		
		//主餐的金額先加進去
		totle += priceTable.get(mainMeal);
		
		// 判斷有沒有點配料
				if(toppings == null) {
					return totle;
				}
		
		//使用forEach 把點的配料 一個一個拿出來比對 再把金額加進去
		for (String topping : toppings) { 
			if(priceTable.containsKey(topping)) {  // 先判斷有沒有此配料 !
				totle += priceTable.get(topping);
			}
		}
		return totle;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	public String getMainMeal() {
		return mainMeal;
	}


	public void setMainMeal(String mainMeal) {
		this.mainMeal = mainMeal;
	}


	public String[] getToppings() {
		return toppings;
	}


	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}

	
	
	
	

	


	

	
	
	
}
