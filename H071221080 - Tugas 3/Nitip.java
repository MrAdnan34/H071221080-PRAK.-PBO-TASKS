import java.util.ArrayList;

class Product {
    // String name;
    // int price, stock;

    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> price = new ArrayList<>();
    ArrayList<Integer> stock = new ArrayList<>();

    public Product(String name, int price, int stock) {
        // this.name = name;
        // this.price = price;
        // this.stock = stock;
    }

    public Product(String name, String price, int stock) {
        this.name.add(name);

        price = price.replace("k", "000");
        Integer priceInt = Integer.parseInt(price);
        this.price.add(priceInt);

        this.stock.add(stock);
    }

    public String[] getName() {
        String[] nameArray = new String[name.size()];
        for (int i = 0; i < name.size(); i++) {
            nameArray[i] = name.get(i);
        }
        return nameArray;
    }

    // public int itemSelled() {
    //     this.stock -= 1;

    //     return this.stock;
    // }
}
