package bean;

import java.util.HashMap;
import java.util.Map;

import Helper.Location;

public class WarehouseBean extends BaseBean
{
	private Location coordenates;
	private Map<ProductBean, String> productList;
	
	public WarehouseBean ()
	{
		this.productList = new HashMap<ProductBean, String>();
	}
	
	public Location getCoordenates ()
	{
		return coordenates;
	}

	public void setCoordenates (Location coordenates)
	{
		this.coordenates = coordenates;
	}

	public Map<ProductBean, String> getProductList ()
	{
		return productList;
	}

	public void setProductList (Map<ProductBean, String> productList)
	{
		this.productList = productList;
	}
}
