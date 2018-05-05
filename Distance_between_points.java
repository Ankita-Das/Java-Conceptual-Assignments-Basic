
class D2Point{
    double x,y;
    //for calculating distance between points on a plane
    D2Point(){
        x=0.0;
        y=0.0;
    }
    
    D2Point(double nx,double ny){
        x=nx;
        y=ny;
        System.out.println("Constructor of D2Point");
    }
    
    double distance(D2Point b){
        double dist;
        double x_diff,y_diff;
        x_diff=(x-b.x)*(x-b.x);
        y_diff=(y-b.y)*(y-b.y);
        dist=Math.sqrt(x_diff+y_diff);
        System.out.println("Distance between points a and b as inside distance function:"+dist);
        return dist;
    }
}

public class D3Point extends D2Point{
    //for calculating distance between points in space
    double z;
    
    D3Point(){  //default constructor
        super();
        z=0.0;
    }
    
    D3Point(double x,double y,double z){
        super(x,y);
        this.z=z;
        System.out.println("Parameterized Constructor for initializing the 3 variables x,y,z");
    }
    
    double distance3d(D3Point b){
        D2Point b1=new D2Point(b.x,b.y);//if this executes we understand objects of child can directly refer to parent classes variables
        double plane_dist,sq_pl,r,space_dist;
        plane_dist=super.distance(b1);
        sq_pl=plane_dist*plane_dist;
        r=sq_pl+((z-b.z)*(z-b.z));
        space_dist=Math.sqrt(r);
        return space_dist;
        
    }
    

     public static void main(String []args){
        D2Point p1=new D2Point();
        D2Point p2=new D2Point(3,4);
        double distance=p1.distance(p2);
        System.out.println("Calculated distance:"+distance);
        
        double sp_dist;
        D3Point p3=new D3Point();
        D3Point p4=new D3Point(3,4,5);
        sp_dist=p3.distance3d(p4);
        System.out.println("Spatial distance:"+sp_dist);
     }
}
