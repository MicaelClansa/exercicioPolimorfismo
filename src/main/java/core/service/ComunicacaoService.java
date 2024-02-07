package core.service;

import core.entity.ImportedProdct;
import core.entity.Product;
import core.entity.UsedProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComunicacaoService {

    public static void interacaoComUsuario() {
        List<Product> productList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String name;
        String manufactureDate;
        Double price;
        Double customFee;
        char tipoProduto;
        int numberOfProducts;

        System.out.print("Enter the number of Products: ");
        numberOfProducts = sc.nextInt();

        for(int i=0; i<numberOfProducts; i++) {
            System.out.println("Product #" + i+1 + " data:");
            System.out.print("Common, used or imported (c/u/i)?");
            tipoProduto = sc.next().charAt(0);

            System.out.print("Name: ");
            name = sc.next();

            System.out.print("Price: ");
            price = sc.nextDouble();

            if(tipoProduto == 'i'){
                System.out.print("Customs Fee: ");
                customFee = sc.nextDouble();
                productList.add(new ImportedProdct(name, price, customFee));

            }else if(tipoProduto == 'u'){
                System.out.print("Manufacture date (DD/MM/AAAA): ");
                manufactureDate = sc.next();
                productList.add(new UsedProduct(name, price, manufactureDate));

            }else {
                productList.add(new Product(name, price));
            }
        }

        System.out.println("PRICE TAGS:");
        for(Product produto:productList){
            System.out.println(produto);
        }
    }
}
