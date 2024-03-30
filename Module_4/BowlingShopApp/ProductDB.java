/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_4.BowlingShopApp;

/**
 * Database for bowling product data
 */
public class ProductDB {
    /**
     * Returns a queue of Product items based on the provided code
     * 
     * @param code shorthand code for Ball (b), Shoe (s), or Bag (a)
     * @return a queue containing products of only the selected type
     */
    public static GenericQueue<Product> getProducts(String code) {
        if (code.equalsIgnoreCase("b")) {
            GenericQueue<Product> balls = new GenericQueue<Product>();
            balls.Enqueue(createBall("b1", "red", "MaxxBall 9700 Red", 20.00));
            balls.Enqueue(createBall("b2", "blue", "MaxxBall 9800 Blue", 20.00));
            balls.Enqueue(createBall("b3", "green", "MaxxBall 9900 Green", 20.00));
            balls.Enqueue(createBall("b4", "red", "MegaBall 8700 Red", 30.00));
            balls.Enqueue(createBall("b5", "blue", "MegaBall 8800 Blue", 30.00));
            return balls;
        } else if (code.equalsIgnoreCase("s")) {
            GenericQueue<Product> shoes = new GenericQueue<Product>();
            shoes.Enqueue(createShoe("s1", "ComfortFit 12", 45.99, 12));
            shoes.Enqueue(createShoe("s2", "ComfortFit 13", 46.99, 13));
            shoes.Enqueue(createShoe("s3", "ComfortFit 14", 47.99, 14));
            shoes.Enqueue(createShoe("s4", "ComfortFit 15", 48.99, 15));
            shoes.Enqueue(createShoe("s5", "ComfortFit 16", 49.99, 16));
            return shoes;
        } else if (code.equalsIgnoreCase("a")) {
            GenericQueue<Product> bags = new GenericQueue<Product>();
            bags.Enqueue(createBag("a1", "TinyBag", 15.50, "small"));
            bags.Enqueue(createBag("a2", "MediumBag", 15.50, "medium"));
            bags.Enqueue(createBag("a3", "MegaBag", 15.50, "large"));
            return bags;
        } else {
            return new GenericQueue<Product>();
        }
    }

    /**
     * Helper to create a ball from parameters
     * 
     * @param code        product code for this ball
     * @param color       color for this ball
     * @param description description for this ball
     * @param price       price for this ball
     * @return the Ball created
     */
    private static Ball createBall(String code, String color, String description, double price) {
        Ball lBall = new Ball();
        lBall.setCode(code);
        lBall.setColor(color);
        lBall.setDescription(description);
        lBall.setPrice(price);
        return lBall;
    }

    /**
     * Helper to create a shoe from parameters
     * 
     * @param code        product code for this shoe
     * @param description description for this shoe
     * @param price       price for this shoe
     * @param size        size for this shoe
     * @return the Shoe created
     */
    private static Shoe createShoe(String code, String description, double price, double size) {
        Shoe lShoe = new Shoe();
        lShoe.setCode(code);
        lShoe.setDescription(description);
        lShoe.setPrice(price);
        lShoe.setSize(size);
        return lShoe;
    }

    /**
     * Helper to create the bag from parameters
     * 
     * @param code        product code for this bag
     * @param description description for this bag
     * @param price       price for this bag
     * @param type        type for this bag
     * @return the Bag created
     */
    private static Bag createBag(String code, String description, double price, String type) {
        Bag lBag = new Bag();
        lBag.setCode(code);
        lBag.setDescription(description);
        lBag.setPrice(price);
        lBag.setType(type);
        return lBag;
    }
}
