
class fooditeam{
                  int iteam_id;    // private = direct koi change ne kar paye 
                  String iteam_name;
                  double price;
                  int quantity;

                fooditeam(int iteam_id,String iteam_name,double price,int quantity){   //fooditeam = constructor
                                this.iteam_id=iteam_id;
                                this.iteam_name=iteam_name;  // this = current class ka reference variable hai, isse hum current class ke members ko refer kar sakte hai
                                this.price=price;
                                this.quantity=quantity;  

                }
                double calculateAmount(){
                                return  price*quantity;

                }
                void displayiteamdetails(){ // void = method does not return any value
                                System.out.println("iteam_id:"+iteam_id);
                                System.out.println("iteam_name:"+iteam_name);
                                System.out.println("price:"+price);
                                System.out.println("quantity:"+quantity);
                                System.out.println("total amount:"+calculateAmount());



                }

}
class customer{
                int customer_id;
                String customer_name;
                String customer_address;
                String customer_number;

                customer(int customer_id, String customer_name, String customer_address, String customer_number){
                                this.customer_id=customer_id;
                                this.customer_name=customer_name;
                                this.customer_address=customer_address;
                                this.customer_number=customer_number;

                }
                void displaycustomerDetails(){
                                System.out.println("customer_id:"+customer_id);
                                System.out.println("customer_name:"+customer_name);
                                System.out.println("customer_address:"+customer_address);
                                System.out.println("customer_number:"+customer_number);

                }
}
class order{
                int order_id;
                String order_date;
                String order_iteam;
                int customer_id;
                int quantity;
                double total_Amount;
                order(int order_id, String order_date, String order_iteam, int customer_id, int quantity,double total_Amount){
                                this.order_id=order_id;
                                this.order_date=order_date;
                                this.order_iteam=order_iteam;
                                this.customer_id=customer_id;
                                this.quantity=quantity;
                                this.total_Amount=total_Amount;

                }
                void displayorderiteam(){
                                System.out.println("order_id:"+order_id);
                                System.out.println("order_date:"+order_date);
                                System.out.println("order_iteam:"+order_iteam);
                                System.out.println("customer_id:"+customer_id);
                                System.out.println("quantity:"+quantity);
                                System.out.println("total_Amount:"+total_Amount);

                }

}

public class onlinefooddelivery{
public static void main(String args[]){
                customer c1 = new customer(101,"Arnav yadav","nodia","9023124536");
                customer c2 = new customer(102,"Arpit Agarwal","delhi","9045346789");
                fooditeam f1 = new fooditeam(1,"pizza",100,1);
                fooditeam f2 = new fooditeam(2,"burger",50,2);
                fooditeam f3 = new fooditeam(3,"pasta",80,1);
                fooditeam f4 = new fooditeam(4,"sandwich",40,3);
                double total_Amount = 0;
                System.out.println("order complete ");
                c1.displaycustomerDetails();

                f1.displayiteamdetails();
                f2.displayiteamdetails();
                f3.displayiteamdetails();
                f4.displayiteamdetails();
                total_Amount = f1.calculateAmount()+f2.calculateAmount()+f3.calculateAmount()+f4.calculateAmount();
                System.out.println("total_Amount:"+total_Amount);

}
}