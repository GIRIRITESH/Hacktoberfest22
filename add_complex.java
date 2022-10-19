//create a class 

class complex{
	double real;
	double imag;
	complex(){
		real = imag = 0;
	}
	complex (double r, double i){
		real = r;
		imag = i;
	}
	complex sum (complex A, complex B){
		complex temp = new complex();
		temp.real = A.real + B.real;
		temp.imag = A.imag + B.imag;
		return temp;
	}
	void show()
	{
		System.out.println(real+ "+j" +imag);
	}
}
class add_complex{
	public static void main(String args[]){
		complex c1 = new complex(2.0, 5.0);
		complex c2 = new complex(3.0, 5.0);
		complex c3 = c1.sum(c1, c2);
		System.out.println("\n\n c1 = ");
		c1.show();
		System.out.println("c2 = ");
		c2.show();
		//add two complex numbers
		System.out.println("Sum = ");
		c3.show();
	}
}
