package bean;

import java.util.List;

import Helper.Location;

public class DronBean extends BaseBean
{
	private List<Location> deliveryLocationList;

	public List<Location> getDeliveryLocationList ()
	{
		return deliveryLocationList;
	}

	public void setDeliveryLocationList (List<Location> deliveryLocationList)
	{
		this.deliveryLocationList = deliveryLocationList;
	}
}
