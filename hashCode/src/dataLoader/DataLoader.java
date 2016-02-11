package dataLoader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataLoader {

    private static int row, column, nDrones, nTurns, maxPayload;
    private static Scanner sc;
    private static List<Integer> productWeigh = new ArrayList<Integer>();

    public static void loadData (File input){

        try {
            sc = new Scanner(input);
            //assumed that the file is well formed
            while(sc.hasNextLine()){
                getGeneralInfo(); //add the general info (First line of the input data)
                getProductWeigh();
                getWarehouseInfo();
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.err.println("Cant read " + input + " on DataLoader.loadData");
        }

    }

    private static void getWarehouseInfo() {
        int numberOfWarehouses = sc.nextInt();
        

    }

    private static void getProductWeigh() {
        int productTypes = sc.nextInt();
        sc.nextLine();  //End line

        for(int i=0; i<productTypes; i++){
            productWeigh.add(sc.nextInt());
        }
        sc.nextLine();  //End line
    }

    private static void getGeneralInfo(){
        row = sc.nextInt();
        column = sc.nextInt();
        nDrones = sc.nextInt();
        nTurns = sc.nextInt();
        maxPayload = sc.nextInt();

        sc.nextLine();  //End line
    }
}
