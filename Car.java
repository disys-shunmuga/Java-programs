
class Types{ 
	void Cost(){
		System.out.println("The cost of car differ from  7,00,000 to 15,00,000");
	} 
}  
class Mahindra extends Types{
	void Cost(){
		System.out.println("The cost of Mahindra car is : 7,00,000");
	} 
}  
class Renault extends Types{  
	void Cost(){
		System.out.println("The cost of Renault car is : 10,00,000");
	} 
}  
class Suzuki extends Types{  
	void Cost(){
		System.out.println("The cost of Suzuki car is : 5,00,000");
	} 
}  
class Car{  
public static void main(String args[]){  
Types T;  
//T.Cost();
T =new Mahindra();  
T.Cost() ;
T =new Renault();  
T.Cost();
T =new Suzuki();  
T.Cost();
}  
}  