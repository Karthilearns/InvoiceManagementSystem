import java.util.*;

public class Main {



    public static void main(String args[])
    {
        Operations operations = new Operations();

        operations.addProduct(new Product("watch",200));
        operations.addProduct(new Product("show",2000));
        operations.addProduct(new Product("jerkin",500));
        operations.addProduct(new Product("belt",2789));
        operations.addProduct(new Product("sunglass",1000));

        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        int userCount=0;
        User user =null;
        while(choice==1|| choice==2|| choice==3|| choice==4||choice==5|| choice==6|| choice==7)
        {
            System.out.println("1 - creating a new user");
            System.out.println("2 - purchasing a product");
            System.out.println("3 - switching between users");
            System.out.println("4 -  invoices of a particular user");
            System.out.println("5 -  invoices of a all user");
            System.out.println("6 -  details of a particular user");
            System.out.println("7 -  details of a all user");
            System.out.println("enter choice");
            choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("enter name");
                    String name = scanner.next();
                    String phoneNumber = scanner.next();
                    user = new User(++userCount,name,phoneNumber);
                    operations.addUser(user);
                    System.out.println("YOUR USER ID IS "+userCount);
                    break;
                case 2:
                    System.out.println("enter product for purchase");
                    List<Product> products = operations.getAllProducts();
                    Hashtable<Integer,Product> productHashtable = new Hashtable<>();
                    int productDisplayNumber = 0;
                    for(Product p:products)
                    {
                        productHashtable.put(++productDisplayNumber,p);
                    }
                    for(Map.Entry<Integer,Product>p : productHashtable.entrySet())
                    {
                        System.out.println(p.getKey()+"  "+p.getValue());
                    }
                    int productChoice = scanner.nextInt();
                    System.out.println("enter quantity");
                    int productQuantity = scanner.nextInt();
                    Product customerProduct = productHashtable.get(productChoice);
                    Invoice invoice = new Invoice(customerProduct.getProduct_name(),productQuantity,customerProduct.getProduct_price(),customerProduct.getProduct_price()* productQuantity);
                    operations.addInvoice(invoice);
                    user.addInvoice(invoice);
                    break;

                case 3:
                    System.out.println("Enter the customer id");
                    int userid = scanner.nextInt();
                    user = operations.getUserByUserId(userid);
                    if(user==null)
                    {
                        System.out.println("user not found");
                        return;
                    }
                    System.out.println("user switched to user "+userid);
                    break;

                case 4:
                    System.out.println("enter user id");
                    int userId = scanner.nextInt();
                    user = operations.getUserByUserId(userId);
                    List<Invoice> allInvoicesOfUser = operations.getAllInvoices(user);
                    for(Invoice i:allInvoicesOfUser)
                    {
                        System.out.println(i.toString());
                    }
                    break;

                case 5:
                    List<Invoice> invoiceList = operations.getAllInvoices();
                    for(Invoice i:invoiceList)
                    {
                        System.out.println(i.toString());
                    }
                    break;
                case 6:
                    List<User> userList = operations.getUsers();
                    for(User u:userList)
                    {
                        System.out.println(u.toString());
                    }
                    break;

                case 7:
                    System.out.println("Enter the customer id");
                    int userIds= scanner.nextInt();
                    User userForPrint = operations.getUserByUserId(userIds);
                    System.out.println(userForPrint.toString());

            }
        }


    }
}
