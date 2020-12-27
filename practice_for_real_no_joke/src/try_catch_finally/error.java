package try_catch_finally;

import java.util.zip.ZipError;

public class error {
	int dino;
	int lol=2;
public void setDenominator(int d) throws ZeroDenominatorException{
	ZeroDenominatorException e=new ZeroDenominatorException();
		try {
			if(d==0) {
			throw e;
		}
	}

	catch(ZeroDenominatorException t) {
		System.err.println(t);
	}

//public void print() {
//	System.err.println("denominator is "+dino);
//}
}

}
