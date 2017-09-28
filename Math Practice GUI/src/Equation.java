import java.math.*;

public class Equation {

private int firstNum, secondNum, remainder, answer;


public Equation(int firstNum, int secondNum)
{
	this.firstNum = Math.max(firstNum, secondNum);
	this.secondNum = Math.min(firstNum, secondNum);
}


public int getFirstNum()
{
	return firstNum;
}

public String getFirstNumStr()
{
	return Integer.toString(firstNum);
}

public int getsecondNum()
{
	return secondNum;
}

public String getsecondNumStr()
{
	return Integer.toString(secondNum);
}

public String getAnswerStr()
{
	return Integer.toString(answer);
}

public int add()
{
	return answer = Math.addExact(firstNum, secondNum);
}

public int subtract()
{
	return answer = Math.subtractExact(firstNum, secondNum);
}

public int multiply()
{
	return answer = Math.multiplyExact(firstNum, secondNum);
}

public int divide()
{
	remainder = firstNum % secondNum;
	return answer = firstNum / secondNum;
}


}//end class

