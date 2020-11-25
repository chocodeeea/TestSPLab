
public class Test 
{

	public Test() {
		}

}

void test()
{
	// CreateOrderCmd va crea comanda cu continutul de mai sus
	Order order = new CreateOrderCmd().execute();

	// Va afisa comanda precum mai sus
	new DisplayOrderCmd(order).execute();
}