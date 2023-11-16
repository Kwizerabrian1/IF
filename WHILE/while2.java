public class while2 {
public static void main(String[] args){
int row=1;
int maxrows=5;
while (row<=maxrows){
int column=1;
while(column<=row){
System.out.print("*");
column++;
}
System.out.println();
row++;
}
}
}