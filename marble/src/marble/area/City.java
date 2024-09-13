package marble.area;

public class City extends SaleLocal {
	public int building;

	public int[] buildCost = { 20, 8, 24, 40, 40 }; // new int[5];
	public int[] fee = { 7, 15, 32, 68, 60 }; // int[5];

//	public City(int colorIdx, String name, int idx, int[] buildCost, int[] fee) {
//		super(colorIdx, name, idx);
//		this.buildCost = buildCost;
//		this.fee = fee;
//	}

	public City(int colorIdx, String name, int idx) {
		super(colorIdx, name, idx);
	}

	public int getFee() {
		int cnt = 0;
		int feeResult = fee[cnt++];

		int i = building;
		while (i != 0) {
			if (i % 2 == 1) {
				feeResult += fee[cnt];
			}
			cnt++;
			i /= 2;
		}
		return feeResult;

	}

}
