package ncs.test13;
//extends Exception
public class AmountNotEnough extends Exception {
	//양이 충분하지 않을 때 표시하는 에러를 개발자가 만들어준 것
	public AmountNotEnough (String msg) {
		//if new throws
		/*
		  	for(Inventory 인벤토리 : inventoryMap.values()) {
			if(인벤토리.getGetAmount() > 인벤토리.getPutAmount()) {
				throw new AmountNotEnough("출고 수량이 재고 수량을 초과했습니다.");
			}
		}
		 
		 */
		super(msg);
	}
}
