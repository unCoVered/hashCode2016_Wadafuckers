package bean;

import java.util.List;

import Helper.Location;

public class OrderBean extends BaseBean
{
	private List<String> itemsList;
	private Location deliveryLocation;
	private List<DronBean> deliveryDrones;

	public List<String> getItemsList ()
	{
		return itemsList;
	}

	public void setItemsList (List<String> itemsList)
	{
		this.itemsList = itemsList;
	}

	public Location getDeliveryLocation ()
	{
		return deliveryLocation;
	}

	public void setDeliveryLocation (Location deliveryLocation)
	{
		this.deliveryLocation = deliveryLocation;
	}

	public List<DronBean> getDeliveryDrones ()
	{
		return deliveryDrones;
	}

	public void setDeliveryDrones (List<DronBean> deliveryDrones)
	{
		this.deliveryDrones = deliveryDrones;
	}
}