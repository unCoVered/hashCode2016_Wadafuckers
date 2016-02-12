package Helper;

public class Location
{
	private String column;
	private String row;

	public Location (String column, String row)
	{
		this.column = column;
		this.row = row;
	}

	public String getColumn ()
	{
		return column;
	}

	public void setColumn (String column)
	{
		this.column = column;
	}

	public String getRow ()
	{
		return row;
	}

	public void setRow (String row)
	{
		this.row = row;
	}
}
