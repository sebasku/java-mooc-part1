
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared){
        int apartmentPrice = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        if(apartmentPrice > comparedPrice){
            return apartmentPrice - comparedPrice;
        } else {
            return comparedPrice - apartmentPrice;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int apartmentPrice = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        if(apartmentPrice > comparedPrice){
            return true;
        } else {
            return false;
        }
    }
}
