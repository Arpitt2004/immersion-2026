class fooditeam{
                int iteam_id;
                String iteam_name;
                double price;
                fooditeam(int iteam_id,String iteam_name,double price){
                                this.iteam_id=iteam_id;
                                this.iteam_name=iteam_name;
                                this.price=price;

                }
                double calculateAmount(int quantity){
                                return  price*quantity;

                }
                void displayiteamdetails(){
                                System.out.println("iteam_id:"+iteam_id);
                                System.out.println("iteam_name:"+iteam_name);
                                System.out.println("price:"+price);
                                System.out.println("total amount:"+calculateAmount(2));
                                System.out.println("quantity":+quantity);



                }

}
class customer{
                int customer_id;
                String customer_name;
                String customer_adderes;
                String customer_number;

}
class order{
                int order_id;
                String order_date;
                String order_iteam;
                int customer_id;
                int quantity;
                double total_Amount;
                order(int order_id, Stirng order_date, String order_iteam, itn customer_id, int quantoioty,double total_Amount){
                                this.order_id=order_id;
                                this.order_date=order_date;
                                this.order_iteam=orer_iteam;
                                this.customer_id=customer_id;
                                this.quantity=quantity;
                                this.total_Amount=total_Amount;

                }
                void displayorderiteam(){
                                System.out.println("order_id":+order_id);
                                System.out.println(order_date:+order_date);
                                System.out.println("order_iteam":+order_iteam);
                                

                }

}