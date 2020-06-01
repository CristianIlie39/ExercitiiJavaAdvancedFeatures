import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    //Sa se citeasca dintr-un fisier produsele aflate la vanzare dintr-un magazin
    //Pe fiecare rand vom avea categoria (alimentare, curatenie, auto), numele, raionul, pretul, reducerea
    //sa se grupeze produsele in 3 colectii in functie de: categorie, pretul<100 Ron, pret<50Ron si pret>100 Ron
    //vom avea 3 colectii: pt categorii, pt pret, pt reducere -> red 10%, red 20%, red 30%
    //La final sa se scrie produsele in functie de colectia din care fac parte in fisiere separate (3 fisiere separate)

    public static void main(String[] args) {

        try {
            String filePath = "D:\\RepositoryCursGalati3\\ExercitiiJavaAdvancedFeatures\\MagazinColectiiProduse\\StoreProductsFile.txt";
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //creem Map-urile
            Map<String, ArrayList<Product>> categoryProductsMap = new HashMap<String, ArrayList<Product>>();
            Map<String, ArrayList<Product>> priceProductsMap = new HashMap<String, ArrayList<Product>>();
            Map<String, ArrayList<Product>> discountProductsMap = new HashMap<String, ArrayList<Product>>();

            //pregatim Map-urile
            categoryProductsMap.put("Alimentare", new ArrayList<Product>());
            categoryProductsMap.put("Curatenie", new ArrayList<Product>());
            categoryProductsMap.put("Auto", new ArrayList<Product>());

            priceProductsMap.put("Lower50", new ArrayList<Product>());
            priceProductsMap.put("Lower100", new ArrayList<Product>());
            priceProductsMap.put("Greater100", new ArrayList<Product>());

            discountProductsMap.put("10", new ArrayList<Product>());
            discountProductsMap.put("20", new ArrayList<Product>());
            discountProductsMap.put("30", new ArrayList<Product>());

            String text = bufferedReader.readLine();
            while (text != null) {
                String[] arrayWords = text.split(";");
                Product product = new Product(arrayWords[0], arrayWords[1], arrayWords[2], arrayWords[3], arrayWords[4]);

                if (product.getCategory().equals("Alimentare")) {
                    categoryProductsMap.get("Alimentare").add(product);
                } else if (product.getCategory().equals("Curatenie")) {
                    categoryProductsMap.get("Curatenie").add(product);
                } else if (product.getCategory().equals("Auto")) {
                    categoryProductsMap.get("Auto").add(product);
                }

                if (Integer.valueOf(product.getPrice()) < 50) {
                    priceProductsMap.get("Lower50").add(product);
                } else if (Integer.valueOf(product.getPrice()) < 100) {
                    priceProductsMap.get("Lower100").add(product);
                } else if (Integer.valueOf(product.getPrice()) > 100) {
                    priceProductsMap.get("Greater100").add(product);
                }

                if (product.getDiscount().equals("10")) {
                    discountProductsMap.get("10").add(product);
                } else if (product.getDiscount().equals("20")) {
                    discountProductsMap.get("20").add(product);
                } else if (product.getDiscount().equals("30")) {
                    discountProductsMap.get("30").add(product);
                }

                text = bufferedReader.readLine();
            }

            String filePathCategory = "D:\\RepositoryCursGalati3\\ExercitiiJavaAdvancedFeatures\\MagazinColectiiProduse\\CategoryFile.txt";
            String filePathPrice = "D:\\RepositoryCursGalati3\\ExercitiiJavaAdvancedFeatures\\MagazinColectiiProduse\\PriceFile.txt";
            String filePathDiscount = "D:\\RepositoryCursGalati3\\ExercitiiJavaAdvancedFeatures\\MagazinColectiiProduse\\DiscountFile.txt";

            FileWriter fileWriterCategory = new FileWriter(filePathCategory);
            FileWriter fileWriterPrice = new FileWriter(filePathPrice);
            FileWriter fileWriterDiscount = new FileWriter(filePathDiscount);

            BufferedWriter bufferedWriterCategory = new BufferedWriter(fileWriterCategory);
            BufferedWriter bufferedWriterPrice = new BufferedWriter(fileWriterPrice);
            BufferedWriter bufferedWriterDiscount = new BufferedWriter(fileWriterDiscount);


            //Luam produsele din colectia categoryProductsMap si le scriem in fisierul CategoryFile
            ArrayList<Product> AlimentaryProductsCategory = categoryProductsMap.get("Alimentare");
            for (Product product : AlimentaryProductsCategory) {
                bufferedWriterCategory.write(product.toString());
                bufferedWriterCategory.newLine();
            }

            ArrayList<Product> CleaningProductsCategory = categoryProductsMap.get("Curatenie");
            for (Product product : CleaningProductsCategory) {
                bufferedWriterCategory.write(product.toString());
                bufferedWriterCategory.newLine();
            }

            ArrayList<Product> AutoProductsCategory = categoryProductsMap.get("Auto");
            for (Product product : AutoProductsCategory) {
                bufferedWriterCategory.write(product.toString());
                bufferedWriterCategory.newLine();
            }

            bufferedWriterCategory.flush();
            bufferedWriterCategory.close();

            //Luam produsele din colectia priceProductsMap si le scriem in fisierul PriceFile
            ArrayList<Product> lower50ProductsPrice = priceProductsMap.get("Lower50");
            for (Product product : lower50ProductsPrice) {
                bufferedWriterPrice.write(product.toString());
                bufferedWriterPrice.newLine();
            }

            ArrayList<Product> lower100ProductsPrice = priceProductsMap.get("Lower100");
            for (Product product : lower100ProductsPrice) {
                bufferedWriterPrice.write(product.toString());
                bufferedWriterPrice.newLine();
            }

            ArrayList<Product> greater100ProductPrice = priceProductsMap.get("Greater100");
            for (Product product : greater100ProductPrice) {
                bufferedWriterPrice.write(product.toString());
                bufferedWriterPrice.newLine();
            }

            bufferedWriterPrice.flush();
            bufferedWriterPrice.close();

            //Luam produsele din colectia discountProductsMap si le scriem in fisierul DiscountFile
            ArrayList<Product> discount10Products = discountProductsMap.get("10");
            for (Product product : discount10Products) {
                bufferedWriterDiscount.write(product.toString());
                bufferedWriterDiscount.newLine();
            }

            ArrayList<Product> discount20products = discountProductsMap.get("20");
            for (Product product : discount20products) {
                bufferedWriterDiscount.write(product.toString());
                bufferedWriterDiscount.newLine();
            }

            ArrayList<Product> discount30Products = discountProductsMap.get("30");
            for (Product product : discount30Products) {
                bufferedWriterDiscount.write(product.toString());
                bufferedWriterDiscount.newLine();
            }

            bufferedWriterDiscount.flush();
            bufferedWriterDiscount.close();


        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu este gasit " + e.getMessage());
        } catch (IOException e) {
            System.out.println("A aparut o eroare " + e.getMessage());
        }

    }

}
