public class Demo_2{
    public static void main(String[] args) {
        String[] names = {"Ramesh", "Mahesh", "Suresh", "Mukesh", "Dinesh"};
        int[] marks = {43, 89, 72, 28, 56};

        for(int i=0;i<5;i++){
            // System.out.println(names[i]+":"+marks[i]);
        if(marks[i] >= 85){
            System.out.println(names[i]+" has grade A");
        } else if(marks[i] >=60){
            System.out.println(names[i]+" has grade B");
        } else if(marks[i] >=40){
            System.out.println(names[i]+" has grade C");
        } else {
            System.out.println(names[i]+" has grade D");
        }        
    }


    }
}