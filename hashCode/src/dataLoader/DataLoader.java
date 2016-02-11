package dataLoader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Helper.Location;
import bean.ProductBean;
import bean.WarehouseBean;

public class DataLoader {

    private static int row, column, nDrones, nTurns, maxPayload;
    private static Scanner sc;
    private static List<Integer> productWeigh = new ArrayList<Integer>();

    public static void loadData (File input)
    {

        try {
            sc = new Scanner(input);
            //assumed that the file is well formed
            while(sc.hasNextLine())
            {
                getGeneralInfo(); //add the general info (First line of the input data)
                getProductWeigh();
                getWarehouseInfo();
                getOrderInfo();
            }
            sc.close();

        } catch (FileNotFoundException e)
        {
            System.err.println("Cant read " + input + " on DataLoader.loadData");
        }

    }

    private static void getOrderInfo ()
    {
        int nOrder = sc.nextInt();
        sc.nextLine();  //End line
        Location orderLocation;
        int nItems;
        List<Integer> items;
        for(int i=0; i<nOrder; i++)
        {
            orderLocation = getLocation();
            nItems = sc.nextInt();
            sc.nextLine();  //End line
            items = new ArrayList<Integer>();
            for(int j = 0; j<nItems; j++)
            {
                items.add(sc.nextInt());
            }
            if(sc.hasNextLine()){
                sc.nextLine();  //End line
            }

        }
    }

    private static void getWarehouseInfo ()
    {
        int numberOfWarehouses = sc.nextInt();
        sc.nextLine();  //End line
        Helper.Location location;

        for (int i = 0; i < numberOfWarehouses; i++)
        {
            location = getLocation();
            //create warehouse with that info
        
            WarehouseBean warehouseBean = new WarehouseBean();
            warehouseBean.setId(String.valueOf(i));
            warehouseBean.setCoordenates(location);
            
            fillWarehouseProductsInfo(warehouseBean);
        }
    }

    private static void fillWarehouseProductsInfo (WarehouseBean warehouseBean)
    {
        for(int i = 0; i < productWeigh.size(); i++ )
        {
        	int quantity = sc.nextInt();
        	
        	ProductBean productBean = new ProductBean();
        	productBean.setId(String.valueOf(i));
        	productBean.getWarehousesQuantity().put(warehouseBean, String.valueOf(quantity));
        	
            warehouseBean.getProductList().put(productBean, String.valueOf(quantity));
        }
        
        sc.nextLine();  //End line
    }

    private static Location getLocation ()
    {
        int row, col;
        row = sc.nextInt();
        col = sc.nextInt();
        sc.nextLine();  //End line

        return new Location(Integer.toString(row),Integer.toString(col));
    }

    private static void getProductWeigh ()
    {
        int productTypes = sc.nextInt();
        sc.nextLine();  //End line

        for(int i=0; i<productTypes; i++)
        {
            productWeigh.add(sc.nextInt());
        }
        sc.nextLine();  //End line
    }

    private static void getGeneralInfo ()
    {
        row = sc.nextInt();
        column = sc.nextInt();
        nDrones = sc.nextInt();
        nTurns = sc.nextInt();
        maxPayload = sc.nextInt();

        sc.nextLine();  //End line
    }

}
