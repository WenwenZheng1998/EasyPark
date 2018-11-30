/**
A simple class for wrapping primitive double as objects
@author Martin O'Reilly (based on class by Rob Miller)
@version 07 October 2012

For a more complete version of this class look in the java documentation at
the Double class.
*/

public class DecimalNumber {
  // Private variable to store value of DecimalNumber
  private double value;

  /**
  Creates a new DecimalNumber with a default value of 0
  */
  public DecimalNumber () {
    this.value = 0;
  } 
  /**
  Creates a new DecimalNumber with the supplied double value
  */
  public DecimalNumber (double initialValue) {
    this.value = initialValue;
  } 
  
  /**
     The copy constructor - creates a new DecimalNumber that is a copy of
     an existing DecimalNumber
  */
  public DecimalNumber (DecimalNumber other) {
    this.value = other.value;
  } 
  

  /**
  Gets the value of the DecimalNumber
  */
  public double getValue () {
    return this.value;
  }
  
  /**
  Sets the value of the DecimalNumber
  */
  public void setValue (double newValue) {
    this.value = newValue;
  }

  /**
  Converts the value of the DecimalNumber to a string
  */
  public String toString () {
    return String.valueOf(this.value);
  }

  /** Checks if the DecimalNumber is equal to another supplied DecimalNumber
  */
  public boolean equals (DecimalNumber otherDecimalNumber) {
    return this.value == otherDecimalNumber.value;
  }
}
