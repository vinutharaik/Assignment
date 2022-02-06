package deleteelement;

import java.util.Scanner;

public class DeleteElement {
	public static void deleteElement(int arr[], int ele) 
	{
		int temp;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==ele) {
				for(int j=i;j<arr.length-1;j++) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				break;

			
				
			}
			
		}
		for (int i = 0; i < arr.length-1; i++) {
		System.out.println(arr[i]);
			
		}
		}
	public static void main(String[] args) {
		Scanner  scanner=new Scanner(System.in);
	
		System.out.println("Enter the number of element to be inserted");
		int num=scanner.nextInt();
		System.out.println("Enter the all the element");
		int arr[]=new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		
	
		System.out.println("Enter the element to be deleted");
		int n=scanner.nextInt();
		DeleteElement.deleteElement(arr, n);
	}
	}
