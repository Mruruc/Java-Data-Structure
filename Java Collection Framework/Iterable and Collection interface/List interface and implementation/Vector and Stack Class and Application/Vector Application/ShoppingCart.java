package Java_Collections;
import java.util.Vector;
public class ShoppingCart {
    private Vector<String> items;
    public ShoppingCart(){
        this.items=new Vector<>();
    }
    public void addItem(String str){
        items.addElement(str);
    }

    public void removeItem(int index){
        items.remove(index);
    }
    public void numbersOfItem(){
        items.size();
    }
    public void clearCard(){
        items.clear();
    }
    public void getItem(int index){
        items.get(index);
    }
    public void showCard(){
        if(items.isEmpty()){
            System.out.println("Your card empty !");
        }
        else{
            System.out.println("Your shopping cart:");
            for(String item:items){
                System.out.println(items);
            }
        }
    }
}
