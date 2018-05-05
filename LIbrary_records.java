class Library{
    String name;
    String authorName;
    double p;
    
    Library(){
        name="Not Given";
        authorName="Not Given";
        p=100.0;
    }
    
    Library(String name,String authorName,double p){
        this.name=name;
        this.authorName=authorName;
        this.p=p;
        System.out.println("Variables initialized through parameterised constructor!");
    }
    
    void show(){
        System.out.println("Book Details!");
        System.out.println("Name:"+this.name);
        System.out.println("AuthorName:"+this.authorName);
        System.out.println("Price :"+this.p);
    }
}

public class Compute extends Library{
    
    int d;
    double f;
    
    Compute(String n1,String a1,double p1,int d1){
        super(n1,a1,p1);
        d=d1;
        f=0.0;
        
    }
    
    void fine(){
        int e=d-7;
        if(1<=e && e<=5){
            f=e*2.0;
        }
        else if(6<=e && e<=10){
            f=e*3.0;
        }
        else if(e>10){
            f=e*10.0;
        }
        else{
            System.out.println("Not a valid excess!");
        }
    }
    
    void display(){
        double tot;
        super.show();
        System.out.println("Entering the display function of Compute");
        System.out.println("Name of the book called by using super as object:"+super.name);
        //System.out.println("Name of book given from parameter:"+n1);
        System.out.println("No of days:"+d);
        fine();
        tot=(0.02*p)+f;
        System.out.println("Calculated fine:"+f);
        System.out.println("Total amount to be paid:"+tot);
    }

     public static void main(String []args){
        System.out.println("Hello World");
        Library ob=new Library();
        ob.show();
        Library ob1=new Library("Twilight","Stephenie Meyer",500);
        ob1.show();
        Compute b1=new Compute("Da Vinci Code","Dan Brown",700.5,15);
        b1.display();
     }
}
