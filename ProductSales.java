
public class ProductSales {

	public double candy;
	public double soda;
	double chips;
	public double bread;
	public double cookies;
	public double fountain;

	public double marlboro;
	public double camel;
	public double newport;
	public double pallmall;
	public double winston;
	public double lm;

	public double budweiser;
	public double corona;
	public double budlight;
	public double heineken;
	public double skol;
	public double coorsLight;

	// ******************PRICE*****************
	public double pcandy = 1.99;
	public double psoda = 2.99;
	double pchips = 1.99;
	public double pbread = 2.99;
	public double pcookies = 1.99;
	public double pfountain = 1.99;

	public double pmarlboro = 7.99;
	public double pcamel = 5.99;
	public double pnewport = 7.99;
	public double ppallmall = 6.99;
	public double pwinston = 7.99;
	public double plm = 6.99;

	public double pbudweiser = 2.99;
	public double pcorona = 3.99;
	public double pbudlight = 4.99;
	public double pheineken = 5.99;
	public double pskol = 2.99;
	public double pcoorsLight = 3.99;

	// ****************************************

	public double groceryTotal;
	public double cigaretteTotal;
	public double alcoholTotal;
	public double total;

	public double getTotal() {
		groceryTotal = candy + soda + chips + bread + cookies + fountain;
		cigaretteTotal = marlboro + camel + newport + pallmall + winston + lm;
		alcoholTotal = budweiser + corona + budlight + heineken + skol + coorsLight;
		total = groceryTotal + cigaretteTotal + alcoholTotal;

		return total;
	}
}
