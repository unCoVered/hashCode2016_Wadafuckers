package bean;

import java.util.HashMap;
import java.util.Map;

public class ProductBean extends BaseBean
{
	private Map<WarehouseBean, String> warehousesQuantity;
	private String weight;
	
	public ProductBean ()
	{
		warehousesQuantity = new HashMap<WarehouseBean, String>();
	}
	
	public Map<WarehouseBean, String> getWarehousesQuantity ()
	{
		return warehousesQuantity;
	}
	
	public void setWarehousesQuantity (Map<WarehouseBean, String> warehousesQuantity)
	{
		this.warehousesQuantity = warehousesQuantity;
	}

	public String getWeight ()
	{
		return weight;
	}

	public void setWeight (String weight)
	{
		this.weight = weight;
	}
}
