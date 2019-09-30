//implementation of a stack in the form of a singly-linked list

public class LinkedListStack
{
	
	private String word; 				//to store the string data
	private LinkedListStack nextLink;	//link to the next link
	private LinkedListStack topLink;	//link to the head of the stack
	private LinkedListStack newLink;	//new link that is created during a push
	
	public void push(String toAdd)			
	{
		newLink = new LinkedListStack();
		newLink.word = toAdd;
		if(topLink != null)					//if topLink == null, than the stack was previously empty. If topLink != null, 
											//then newLink creates a link to the head of the stack
			newLink.nextLink = topLink;
		topLink = newLink;					//this new link becomes the new head of the stack
	}
	
	public void pop()
	{
		if(topLink != null && topLink.nextLink != null)		//if more than two nodes, the new head becomes the nextLink of topLink
		{
			topLink = topLink.nextLink;
		}	
		else if(topLink == null)							//if no topLink, the stack is empty. Error message returned
		{
			System.out.println("Error: stack empty");
		}
		else												//if only one node, the head is removed and the stack becomes empty
		{
			topLink = null;
		}
			
	}
	
	public String peek()									//returns the value of the word at the head of the stack
	{
		if(topLink == null)
			return("Error: stack empty");
		return(topLink.word);
	}
	
	public void print()										//iterates through the stack, popping values along the way until the stack is empty
	{
		while(topLink != null)
		{
			System.out.println(topLink.word);
			pop();
		}
	}
}
