class Triangle{
  int sideOne;
  int sideTwo;
  int sideThree;


  public Triangle(int side1, int side2, int side3) {
    sideOne = side1;
    sideTwo = side2;
    sideThree = side3;
  }

  public boolean isEquilateral() {
    if (sideOne == sideTwo && sideTwo == sideThree) {
      return true;
    }
    return false;
  }

  public boolean isValid() {
    if ((sideOne + sideTwo < sideThree) || (sideOne + sideThree < sideTwo) || (sideTwo + sideThree < sideOne)){
      return false;
    }
    return true;
  }

  public String type(){
    if (isValid()){
      if (sideOne == sideTwo && sideTwo == sideThree){
        return "Equilateral";
      } else if ((sideOne == sideTwo && sideTwo != sideThree) || (sideOne == sideThree && sideTwo != sideThree) || (sideTwo == sideThree && sideOne != sideThree)){
        return "Isosceles";
      }
      return "Scalene";
    }
    return "Not a valid triangle";
  }
}
