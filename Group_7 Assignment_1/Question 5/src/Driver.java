//driver function of the singly-linked stack implementation

public class Driver
{
	public static void main(String[] args)
	{
		
		LinkedListStack theStack = new LinkedListStack(); 	//creates a new stack
		ArrOfData theData = new ArrOfData();			  	//to import the data used for the stack
		String[] data = theData.getData();					//the data used for the stack is initialized to data[]
		
		for(int i = 0; i < data.length; i++)			//iterate through the data
		{
			switch(data[i])								
			{
				case "POP":											//if the string is pop, the head of the stack is removed
					theStack.pop();								
					//System.out.println(theStack.peek());
					break;
				case "INSERT":										//values are inserted only after the INSERT instruction, and continue to be inserted
																	//until another instruction (POP or INSERT) is found.
					i++;											//i is incremented in order to not push the word "INSERT"
					while(!(data[i].equals("POP") || data[i].equals("INSERT")) && i < data.length) //iterates until another instruction, or end of the list
					{
						theStack.push(data[i]);
						i++;
					}
					i--;											//i is decremented in order to capture the terminating value				
					break;	
				case "PRINT":										//to print the stack
					theStack.print();
					break;
			}
			
		}
		System.out.println(theStack.peek());	//to show top of stack after instructions are performed
	}
}
